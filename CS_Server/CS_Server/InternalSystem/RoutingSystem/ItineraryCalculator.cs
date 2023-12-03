using CS_Server.Exposed.Objects;
using CS_Server.InternalSystem.JCDECAUX;
using CS_Server.InternalSystem.JCDECAUX.JCDECAUX_OBJ;
using CS_Server.InternalSystem.Requester;
using GeoCoordinatePortable;
using Newtonsoft.Json;
using Newtonsoft.Json.Serialization;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Threading.Tasks;

namespace CS_Server.InternalSystem.RoutingSystem
{
    public static class ItineraryCalculator
    {
        /**
         * CHERCHE L'ITINERAIRE
         * */
        public static Itinerary_OBJ getItinerary(Adress_OBJ start, Adress_OBJ end)
        {

            JCDecaux_Service jcservice = JCDecaux_Service.GetInstance();

            //GEOCOORDINATE -> VRAIE ADRESSE -> VILLE -> STATIONS ?
            JCContrat contratDepart = jcservice.getContractByCityName(start.city);
            JCContrat contratEnd = jcservice.getContractByCityName(end.city);

            //SI L'UNE DES DEUX VILLES N'A PAS DE CONTRAT -> ON REFUSE
            if(contratDepart == null || contratEnd==null) {throw new Exception("Trajet impossible à réaliser !");}

            // PLUS RAPIDE A PIED ? ON STOP
            TimeSpan durationPEDESTRIAN = ItineraryCalculator.getItineraryDuration(start, end, MEANS_TRANSPORT.PEDESTRIANS);
            TimeSpan durationBICYCLE = ItineraryCalculator.getItineraryDuration(start, end, MEANS_TRANSPORT.BICYCLE);

            Console.WriteLine("Durée du trajet à pied : " + durationPEDESTRIAN.ToString("d' jours 'h'h 'm'm 's's'"));
            Console.WriteLine("Durée du trajet à vélo : " + durationBICYCLE.ToString("d' jours 'h'h 'm'm 's's'"));

            Itinerary_OBJ finalItinerary = new Itinerary_OBJ();
            if (durationBICYCLE < durationPEDESTRIAN)
            {
                //SI OUI,RECHERCHE LES STATIONS LES PLUS PROCHES DU POINT DE DEPART ET D'ARRIVEE
                JCDecaux_Service jCDecaux_Service = JCDecaux_Service.GetInstance();

                JCStation nearestStationFromStart = jCDecaux_Service.getNearestStationFromPosition(start.coordinates,contratDepart);
                JCStation nearestStationFromEnd = jCDecaux_Service.getNearestStationFromPosition(end.coordinates,contratEnd);

                List<GeoCoordinate> pausePoints = new List<GeoCoordinate>();

                //AJOUT DANS L'ORDRE DES ETAPES
                pausePoints.Add(start.coordinates);
                pausePoints.Add(nearestStationFromStart.position.toGeoCoordinate());
                pausePoints.Add(nearestStationFromEnd.position.toGeoCoordinate());
                pausePoints.Add(end.coordinates);

                var jsonItineraryTask = Requester_OpenRouteService.getItinerary(pausePoints,MEANS_TRANSPORT.BICYCLE);
                string jsonItineraryResponse = jsonItineraryTask.Result;
                finalItinerary = JsonConvert.DeserializeObject<Itinerary_OBJ>(jsonItineraryResponse);
                //List<Itinerary_OBJ.Step> itinerarySteps = finalItinerary.routes[0].segments[0].steps;
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

            var itineraryJSONTask = Task.Run(() =>Requester_OpenRouteService.getItinerary(pausePoints, transportMean));
            itineraryJSONTask.Wait();
            var itineraryJSONString = itineraryJSONTask.Result;

            Itinerary_OBJ itinerary = JsonConvert.DeserializeObject<Itinerary_OBJ>(itineraryJSONString);
            double trajectTotalDuration = itinerary.routes[0].summary.duration;
            return TimeSpan.FromSeconds(trajectTotalDuration);
        }
    }
}