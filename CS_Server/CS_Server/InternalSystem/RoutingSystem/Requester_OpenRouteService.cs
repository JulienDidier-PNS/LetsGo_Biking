using GeoCoordinatePortable;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading.Tasks;
using System.Web;

namespace CS_Server.InternalSystem.RoutingSystem
{
    public class Requester_OpenRouteService
    {
        //https://openrouteservice.org/dev/#/home
        private static string OPENROUTESERVICE_API_KEY = "5b3ce3597851110001cf62481b90b9a0165b41d281bbd3302896bbd6";
        private static string OPENROUTESERVICE_LINK = "https://api.openrouteservice.org";
        private static string OPENROUTESERVICE_VERSION = "v2";

        static HttpClient getNewHttpClient()
        {
            HttpClient httpClientFinal = new HttpClient();
            httpClientFinal.DefaultRequestHeaders.Add("User-Agent", "LetsGoBikingJulienD");

            return httpClientFinal;
        }

        public static async Task<string> getItinerary(List<GeoCoordinate> coordonates)
        {

            string authorization = OPENROUTESERVICE_API_KEY;
            string responseContent = "";
            string coords = "{\"coordinates\":[";
            for(int i = 0; i < coordonates.Count; i++)
            {
                coords += "[" + correctCoordonate(coordonates[i].Longitude) + "," + correctCoordonate(coordonates[i].Latitude) + "],";
                if(i == coordonates.Count-1)
                {
                    coords += "[" + correctCoordonate(coordonates[i].Longitude) + "," + correctCoordonate(coordonates[i].Latitude) + "]";
                }
            }
            coords += "]}";

            Console.WriteLine(coords);

            Byte[] byteArray = System.Text.Encoding.UTF8.GetBytes(coords);

            HttpWebRequest request = (HttpWebRequest)HttpWebRequest.Create("https://api.openrouteservice.org/v2/directions/driving-car/geojson");
            request.Method = "POST";

            request.Accept = "application/json, application/geo+json, application/gpx+xml, img/png; charset=utf-8";
            request.Headers.Add("Authorization", authorization);
            request.ContentType = "application/json";
            request.ContentLength = byteArray.Length;

            System.IO.Stream reqStream = request.GetRequestStream();
            reqStream.Write(byteArray, 0, byteArray.Length);

            using (System.Net.HttpWebResponse response = request.GetResponse() as System.Net.HttpWebResponse)
            {
                using (var reader = new StreamReader(response.GetResponseStream()))
                {
                   return reader.ReadToEnd();
                }
            }
        }
        private static string correctCoordonate(double coord)
        {
            return coord.ToString().Replace(",", ".");
        }

    }
}