using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Web;
using System.IO;
using System.Text.Json;
using System.Text.Json.Nodes;
using System.Text.Json.Serialization;
using Newtonsoft.Json;
using System.Collections.Specialized;
using System.Linq.Expressions;
using GeoCoordinatePortable;
using CS_Server.Exposed.Objects;

namespace CS_Server.InternalSystem
{
    public static class AdressService
    {
        public static Adress_OBJ adresseGenerator(string inputAdress)
        {
            Adress_OBJ toReturn = new Adress_OBJ();

            //ON DEMANDE L'ADRESSE CORRECTE
            var correctStartingAdress = Requester_OpenAPI.getCompleteAdressFromString(inputAdress).Result;

            //on convertit le json en objet dynamic -> permet de prendre ce qu'on veut
            dynamic adress = JsonConvert.DeserializeObject<dynamic[]>(correctStartingAdress);
            double lat = adress[0].lat;
            double lon = adress[0].lon;

            GeoCoordinate coordonates = new GeoCoordinate(lat, lon);
            //ON RECUEILLE UNIQUEMENT LA LATTITUDE ET LA LONGITUDE
            var formatFinal = Requester_OpenAPI.getCompleteAdressFromCoordonates(coordonates).Result;
            dynamic finalAdress = JsonConvert.DeserializeObject<dynamic>(formatFinal);

            if (finalAdress != null)
            {
                toReturn.road = finalAdress.address.road;
                toReturn.country = finalAdress.address.country;
                toReturn.postcode = finalAdress.address.postcode;
                toReturn.region = finalAdress.address.region;

                if (finalAdress.address.city != null) { toReturn.city = finalAdress.address.city; }
                if (finalAdress.address.town != null) { toReturn.city = finalAdress.address.town; }
                else
                {
                    string display_name = finalAdress.display_name;
                    string[] display_split = display_name.Split(',');
                    Console.WriteLine(display_split.ToString());
                    string city = display_split[display_split.Length-5];
                }

                toReturn.coordinates = coordonates;
            }

            Console.WriteLine(toReturn.city);
            return toReturn;
        }  
        // CONVERSION

        /* ADRESS TO COMPLETE ADRESSE */
        public static string[] inputToCompleteAdress(string input)
        {
            Console.WriteLine("passage_input_Converter");
            //recupération des adresses trouvées par OPENSTREETMAP
            try
            {
                var correctStartingAdress = Requester_OpenAPI.getCompleteAdressFromString(input).Result;
                //on convertit le json en objet dynamic -> permet de prendre ce qu'on veut
                dynamic adress = JsonConvert.DeserializeObject<dynamic[]>(correctStartingAdress);
                int nb_adress = adress.Length;

                //TODO -> RETOURNER L'ADRESSE
                string[] adresses = new string[nb_adress];

                //on copie les adresses dans le tableau
                for (int i = 0; i < adress.Length; i++) { adresses[i] = adress[i].display_name; }
                return adresses;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
                throw new Exception(ex.ToString());

            }
        }

        /* ADRESS TO COORDONATE */
        public async static Task<GeoCoordinate> correctAdressToGeoCoordonate(string input)
        {
            //recupération des adresses trouvées par OPENSTREETMAP
            var correctAdress = await Requester_OpenAPI.getCompleteAdressFromString(input);

            //on convertit le json en objet dynamic -> permet de prendre ce qu'on veut
            dynamic adress = JsonConvert.DeserializeObject<dynamic[]>(correctAdress);

            double lat = adress[0].lat;
            double lon = adress[0].lon;

            return new GeoCoordinate(lat,lon);
        }

        /* COORDONATE TO ADRESS*/
        public async static Task<string> getCompleteAdressFromCoordonates(GeoCoordinate geoCoordinate)
        {
           return await Requester_OpenAPI.getCompleteAdressFromCoordonates(geoCoordinate);
        }
    }
}