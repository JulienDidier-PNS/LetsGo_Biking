/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.soc.testwsclient;


import com.soap.ws.client.generated.*;

import java.time.Duration;
import java.util.*;

import org.apache.activemq.ConnectionFailedException;
import org.json.JSONArray;

/**
 *
 * @author franc
 */
public class Client_Main {
    private static final String NEWITINERARY_EXCEPTION = "NEW ITINERARY REQUIERT";
    private static final String QUEUE_EMPTY_EXCEPTION = "QUEUE_EMPTY";
    private static boolean startOK = false;

    //Adresses avec statiosn possibles
    public static String STARTADRESS_WORKING = "toulouse musée des augustins";
    public static String ENDADRESS_WORKING = "Mairie De Cerisy amiens";

    //Adresses sans stations
    public static String STARTADRESS_NOSTATION = "2 avenue pythagore valbonne";


    //TYPE DE CHOIX
    public static final String SHORTEST_DISTANCE = "SHORTEST_DISTANCE";
    public static final String SHORTEST_TIME = "SHORTEST_TIME";
    public static final String BICYCLE = "BICYCLE";
    public static final String PEDESTRIAN = "PEDESTRIAN";

    public static void main(String[] args) throws Exception {
        boolean activeMQOK = true;
        Places finalStart = null;
        Places finalEnd = null;
        while (finalStart == null) {
            finalStart = requestAdress();
        }
        while (finalEnd == null) {
            finalEnd = requestAdress();
        }


        String idItinerary = null;
        //QUEL TYPE DE TRAJET ?
        String parameter = itineraryParameter();
        idItinerary = firstTimeItinerary(parameter,finalStart,finalEnd,activeMQOK);

        if (idItinerary == null) {System.out.println("Quelque chose s'est mal passé côté serveur");}

        showTrajectInformation(finalStart, finalEnd, idItinerary);
        GeoCoordinate currentPosition = new GeoCoordinate();
        int userInputFinal = -1;
        if (activeMQOK) {
            boolean trajectFinish = false;
            //ON EMULE LA POSITION ACTUELLE
            boolean firstTime = false;
            boolean itineraryFromServer = false;
            //TANT QUE LE TRAJET N'EST PAS TERMINER
            while (!trajectFinish) {
                if (!firstTime) {
                    firstTime = true;
                } else {
                    System.out.println("Choose an action :\n" + "1 : Emulate position changes\n2: continue steps");
                    userInputFinal = -1;
                    while (true) {
                        try {
                            String userInput = new Scanner(System.in).nextLine();
                            userInputFinal = Integer.parseInt(userInput);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Mauvaise entrée !");
                        }
                    }
                    //SI ON CHOISIT UNE SIMULATION DE CHANGEMENT DE COORDONEES
                    if (userInputFinal == 1) {
                        ItineraryService client = new ItineraryService();
                        IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();

                        GeoCoordinate endCoordinates = finalEnd.getFinalCoordinate().getValue();
                        //ON RECALCUL L'ITINERAIRE
                        Random r = new Random();
                        currentPosition.setLongitude(generateRandomOffset(currentPosition.getLongitude()));
                        currentPosition.setLatitude(generateRandomOffset(currentPosition.getLatitude()));
                        idItinerary = recomputeItinerary(parameter,currentPosition,endCoordinates,activeMQOK);
                    }
                }
                //ON AFFICHE LE ETAPES TANT QUE LA QUEUE N'EST PAS VIDE
                try {
                    showStepsByQueue(idItinerary, currentPosition);
                } catch (Exception e) {
                    //SI LA PILE EST VIDE, ON DIT QUE LE TRAJET EST TERMINE
                    if (e.getMessage().contains(QUEUE_EMPTY_EXCEPTION)) {
                        trajectFinish = true;
                        System.out.println("TRAJET TERMINE !!");
                        return ;
                    }
                    if (e.getMessage().contains("org.apache.activemq.ConnectionFailedException")) {
                        System.out.println("Connexion à actievMQ intérompue ! \n Continuation en lien direct avec le serveur");
                        itineraryFromServer = true;
                    }
                }

                if (itineraryFromServer) {
                    showInstructionOffline(idItinerary, currentPosition, finalEnd.getFinalCoordinate().getValue());
                    break;
                }
            }
            System.out.println("Appuyez sur un touche pour quitter !");
            new Scanner(System.in).nextLine();
            return;
        }
        else {
            boolean trajectOver = false;
            boolean firstTime = false;

            while (!trajectOver) {
                if (!firstTime) {firstTime = true;}
                else {
                    System.out.println("Choose an action :\n" + "1 : Emulate position changes\n2: continue steps");
                    userInputFinal = -1;
                    while (true) {
                        try {
                            String userInput = new Scanner(System.in).nextLine();
                            userInputFinal = Integer.parseInt(userInput);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Mauvaise entrée !");
                        }
                    }
                    //SI ON CHOISIT UNE SIMULATION DE CHANGEMENT DE COORDONEES
                    if (userInputFinal == 1) {
                        ItineraryService client = new ItineraryService();
                        IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();

                        GeoCoordinate endCoordinates = finalEnd.getFinalCoordinate().getValue();
                        //ON RECALCUL L'ITINERAIRE
                        Random r = new Random();
                        currentPosition.setLongitude(generateRandomOffset(currentPosition.getLongitude()));
                        currentPosition.setLatitude(generateRandomOffset(currentPosition.getLatitude()));
                        idItinerary = recomputeItinerary(parameter,currentPosition, endCoordinates, activeMQOK);
                    }
                }
                try{
                    showInstructionOffline(idItinerary,currentPosition,finalEnd.getFinalCoordinate().getValue());
                    trajectOver = true;
                }catch (Exception e){
                    trajectOver = true;
                }
            }
            System.out.println("TRAJET TERMINE !!");
            return ;
        }
    }

    private static String itineraryParameter() {
        System.out.println("Which type of traject ? \n" + "1 : By Walking\n2: With a bicycle\n3: Shortest itinerary in distance\n4: Shortest itinerary in time  ");
        int userInputFinal = -1;
        while (true) {
            try {
                String userInput = new Scanner(System.in).nextLine();
                userInputFinal = Integer.parseInt(userInput);
                if(userInputFinal>4 || userInputFinal<1){throw new NumberFormatException();}
                break;
            } catch (NumberFormatException e) {
                System.out.println("Mauvaise entrée !");
            }
        }
        if(userInputFinal==1){
            return PEDESTRIAN;
        }
        if(userInputFinal==2){
            return BICYCLE;
        }
        if(userInputFinal==3){
            return SHORTEST_DISTANCE;
        }
        return SHORTEST_TIME;

    }

    private static void showTrajectInformation(Places startPlace,Places endPlace,String itineraryID) {
        //REQUETE POUR AVOIR L'ITINERAIRE
        ItineraryService client = new ItineraryService();
        IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();
        Itinerary itinerary = proxyClient.getItinerary(itineraryID);

        showTypeOfTraject(itinerary);
        System.out.println("AU DEPART DE : "+startPlace.getDisplayName().getValue()+" --> "+endPlace.getDisplayName().getValue()+"\n");
        System.out.println("DUREE : "+ formatDuration(Duration.ofSeconds(itinerary.getRoutes().getValue().getRoute().get(0).getSummary().getValue().getDuration().longValue())));
        System.out.println("DISTANCE : "+ itinerary.getRoutes().getValue().getRoute().get(0).getSummary().getValue().getDistance()/1000 +" km");
        if(itinerary.getTypeOfItinerary().getValue().equals("BIKE")){
            System.out.println("On prend le vélo à "+ proxyClient.getCorrectAdressFromCooordinates(itinerary.getFirstStationPosition().getValue()));
            System.out.println("On le posera à "+ proxyClient.getCorrectAdressFromCooordinates(itinerary.getLastStationPosition().getValue()));
        }
    }

    private static void showTypeOfTraject(Itinerary itinerary){
        System.out.println("******************************************\n"+"TYPE DE TRAJET : "+itinerary.getTypeOfItinerary().getValue()+"\n******************************************\n");
    }
    private static void showInstructionOffline(String itineraryID, GeoCoordinate currentPosition, GeoCoordinate endPosition) throws RuntimeException {
        //REQUETE POUR AVOIR L'ITINERAIRE
        ItineraryService client = new ItineraryService();
        IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();
        Itinerary itinerary = proxyClient.getItinerary(itineraryID);

        //DECODAGE DES POSITIONS PAR STEPS
        JSONArray array = GeometryDecoder.decodeGeometry(itinerary.getRoutes().getValue().getRoute().get(0).getGeometry().getValue(), false);

        //ON PARCOURS l'ENTIERETE DES SEGMENTS (1 segments = un trajet entre 2 waypoint)
        for (int i=0; i < itinerary.getRoutes().getValue().getRoute().get(0).getSegments().getValue().getSegment().size(); i++) {
            Segment segment = itinerary.getRoutes().getValue().getRoute().get(0).getSegments().getValue().getSegment().get(i);
            //ON PARCOURS LES ETAPES POUR FAIRE CE SEGMENT
            for (int j=0; j < segment.getSteps().getValue().getStep().size(); j++) {
                Step step = segment.getSteps().getValue().getStep().get(j);
                System.out.println(step.getInstruction().getValue() + " during " + step.getDistance().toString() + " meters ");
                //TOUTES LES 10 ETAPES, ON REGARDE COMMENT SE DEROULE LE TRAJET
                if (j % 10 == 0 && j != 0) {
                    //ON GENERA LA POSITION ACTUELLE
                    String[] split = array.get(j).toString().split(",");
                    double lat = Double.parseDouble(split[0].replace("[", ""));
                    double lon = Double.parseDouble(split[1].replace("]", ""));
                    currentPosition = new GeoCoordinate();
                    currentPosition.setLatitude(lat);
                    currentPosition.setLatitude(lon);
                }
            }
        }
    }
    private static String getItinerary(Places start, Places end,boolean activeMQ, String transport, String computemethod) {
        ItineraryService client = new ItineraryService();
        IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();
        return proxyClient.computeItineraryWithAddress(start, end,activeMQ, transport, computemethod);
    }

    private static void showStepsByQueue(String itineraryID,GeoCoordinate currentCoordonate) throws ConnectionFailedException{
        ActiveMQConsumer.consume(itineraryID,currentCoordonate);
    }
    private static Places requestUniqueAdress(List<Places> addresses) throws Exception {
        if (addresses.size() < 0){throw new Exception("Aucune adresse a choisir !");}

        int userInputFinal=-1;
        while (true)
        {
            //affichage des choix
            int i = 0;
            for(Places address : addresses) { System.out.println("Tappez: " + i + " pour choisir cette adresse : \n" + " : " + address.getDisplayName().getValue() + '\n'); i++; }

            //lecture du choix
            String userInput;
            while (true)
            {
                //vérification sur l'input de l'utilisateur(que des int)
                userInput = new Scanner(System.in).nextLine();
                try {
                    Integer.parseInt(userInput);
                    break;
                } catch (NumberFormatException e){System.out.println("Mauvaise entrée !");}
            }
            userInputFinal = Integer.parseInt(userInput);
            //si l'input est correct, on retourne l'adresse contenue dans la case 'userInputFinal' du tableau
            if (userInputFinal < addresses.size() && userInputFinal >= 0) { return addresses.get(userInputFinal); }
        }
    }
    private static Places requestAdress() throws Exception {
        //using (ItinearyService.I_ItineraryServiceClient client = new ItinearyService.I_ItineraryServiceClient())
        //{
        if(!startOK){System.out.println("Entrez votre adresse de départ :");}
        else{System.out.println("Entrez votre adresse d'arrivée :");}

        String addressRequest = new Scanner(System.in).nextLine();

        ItineraryService client = new ItineraryService();
        IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();

        ArrayOfPlaces addressesTask = proxyClient.getCorrectAdress(addressRequest);

        Places toReturn;

        //si plusieurs adresses trouvées
        if (addressesTask.getPlaces().size() > 1)
        {
            System.out.println("Plusieurs adresses trouvées ! Veuillez en choisir une : \n");
            toReturn = requestUniqueAdress(addressesTask.getPlaces());
        }
        //la bonne adresse est trouvée
        else if (addressesTask.getPlaces().size() == 1)
        {
            System.out.println("Adresse trouvée !");
            toReturn = addressesTask.getPlaces().get(0);
        }
        else
        {
            System.out.println("Aucune adresse n'a été trouvée !");
            return null;
        }
        if(!startOK){startOK=true;}
        return toReturn;
    }
    private static double generateRandomOffset(double initialValue) {
        // Créer un objet Random
        Random random = new Random();

        // Générer un offset aléatoire entre -0.01 et 0.01 (à ajuster selon vos besoins)
        double offset = (random.nextDouble() - 0.5) * 0.02;

        // Appliquer l'offset à la valeur initiale
        return initialValue + offset;
    }


    private static String firstTimeItinerary(String parameter, Places finalStart, Places finalEnd, boolean activeMQOK){
        String idItinerary="";
        if(parameter.equals(SHORTEST_DISTANCE)){
            idItinerary = getItinerary(finalStart, finalEnd, activeMQOK,null,parameter);
        } else if (parameter.equals(SHORTEST_TIME)) {
            idItinerary = getItinerary(finalStart, finalEnd, activeMQOK,null,parameter);
        } else if (parameter.equals(BICYCLE)) {
            idItinerary = getItinerary(finalStart, finalEnd, activeMQOK,parameter,null);
        } else if (parameter.equals(PEDESTRIAN)) {
            idItinerary = getItinerary(finalStart, finalEnd, activeMQOK,parameter,null);
        }
        return idItinerary;
    }

    private static String recomputeItinerary(String parameter, GeoCoordinate finalStart, GeoCoordinate finalEnd, boolean activeMQOK){
        ItineraryService client = new ItineraryService();
        IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();

        String idItinerary="";
        if(parameter.equals(SHORTEST_DISTANCE)){
            idItinerary = proxyClient.computeItineraryWithGeoCoordinates(finalStart, finalEnd, activeMQOK,null,parameter);
        } else if (parameter.equals(SHORTEST_TIME)) {
            idItinerary = proxyClient.computeItineraryWithGeoCoordinates(finalStart, finalEnd, activeMQOK,null,parameter);
        } else if (parameter.equals(BICYCLE)) {
            idItinerary = proxyClient.computeItineraryWithGeoCoordinates(finalStart, finalEnd, activeMQOK,parameter,null);
        } else if (parameter.equals(PEDESTRIAN)) {
            idItinerary = proxyClient.computeItineraryWithGeoCoordinates(finalStart, finalEnd, activeMQOK,parameter,null);
        }
        return idItinerary;
    }

    public static String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }

}
