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
        public static async Task<string> getCompleteAdress(string input)
        {
            try
            {
                // notre cible
                string request = OPENSTREETMAP_LINK + "/search?q=" + CorrectString(input) + "&format=json";
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



        //Utils
        private static string CorrectString(string input){return input.Replace(" ", "%20");}
    }
}