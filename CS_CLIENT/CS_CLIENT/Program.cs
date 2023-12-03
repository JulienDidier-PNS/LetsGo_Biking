using CS_CLIENT.ItinearyService;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Data;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


//TODO -> COMPRENDRE POURQUOI DEUX APPELS A LA MEME METHODE FONT PETER LE CLIENT ???


namespace CS_CLIENT
{
    internal class Client
    {
        public static string STARTADRESS_NOTWORKING = "2 avenue pythagore";
        public static string ENDADRESS_NOTWORKING = "IUT Nice fabron";

        public static string STARTADRESS_WORKING = "toulouse musée des augustins";
        public static string ENDADRESS_WORKING = "intermarché 362 rue faventines valence";

        static void Main(string[] args)
        {
                string finalStart = "";
                string finalEnd = "";
                
                //version correcte de l'adresse
                finalStart = requestStartAdress(STARTADRESS_WORKING);
                finalEnd = requestEndAdress(ENDADRESS_WORKING);

                Console.WriteLine("Adresse de depart : " + finalStart);
                Console.WriteLine("Addresse de destination : " + finalEnd);

            //a ce stade, nous avons des adresses correctes;
            //on va demander l'itinéraire méthode qui renvoie string[] -> si taille = 1, alors pb (plus rapide à pied). Sinon, liste d'étapes


            showSteps(getItinerary(finalStart,finalEnd));

            Console.WriteLine("Appuyez sur un touche pour quitter !");
                Console.ReadLine();
        }

        private static string requestUniqueAdress(string[] addresses)
        {
            if (addresses.Length < 0){throw new Exception("Aucune adresse a choisir !");}

            int userInputFinal=-1;
            while (true)
            {
                //affichage des choix
                int i = 0;
                foreach (string address in addresses) { Console.WriteLine("Tappez: " + i + " pour choisir cette adresse : \n" + " : " + address + '\n'); i++; }

                //lecture du choix
                string userInput;
                while (true)
                {
                    //vérification sur l'input de l'utilisateur
                    userInput = Console.ReadLine();
                    if(int.TryParse(userInput, out _)){break;}
                    else{Console.WriteLine("Le choix n'est pas bon !");}
                }
                userInputFinal = int.Parse(userInput);
                //si l'input est correct, on retourne l'adresse contenue dans la case 'userInputFinal' du tableau
                if (userInputFinal < addresses.Length && userInputFinal >= 0) { return addresses[userInputFinal]; }
            }
        }

        private static string requestStartAdress(string address)
        {
            //using (ItinearyService.I_ItineraryServiceClient client = new ItinearyService.I_ItineraryServiceClient())
            //{
            Console.WriteLine("Entrez votre adresse de départ :");
            string finalStart = "";
            string startInput = address;

            ItinearyService.I_ItineraryServiceClient client = new ItinearyService.I_ItineraryServiceClient();
            client.Open();
            string[] addressesTask = client.getCorrectAdress(startInput);
                //si plusieurs adresses trouvées
                if (addressesTask.Length > 1)
                {
                    Console.WriteLine("Plusieurs adresses trouvées ! Veuillez en choisir une : \n");
                    finalStart = requestUniqueAdress(addressesTask);
                }
                //la bonne adresse est trouvée
                else if (addressesTask.Length == 1)
                {
                    Console.WriteLine("Adresse trouvée !");
                    finalStart = addressesTask[0];
                }
                else
                {
                    throw new Exception("Aucune adresse n'a été trouvée !");
                }
                client.Close();
                return finalStart;

                
        }

        private static string requestEndAdress(string address)
        {
            while (true)
            {
                Console.WriteLine("Entrez votre adresse d'arrivée :");
                string endInput = address;
                ItinearyService.I_ItineraryServiceClient client = new ItinearyService.I_ItineraryServiceClient();
                client.Open();
                string[] addresses = client.getCorrectAdress(endInput);
                //si plusieurs adresses trouvées
                if (addresses.Length > 1)
                {
                    Console.WriteLine("Plusieurs adresses trouvées ! Veuillez en choisir une : \n");
                    return requestUniqueAdress(addresses);
                }
                //la bonne adresse est trouvée
                else if (addresses.Length == 1)
                {
                    Console.WriteLine("Adresse trouvée !");
                    return addresses[0];
                }
                else
                {
                    Console.WriteLine("Aucune adresse trouvée ! Veuillez recommencer...");
                }
            }
        }

        private static Itinerary_OBJ getItinerary(string start, string end)
        {
            ItinearyService.I_ItineraryServiceClient client = new ItinearyService.I_ItineraryServiceClient();
            client.Open();
            Itinerary_OBJ itinerary = client.getItinerary(start,end);
            client.Close();
            return itinerary;
        }

        private static void showSteps(Itinerary_OBJ itinerary)
        {
            foreach(Itinerary_OBJ.Segment segment in itinerary.routes[0].segments)
            {
                foreach(Itinerary_OBJ.Step step in segment.steps)
                {
                    Console.WriteLine(step.instruction +" during "+ step.distance +" meters " );
                }
            }

        }
    }
}
