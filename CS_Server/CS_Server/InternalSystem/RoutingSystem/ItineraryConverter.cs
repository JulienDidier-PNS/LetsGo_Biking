using GeoCoordinatePortable;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace CS_Server.InternalSystem.RoutingSystem
{
    //CONVERTIT LA REPONSE API EN ITINERAIRE
    public class ItineraryConverter
    {
        public static void getItinerary(GeoCoordinate start, GeoCoordinate end)
        {

            //AVOIR LA VILLE DE DEPART ET D'ARRIVEE -> SAVOIR S'IL Y A DE STATIONS
            // NON -> IMPOSSIBLE, ON STOP
            // PLUS RAPIDE A PIED ? ON STOP

            //SI OUI,RECHERCHE DES ARRÊTS ENTRE LES STATIONS

            List<GeoCoordinate> pausePoints = new List<GeoCoordinate>();
            pausePoints.Add(start);
            //AJOUT DES AUTRES POINTS
            pausePoints.Add(end);

            var jsonItinerary = Requester_OpenRouteService.getItinerary(pausePoints).Result;
            Console.WriteLine(jsonItinerary);
            //dynamic adress = JsonConvert.DeserializeObject<dynamic[]>(jsonItinerary);
        }
    }
}