/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.soc.testwsclient;


import com.soap.ws.client.generated.*;

import java.util.*;
import javax.jms.JMSException;

import org.apache.activemq.ConnectionFailedException;
import org.json.JSONArray;

/**
 *
 * @author franc
 */
public class TestWSclient {
    private static final String NEWITINERARY_EXCEPTION = "NEW ITINERARY REQUIERT";
    private static final String QUEUE_EMPTY_EXCEPTION = "QUEUE_EMPTY";
    private static boolean startOK = false;

    //Adresses avec statiosn possibles
    public static String STARTADRESS_WORKING = "toulouse musée des augustins";
    public static String ENDADRESS_WORKING = "Mairie De Cerisy amiens";

    //Adresses sans stations
    public static String STARTADRESS_NOSTATION = "2 avenue pythagore valbonne";

    public static void main(String[] args) throws Exception {
        boolean activeMQOK = false;
        if(activeMQOK){
            Places finalStart = null;
            Places finalEnd = null;
            while (finalStart == null) {finalStart = requestAdress();}
            while (finalEnd == null) {finalEnd = requestAdress();}

            String idItinerary = getItinerary(finalStart, finalEnd,activeMQOK);
            if (idItinerary == null) {
                System.out.println("Quelque chose s'est mal passé côté serveur");
            } else {
                boolean trajectFinish = false;
                //ON EMULE LA POSITION ACTUELLE
                GeoCoordinate currentPosition = new GeoCoordinate();

                boolean firstTime = false;
                boolean itineraryFromServer = false;

                //TANT QUE LE TRAJET N'EST PAS TERMINER
                while (!trajectFinish) {
                    if (!firstTime) {
                        firstTime = true;
                    } else {
                        System.out.println("Choose an action :\n" + "1 : Emulate position changes\n2: continue steps");
                        int userInputFinal = -1;
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
                            idItinerary = proxyClient.computeItineraryWithGeoCoordinates(currentPosition, endCoordinates,activeMQOK);
                        }
                    }
                    //ON AFFICHE LE ETAPES TANT QUE LA QUEUE N'EST PAS VIDE
                    try {
                        showStepsByQueue(idItinerary, currentPosition);
                    }
                    catch(JMSException e) {
                        //SI LA PILE EST VIDE, ON DIT QUE LE TRAJET EST TERMINE
                        if (e.getMessage().contains(QUEUE_EMPTY_EXCEPTION)) {
                            trajectFinish = true;
                            System.out.println("TRAJET TERMINE !");
                        }
                        if(e.getMessage().contains("org.apache.activemq.ConnectionFailedException")){
                            System.out.println("Connexion à actievMQ intérompue ! \n Continuation en lien direct avec le serveur");
                            itineraryFromServer = true;
                        }
                    }

                    if(itineraryFromServer){
                        showInstructionOffline(idItinerary, currentPosition);break;}
                }
            }
            System.out.println("Appuyez sur un touche pour quitter !");
            new Scanner(System.in).nextLine();
    }
        else{
            Places finalStart = null;
            Places finalEnd = null;
            while (finalStart == null) {finalStart = requestAdress();}
            while (finalEnd == null) {finalEnd = requestAdress();}
            String idItinerary = getItinerary(finalStart, finalEnd,activeMQOK);

            //ON EMULE LA POSITION ACTUELLE
            showInstructionOffline(idItinerary,null);
        }
    }

    private static void showInstructionOffline(String itineraryID, GeoCoordinate currentPosition) throws RuntimeException {
        //REQUETE POUR AVOIR L'ITINERAIRE
        ItineraryService client = new ItineraryService();
        IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();
        Itinerary itinerary = proxyClient.getItinerary(itineraryID);

        //DECODAGE DES POSITIONS PAR STEPS
        JSONArray array = GeometryDecoder.decodeGeometry(itinerary.getRoutes().getValue().getRoute().get(0).getGeometry().getValue(),false);

        GeoCoordinate searching = new GeoCoordinate();

        int positionInItinerary = 0;
        for(Object obj : array)
        {
            String[] split = obj.toString().split(",");
            double lat = Double.parseDouble(split[0].replace("[",""));
            double lon = Double.parseDouble(split[1].replace("]",""));
            searching.setLatitude(lat);
            searching.setLatitude(lon);
            if(currentPosition==null){
                currentPosition = new GeoCoordinate();
                currentPosition.setLatitude(searching.getLatitude());
                currentPosition.setLongitude(searching.getLongitude());
                break;
            } else if (currentPosition.getLatitude().equals(searching.getLatitude()) && currentPosition.getLongitude().equals(searching.getLongitude())) {break;}

            positionInItinerary++;
        }

        //SERT SEULEMENT A PARCOURIR LES ETAPES POUR SAVOIR OU NOUS EN SOMMES DANS L'ITINERAIRE
        int postionToCurrentItinerary = 0;
        int i=0;
        int j=0;

        //ON PARCOURS l'ENTIERETE DES SEGMENTS (1 segments = un trajet entre 2 waypoint)
        for (i=0;i<itinerary.getRoutes().getValue().getRoute().get(0).getSegments().getValue().getSegment().size();i++) {
            boolean capteur = false;
            Segment segment = itinerary.getRoutes().getValue().getRoute().get(0).getSegments().getValue().getSegment().get(i);
            //ON PARCOURS LES ETAPES POUR FAIRE CE SEGMENT
            for (j=0;j<segment.getSteps().getValue().getStep().size();j++) {
                if(postionToCurrentItinerary==positionInItinerary){capteur=true;break;}
                postionToCurrentItinerary++;
            }
            if(capteur){break;}
        }

        //ON PARCOURS l'ENTIERETE DES SEGMENTS (1 segments = un trajet entre 2 waypoint)
        for (;i<itinerary.getRoutes().getValue().getRoute().get(0).getSegments().getValue().getSegment().size();i++) {
            Segment segment = itinerary.getRoutes().getValue().getRoute().get(0).getSegments().getValue().getSegment().get(i);
            //ON PARCOURS LES ETAPES POUR FAIRE CE SEGMENT
            for (;j<segment.getSteps().getValue().getStep().size();j++) {
                Step step = segment.getSteps().getValue().getStep().get(j);

                System.out.println(step.getInstruction().getValue() + " during " + step.getDistance().toString() + " meters ");

                //TOUTES LES 10 ETAPES, ON REGARDE COMMENT SE DEROULE LE TRAJET
                if(j%10==0 && j!=0) {
                    //ON GENERA LA POSITION ACTUELLE
                    String[] split = array.get(j).toString().split(",");
                    double lat = Double.parseDouble(split[0].replace("[",""));
                    double lon = Double.parseDouble(split[1].replace("]",""));
                    currentPosition = new GeoCoordinate();
                    currentPosition.setLatitude(lat);
                    currentPosition.setLatitude(lon);

                    System.out.println("Choisir une action :" + "\n" + "1 : Emulation Changement de coordonées" + "\n" + "2 : passer aux prochaines étapes");
                    int userInputFinal = -1;
                    while(true) {
                        try {
                            String userInput = new Scanner(System.in).nextLine();
                            userInputFinal = Integer.parseInt(userInput);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Mauvaise entrée !");
                        }
                    }
                    if(userInputFinal==1){throw new RuntimeException(NEWITINERARY_EXCEPTION);}
                }
            }
            j=0;
        }
        System.out.println("Trajet terminé !");
        return;
    }
    private static String getItinerary(Places start, Places end,boolean activeMQ) {
        ItineraryService client = new ItineraryService();
        IItineraryService proxyClient = client.getBasicHttpBindingIItineraryService();
        return proxyClient.computeItineraryWithAddress(start, end,activeMQ);
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

}
