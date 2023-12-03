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
using CS_Server.Exposed.Objects;

namespace CS_Server
{
    public class ItineraryService : I_ItineraryService
    {

        //retourne l'ensemble des adresses trouvées
        public string[] getCorrectAdress(string input)
        {
            try
            {
                //Console.WriteLine("Recherche de l'adresse exacte de :" + input);
                return AdressService.inputToCompleteAdress(input);
            }
            catch (Exception ex) {
                //Console.WriteLine("Erreur côté serveur pour l'adresse correcte !");
                throw new Exception(ex.ToString());
            }
        }

        public GeoCoordinate getCoordonateWithUniqueCorrectAdress(string uniqAdress)
        {
            //Console.WriteLine("Recherche des coordonnées pour :");
            return AdressService.correctAdressToGeoCoordonate(uniqAdress).Result;
        }

         public Itinerary_OBJ getItinerary(string start, string end)
        {
            //CREATION D'OBJET ADRESSE POUR NE PLUS APPELER LES API PAR LA SUITE
            Adress_OBJ startAdress = AdressService.adresseGenerator(start);
            Adress_OBJ endAdress = AdressService.adresseGenerator(end);

            Console.WriteLine("COORDONEES POINT DE DEPART : " + startAdress.coordinates.ToString());
            Console.WriteLine("COORDONEES POINT DE D'ARRIVEE : " + endAdress.coordinates.ToString());

            return ItineraryCalculator.getItinerary(startAdress, endAdress);
        }
    }
}
