using CS_CLIENT.ItinearyService;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CS_CLIENT
{
    internal class Client
    {
        static void Main(string[] args)
        {
            ItinearyService.I_ItineraryServiceClient client = new ItinearyService.I_ItineraryServiceClient();
            Console.WriteLine("Entrez votre adresse de départ :");
            //string start = Console.ReadLine();
            string start = "2 avenue pythagore";
            Console.WriteLine("Entrez votre adresse d'arrivée :");
            //string arrival = Console.ReadLine();
            string arrival = "930 route des colles Biot";

            client.getItinerary(start, arrival); Console.ReadLine();
            
        }
    }
}
