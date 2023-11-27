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
using System.Drawing;
using System.Collections.Specialized;
using GeoCoordinatePortable;
using CS_Server.InternalSystem.RoutingSystem;

namespace CS_Server
{
    public class ItineraryService : I_ItineraryService
    {
        //retourne l'ensemble des adresses trouvées
        public string[] getCorrectAdress(string input)
        {
            try
            {
                Console.WriteLine("Recherche de l'adresse exacte de :" + input);
                return AdressConverter.inputToCompleteAdress(input);
            }
            catch (Exception ex) {
                Console.WriteLine("Erreur côté serveur pour l'adresse correcte !");
                throw new Exception(ex.ToString());
            }
        }

        public GeoCoordinate getCoordonateWithUniqueCorrectAdress(string uniqAdress)
        {
            Console.WriteLine("Recherche des coordonnées pour :");
            return AdressConverter.correctAdressToGeoCoordonate(uniqAdress).Result;
        }

         public void getItinerary(string start, string end)
        {

            GeoCoordinate startPosition = AdressConverter.correctAdressToGeoCoordonate(start).Result;
            GeoCoordinate endPosition = AdressConverter.correctAdressToGeoCoordonate(end).Result; ;

            Console.WriteLine("COORDONEES POINT DE DEPART : " + startPosition.ToString());
            Console.WriteLine("COORDONEES POINT DE D'ARRIVEE : " + endPosition.ToString());

            ItineraryConverter.getItinerary(startPosition, endPosition);
        }

    }
}
