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
    public static class RequestManager
    {
        private static HttpClient httpClient = new HttpClient();

        static RequestManager()
        {
           httpClient.DefaultRequestHeaders.Add("User-Agent", "LetsGoBikingJulienD");
        }
        //REQUÊTES

        /*
         * CONVERTIR UNE ADRESSE SIMPLE EN ADRESSE COMPLETE 
         * */
        public static async Task<string> getCompleteAdress(string input)
        {

            // notre cible
            string request = DEFAULT_INFORMATIONS.OPENSTREETMAP_LINK + "/search?q=" + CorrectString(input) + "&format=json";
            using (httpClient)
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


        //Utils
        private static string CorrectString(string input){return input.Replace(" ", "%20");}
    }
}