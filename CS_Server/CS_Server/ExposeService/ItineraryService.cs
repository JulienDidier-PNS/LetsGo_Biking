using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using System.ServiceModel;
using System.Web.UI.WebControls;

using CS_Server.Utils;
using System.Threading.Tasks;
using CS_Server.InternalSystem;

namespace CS_Server
{
    public class ItineraryService : I_ItineraryService
    {
        public string toString()
        {
            return "azy ça fonctionne";
        }

        public async void getItinerary(string start, string arrival)
        {
            Console.WriteLine("Nouvelle requête !");
            Console.WriteLine("Calcul de : " + start + " to " + arrival);
            Console.WriteLine("Conversion en adresse....");
            UniversalConverter.inputToCompleteAdress(arrival);
        }



    }
}
