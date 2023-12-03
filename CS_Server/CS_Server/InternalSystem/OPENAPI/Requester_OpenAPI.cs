using GeoCoordinatePortable;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using System.Web;



namespace CS_Server
{

    /*
     * ALL REQUEST ARE IN JSON FORMAT 
     */
    public static class Requester_OpenAPI
    {
        public static string OPENSTREETMAP_LINK = "https://nominatim.openstreetmap.org";
        public static string OPENSTREETMAP_JSON_FORMAT = "&format=json";

        static HttpClient getNewHttpClient()
        {
            HttpClient httpClientFinal = new HttpClient();
            httpClientFinal.DefaultRequestHeaders.Add("User-Agent", "LetsGoBikingJulienD");

            return httpClientFinal;
        }
        //REQUÊTES

        /*
         * CONVERTIR UNE ADRESSE SIMPLE EN ADRESSE COMPLETE 
         * */
        public static async Task<string> getCompleteAdressFromString(string input)
        {
            try
            {
                // notre cible
                string request = OPENSTREETMAP_LINK + "/search?q=" + CorrectString(input) + OPENSTREETMAP_JSON_FORMAT;
                using (HttpClient httpClient = getNewHttpClient())
                {
                    Console.WriteLine(request);
                    // la requête
                    using (HttpResponseMessage response = await httpClient.GetAsync(request))
                    {
                        using (HttpContent content = response.Content)
                        {
                            // récupère la réponse, il ne resterai plus qu'à désérialiser
                            string result = await content.ReadAsStringAsync();
                            return result;
                        }
                    }
                }
            }
            catch(Exception ex)
            {
                throw new Exception(ex.ToString());
            }
        }


        /*
                                    * 
         * CONVETIR DES COORDONNEES EN ADRESSE COMPLETE
                                    * 
                                                            */

        public static async Task<string> getCompleteAdressFromCoordonates(GeoCoordinate coordonates)
        {
            try
            {
                // notre cible
                string request = OPENSTREETMAP_LINK + "/reverse" + "?lat=" + correctCoordonate(coordonates.Latitude) + "&lon=" + correctCoordonate(coordonates.Longitude) + OPENSTREETMAP_JSON_FORMAT;
                using (HttpClient httpClient = getNewHttpClient())
                {
                    Console.WriteLine(request);
                    // la requête
                    using (HttpResponseMessage response = await httpClient.GetAsync(request))
                    {
                        using (HttpContent content = response.Content)
                        {
                            // récupère la réponse, il ne resterai plus qu'à désérialiser
                            string result = await content.ReadAsStringAsync();
                            return result;
                        }
                    }
                }
            }
            catch (Exception ex)
            {
                throw new Exception(ex.ToString());
            }
        }


        //Utils
        private static string CorrectString(string input){return input.Replace(" ", "%20");}
        private static string correctCoordonate(double coord)
        {
            return coord.ToString().Replace(",", ".");
        }
    }
}