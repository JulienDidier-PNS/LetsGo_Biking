
using CS_Server_Main.InternalSystem.OPENROUTESERVICE;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CS_Server_Main.Exposed.Objects;
using CS_Server_Main.JCDecaux_API;

namespace CS_Server_Main.InternalSystem.RoutingSystem
{
    public static class ItineraryCalculator
    {
        /**
         * CHERCHE L'ITINERAIRE
         * */
        public static Itinerary_OBJ getItinerary(Adress_OBJ start, Adress_OBJ end)
        {
            //REQUETE PROXY/CACHE
            I_JCDecauxClient jcClient = new I_JCDecauxClient();

            Console.WriteLine("Appel au proxy !");
            JCDecaux_API.JCContrat contratDepart = jcClient.getContractByCityName(start.city);
            Console.WriteLine("Appel au proxy !");
            JCDecaux_API.JCContrat contratEnd = jcClient.getContractByCityName(end.city);

            //SI L'UNE DES DEUX VILLES N'A PAS DE CONTRAT -> ON REFUSE
            if (contratDepart == null || contratEnd == null) { throw new Exception("Trajet impossible à réaliser !"); }

            // PLUS RAPIDE A PIED ? ON STOP
            TimeSpan durationPEDESTRIAN = ItineraryCalculator.getItineraryDuration(start, end, MEANS_TRANSPORT.PEDESTRIANS);
            TimeSpan durationBICYCLE = ItineraryCalculator.getItineraryDuration(start, end, MEANS_TRANSPORT.BICYCLE);

            Console.WriteLine("Durée du trajet à pied : " + durationPEDESTRIAN.ToString("d' jours 'h'h 'm'm 's's'"));
            Console.WriteLine("Durée du trajet à vélo : " + durationBICYCLE.ToString("d' jours 'h'h 'm'm 's's'"));

            Itinerary_OBJ finalItinerary = new Itinerary_OBJ();
            if (durationBICYCLE < durationPEDESTRIAN)
            {
                //SI OUI,RECHERCHE LES STATIONS LES PLUS PROCHES DU POINT DE DEPART ET D'ARRIVEE

                //REQUETE PROXY/CACHE
                Console.WriteLine("Appel au proxy !");
                JCDecaux_API.JCStation nearestStationFromStart = jcClient.getNearestStationFromPosition(start.coordinates, contratDepart);
                
                Console.WriteLine("Appel au proxy !");
                JCDecaux_API.JCStation nearestStationFromEnd = jcClient.getNearestStationFromPosition(end.coordinates, contratEnd);
                

                List<GeoCoordinate> pausePoints = new List<GeoCoordinate>();

                //AJOUT DANS L'ORDRE DES ETAPES
                pausePoints.Add(start.coordinates);
                pausePoints.Add(jcClient.positionToGeoCoordinates(nearestStationFromStart.position));
                pausePoints.Add(jcClient.positionToGeoCoordinates(nearestStationFromEnd.position));
                pausePoints.Add(end.coordinates);

                var jsonItineraryTask = Requester_OpenRouteService.getItinerary(pausePoints, MEANS_TRANSPORT.BICYCLE);
                string jsonItineraryResponse = jsonItineraryTask.Result;
                finalItinerary = JsonConvert.DeserializeObject<Itinerary_OBJ>(jsonItineraryResponse);
                return finalItinerary;
            }
            else
            {
                List<GeoCoordinate> pausePoints = new List<GeoCoordinate>();
                pausePoints.Add(start.coordinates);
                //AJOUT DES AUTRES POINTS
                pausePoints.Add(end.coordinates);

                var jsonItineraryTask = Requester_OpenRouteService.getItinerary(pausePoints, MEANS_TRANSPORT.PEDESTRIANS);
                string jsonItineraryResponse = jsonItineraryTask.Result;
                finalItinerary = JsonConvert.DeserializeObject<Itinerary_OBJ>(jsonItineraryResponse);

            }
            return finalItinerary;
        }

        /**
         * 
         * DUREE D'ITINERAIRE A SUIVANT LE TYPE DE TRAJET
         * 
         * */

        private static TimeSpan getItineraryDuration(Adress_OBJ start, Adress_OBJ end, MEANS_TRANSPORT transportMean)
        {
            List<GeoCoordinate> pausePoints = new List<GeoCoordinate>();
            pausePoints.Add(start.coordinates);
            pausePoints.Add(end.coordinates);

            var itineraryJSONTask = Task.Run(() => Requester_OpenRouteService.getItinerary(pausePoints, transportMean));
            itineraryJSONTask.Wait();
            var itineraryJSONString = itineraryJSONTask.Result;

            Itinerary_OBJ itinerary = JsonConvert.DeserializeObject<Itinerary_OBJ>(itineraryJSONString);
            double trajectTotalDuration = itinerary.routes[0].summary.duration;
            return TimeSpan.FromSeconds(trajectTotalDuration);
        }
    }
}
