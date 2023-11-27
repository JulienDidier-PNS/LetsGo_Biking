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

namespace CS_Server.InternalSystem
{
    public static class AdressConverter
    {
        public static string[] inputToCompleteAdress(string input)
        {
            Console.WriteLine("passage_input_Converter");
            //recupération des adresses trouvées par OPENSTREETMAP
            try
            {
                var correctStartingAdress = Requester_OpenAPI.getCompleteAdress(input).Result;
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

        public async static Task<GeoCoordinate> correctAdressToGeoCoordonate(string input)
        {
            //recupération des adresses trouvées par OPENSTREETMAP
            var correctStartingAdress = await Requester_OpenAPI.getCompleteAdress(input);

            //on convertit le json en objet dynamic -> permet de prendre ce qu'on veut
            dynamic adress = JsonConvert.DeserializeObject<dynamic[]>(correctStartingAdress);

            double lat = adress[0].lat;
            double lon = adress[0].lon;

            return new GeoCoordinate(lat,lon);
        }

    }
}