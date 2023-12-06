using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CS_Client_MAIN.RoutingService;

namespace CS_Client_MAIN
{
    internal class Program
    {
        public static string STARTADRESS_WORKING = "toulouse musée des augustins";
        public static string ENDADRESS_WORKING = "intermarché 362 rue faventines valence";
        static void Main(string[] args)
        {
            I_ItineraryServiceClient client = new I_ItineraryServiceClient();
            showSteps(getItinerary(STARTADRESS_WORKING, ENDADRESS_WORKING));
            Console.WriteLine("Appuyez sur un touche pour quitter !");
            Console.ReadLine();

        }
        private static Itinerary_OBJ getItinerary(string start, string end)
        {
            I_ItineraryServiceClient client = new I_ItineraryServiceClient();
            client.Open();
            Itinerary_OBJ itinerary = client.getItinerary(start, end);
            client.Close();
            return itinerary;
        }

        private static void showSteps(Itinerary_OBJ itinerary)
        {
            foreach (Itinerary_OBJ.Segment segment in itinerary.routes[0].segments)
            {
                foreach (Itinerary_OBJ.Step step in segment.steps)
                {
                    Console.WriteLine(step.instruction + " during " + step.distance + " meters ");
                }
            }

        }
    }
}
