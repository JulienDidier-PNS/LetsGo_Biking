using CS_Server_Main.InternalSystem.RoutingSystem;
using System;
using System.Collections.Generic;
using System.Device.Location;
using System.IO;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.InternalSystem.OPENROUTESERVICE
{
    public class Requester_OpenRouteService
    {
        //https://openrouteservice.org/dev/#/home
        private static string OPENROUTESERVICE_API_KEY = "5b3ce3597851110001cf62481b90b9a0165b41d281bbd3302896bbd6";
        private static string OPENROUTESERVICE_LINK = "https://api.openrouteservice.org";
        private static string OPENROUTESERVICE_VERSION = "v2";

        private static string OPENROUTESERVICE_FOOT_WALKING = "foot-walking";
        private static string OPENROUTESERVICE_CAR = "driving-car";
        private static string OPENROUTESERVICE_CYCLING_ROAD = "cycling-road";
        private static string OPENROUTESERVICE_REQUEST_FORMAT_RESULT = "json";

        static HttpClient getNewHttpClient()
        {
            HttpClient httpClientFinal = new HttpClient();
            httpClientFinal.DefaultRequestHeaders.Add("User-Agent", "LetsGoBikingJulienD");

            return httpClientFinal;
        }

        public static async Task<string> getItinerary(List<GeoCoordinate> coordonates, MEANS_TRANSPORT transportType)
        {
            string authorization = OPENROUTESERVICE_API_KEY;
            string responseContent = "";
            string coords = "{\"coordinates\":[";
            for (int i = 0; i < coordonates.Count; i++)
            {
                coords += "[" + correctCoordonate(coordonates[i].Longitude) + "," + correctCoordonate(coordonates[i].Latitude) + "],";
                if (i == coordonates.Count - 1)
                {
                    coords += "[" + correctCoordonate(coordonates[i].Longitude) + "," + correctCoordonate(coordonates[i].Latitude) + "]";
                }
            }
            coords += "]}";

            Console.WriteLine(coords);

            Byte[] byteArray = System.Text.Encoding.UTF8.GetBytes(coords);

            //PAR DEFAUT -> REQUETE EN VELO
            HttpWebRequest request = (HttpWebRequest)HttpWebRequest.Create("https://api.openrouteservice.org/v2/directions/" + OPENROUTESERVICE_CYCLING_ROAD + "/" + OPENROUTESERVICE_REQUEST_FORMAT_RESULT);
            if (transportType.Equals(MEANS_TRANSPORT.CAR)) { request = (HttpWebRequest)HttpWebRequest.Create("https://api.openrouteservice.org/v2/directions/" + OPENROUTESERVICE_CAR + "/" + OPENROUTESERVICE_REQUEST_FORMAT_RESULT); }
            if (transportType.Equals(MEANS_TRANSPORT.BICYCLE)) { request = (HttpWebRequest)HttpWebRequest.Create("https://api.openrouteservice.org/v2/directions/" + OPENROUTESERVICE_CYCLING_ROAD + "/" + OPENROUTESERVICE_REQUEST_FORMAT_RESULT); }
            if (transportType.Equals(MEANS_TRANSPORT.PEDESTRIANS)) { request = (HttpWebRequest)HttpWebRequest.Create("https://api.openrouteservice.org/v2/directions/" + OPENROUTESERVICE_FOOT_WALKING + "/" + OPENROUTESERVICE_REQUEST_FORMAT_RESULT); }

            request.Method = "POST";

            request.Accept = "application/json, application/geo+json, application/gpx+xml, img/png; charset=utf-8";
            request.Headers.Add("Authorization", authorization);
            request.ContentType = "application/json";
            request.ContentLength = byteArray.Length;

            System.IO.Stream reqStream = request.GetRequestStream();
            reqStream.Write(byteArray, 0, byteArray.Length);

            using (System.Net.HttpWebResponse response = request.GetResponse() as System.Net.HttpWebResponse)
            {
                Console.WriteLine(request.Address.ToString());
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
