using CS_Server_Main.Exposed.Objects;
using CS_Server_Main.InternalSystem.OPENAPI;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.InternalSystem.RoutingSystem
{
    public static class AdressService
    {      

        // CONVERSION

        /* ADRESS TO COMPLETE ADRESSE */
        public static Places[] inputToCompleteAdress(string input)
        {
            Console.WriteLine("passage_input_Converter");
            //recupération des adresses trouvées par OPENSTREETMAP
            try
            {
                var correctStartingAdress = Requester_OpenAPI.getCompleteAdressFromString(input).Result;
                //CONVERSION UNE PREMIERE FOIS (SANS LES ADDRESSES)
                Places[] address = System.Text.Json.JsonSerializer.Deserialize<Places[]>(correctStartingAdress);
                foreach(Places places1 in address) { places1.finalCoordinate = new GeoCoordinate(Double.Parse(places1.lat.Replace(".",",")), Double.Parse(places1.lon.Replace(".", ","))); }
                int nbAdresses = address.Length;
                
                Places[] finalAddresses = new Places[nbAdresses];

                //CONVERSION FINALE AVEC LES ADDRESSES
                for (int i=0;i<address.Length;i++)
                {
                    var addresseFromCooordinates = Requester_OpenAPI.getCompleteAdressFromCoordonates(address[i].finalCoordinate).Result;
                    finalAddresses[i] = System.Text.Json.JsonSerializer.Deserialize<Places>(addresseFromCooordinates);
                }

                foreach(Places places in finalAddresses)
                {
                    Console.WriteLine(places.lat);
                    Console.WriteLine(places.lon);
                    places.finalCoordinate = new GeoCoordinate(Double.Parse(places.lat.Replace(".",",")), Double.Parse(places.lon.Replace(".", ",")));
                }
                return finalAddresses;
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

            return new GeoCoordinate(lat, lon);
        }

        /* COORDONATE TO ADRESS*/
        public async static Task<string> getCompleteAdressFromCoordonates(GeoCoordinate geoCoordinate)
        {
            return await Requester_OpenAPI.getCompleteAdressFromCoordonates(geoCoordinate);
        }

        internal static Places getPlaceFromCoordinates(GeoCoordinate start)
        {
            var correctStartingAdress = Requester_OpenAPI.getCompleteAdressFromCoordonates(start).Result;
            //CONVERSION EN TABLEAU D'ADRESSES
            Places adress = System.Text.Json.JsonSerializer.Deserialize<Places>(correctStartingAdress);
            adress.finalCoordinate = new GeoCoordinate(Double.Parse(adress.lat.Replace(".", ",")), Double.Parse(adress.lon.Replace(".", ",")));
            return adress;
        }
    }
}
