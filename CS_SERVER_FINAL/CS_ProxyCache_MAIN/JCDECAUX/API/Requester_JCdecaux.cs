using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

namespace CS_ProxyCache_MAIN.JCDECAUX.API
{
    public static class Requester_JCdecaux
    {
        public static string JCDECAUX_LINK = "https://api.jcdecaux.com/vls/v3";
        public static string JCDECAUX_APIKEY = "c73fc6302027b8ff912b6be3594e0a30bc730724";

        static HttpClient getNewHttpClient()
        {
            HttpClient httpClientFinal = new HttpClient();
            httpClientFinal.DefaultRequestHeaders.Add("User-Agent", "LetsGoBikingJulienD");

            return httpClientFinal;
        }

        //REQUÊTES

        public static async Task<string> getAllContracts()
        {
            try
            {
                // notre cible
                string request = JCDECAUX_LINK + "/contracts?apiKey=" + JCDECAUX_APIKEY;
                using (HttpClient httpClient = getNewHttpClient())
                {
                    Console.WriteLine(request);
                    // la requête
                    using (HttpResponseMessage response = await httpClient.GetAsync(request))
                    {
                        using (HttpContent content = response.Content)
                        {
                            // récupère la réponse, il ne resterai plus qu'à désérialiser
                            return await content.ReadAsStringAsync();
                        }
                    }
                }
            }
            catch (Exception ex)
            {
                throw new Exception(ex.ToString());
            }
        }

        public static async Task<string> getAllStationFromContract(string contract_name)
        {
            string request = JCDECAUX_LINK + "/stations?contract=" + contract_name + "&apiKey=" + JCDECAUX_APIKEY;
            using (HttpClient client = getNewHttpClient())
            {
                Console.WriteLine(request);
                // la requête
                using (HttpResponseMessage response = await client.GetAsync(request))
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

    }
}
