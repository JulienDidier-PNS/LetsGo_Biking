
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
using Apache.NMS;
using Apache.NMS.ActiveMQ;
using CS_Server_Main.Exceptions;
using System.Collections;
using System.Text.Json.Nodes;
using CS_Server_Main.Utils;
using CS_Server_Main.InternalSystem.OPENAPI;
using System.Net.Sockets;
using System.Web.UI.WebControls.WebParts;


namespace CS_Server_Main.InternalSystem.RoutingSystem
{
    public static class ItineraryCalculator
    {
        /**
         * CHERCHE L'ITINERAIRE
         * */
        public static async Task<Guid> getItinerary(Places start, Places end, bool activeMQ, string transport, string method)
        {
            I_JCDecauxClient jcClient = new I_JCDecauxClient();

            string startCity = getCityFromPlaces(start);
            string endCity = getCityFromPlaces(end);

           Console.WriteLine("Appel au proxy !");
            JCContrat contratDepart = jcClient.getContractByCityName(startCity);
            Console.WriteLine("Appel au proxy !");
            JCContrat contratEnd = jcClient.getContractByCityName(endCity);

            List<GeoCoordinate> pausePointWithoutBike = new List<GeoCoordinate>();
            pausePointWithoutBike.Add(start.finalCoordinate);
            pausePointWithoutBike.Add(end.finalCoordinate);
            if (transport != null)
            {
                //SI L'UTILISATEUR VEUT UN TRAJET à PIED
                if (transport.Equals(ENUMS_EXTENSION.ToDescriptionString(MEANS_TRANSPORT.PEDESTRIANS)))
                {
                    Console.WriteLine("L'utilisateur demandeun trajet à pied !");
                    Itinerary itinerary = await getPedestrianItinerary(pausePointWithoutBike, activeMQ);
                    return setupItinerary(itinerary,start,end,activeMQ);
                }
            }
            List<GeoCoordinate> pausePointsWithBike = new List<GeoCoordinate>();
            //AJOUT DANS L'ORDRE DES ETAPES
            pausePointsWithBike.Add(start.finalCoordinate);
            pausePointsWithBike.Add(jcClient.positionToGeoCoordinates(jcClient.getNearestStationWithBikesAvailableFromPosition(start.finalCoordinate).position));
            pausePointsWithBike.Add(jcClient.positionToGeoCoordinates(jcClient.getNearestStationWithBikesAvailableFromPosition(end.finalCoordinate).position));
            pausePointsWithBike.Add(end.finalCoordinate);
            if (transport != null)
            {
                //SI L'UTILISATEUR VEUT UN TRAJET EN VELO
                if (transport.Equals(ENUMS_EXTENSION.ToDescriptionString(MEANS_TRANSPORT.BICYCLE)))
                {
                    Console.WriteLine("L'utilisateur demande un trajet en vélo !");
                    Itinerary itinerary = await getBikeItinerary(pausePointsWithBike, activeMQ);
                    return setupItinerary(itinerary,start,end,activeMQ);
                }
            }
         

            //CONVERSION DE L'ITINERAIRE JSON EN OBJET 

            Itinerary itineraryWithoutBike = await getPedestrianItinerary(pausePointWithoutBike,activeMQ);
            Itinerary itineraryWithBike = await getBikeItinerary(pausePointsWithBike,activeMQ);

            TimeSpan durationPEDESTRIAN = TimeSpan.FromSeconds(itineraryWithoutBike.routes[0].summary.duration);
            TimeSpan durationBICYCLE = TimeSpan.FromSeconds(itineraryWithBike.routes[0].summary.duration);

            double distancePEDESTRIAN = (itineraryWithoutBike.routes[0].summary.distance) / 1000;
            double distanceBICYCLE = (itineraryWithBike.routes[0].summary.distance) / 1000;

            Console.WriteLine("Durée du trajet à pied : " + durationPEDESTRIAN.ToString("d' jours 'h'h 'm'm 's's'"));
            Console.WriteLine("Distance du trajet en pied : " + distancePEDESTRIAN .ToString()+ "km");
            Console.WriteLine("Durée du trajet à vélo : " + durationBICYCLE.ToString("d' jours 'h'h 'm'm 's's'"));
            Console.WriteLine("Distance du trajet en vélo : " + distanceBICYCLE.ToString() + "km");
            Console.WriteLine("Pour aller de "+start.address.ToString()+" à "+end.address.ToString());

            Itinerary finalItinerary = new Itinerary();

            //SI L'UTILISATEUR VEUT LE TRAJET LE PLUS COURT EN DISTANCE
            if (method != null)
            {
                if (method.Equals(ENUMS_EXTENSION.ToDescriptionString(COMPUTE_METHOD.SHORTEST_DISTANCE)))
                {
                    Console.WriteLine("L'utilisateur demande le trajet le plus court en distance !");
                    if (distanceBICYCLE < distancePEDESTRIAN) { return setupItinerary(itineraryWithBike, start, end, activeMQ); }
                    else { return setupItinerary(itineraryWithoutBike, start, end, activeMQ); }
                }
                //SI L'UTILISATEUR VEUR LE TRAJET LE PLUSS COURT EN TEMPS
                if (method.Equals(ENUMS_EXTENSION.ToDescriptionString(COMPUTE_METHOD.SHORTEST_TIME)))
                {
                    Console.WriteLine("L'utilisateur demande le trajet le plus court en temps !");
                    if (durationBICYCLE < durationPEDESTRIAN) { return setupItinerary(itineraryWithBike, start, end, activeMQ); }
                    else { return setupItinerary(itineraryWithoutBike, start, end, activeMQ); }
                }
            }
           

            //PAR DEFAUT, ON RETOURN LE TRAJET LE PLUS COURT
            if (durationBICYCLE <= durationPEDESTRIAN){
                Console.WriteLine("Velo plus rapide que la marche !");
               return setupItinerary(itineraryWithBike,start, end, activeMQ);
            }
            else{
                Console.WriteLine("Marche plus rapide que le vélo !");
                return setupItinerary(itineraryWithoutBike,start,end, activeMQ);
            }

        }

        private static string getCityFromPlaces(Places place)
        {
            if (place.address.town != null) return place.address.town;
            if (place.address.municipality != null) return place.address.municipality;
            if (place.address.suburb != null) return place.address.suburb;
            else
                throw new Exception("Aucune ville trouvée ! pour l'endroit donner"+place);
        }

        private static Guid setupItinerary(Itinerary finalItinerary, Places start, Places end,bool activeMQ)
        {
            I_JCDecauxClient jcClient = new I_JCDecauxClient();
            finalItinerary.firstStationPosition = jcClient.positionToGeoCoordinates(jcClient.getNearestStationWithBikesAvailableFromPosition(start.finalCoordinate).position);
            finalItinerary.lastStationPosition = jcClient.positionToGeoCoordinates(jcClient.getNearestStationWithBikesAvailableFromPosition(end.finalCoordinate).position);
            finalItinerary.totalSteps = 0;
            foreach (Segment s in finalItinerary.routes[0].segments) { foreach (Step step in s.steps) { finalItinerary.totalSteps++; } }

            //ON PREND L'ID DE L'ITINERAIRE GENERER
            Guid itineraryID = ItineraryManager.addItinerary(finalItinerary);
            //ON PLACE LES ETAPES DANS LA QUEUE
            if (activeMQ) { NewActiveMQSession(itineraryID, finalItinerary); }

            //ON RETOURNE AU CLIENT L'ID DE L'ITINERAIRE
            return itineraryID;
        }

        private static void NewActiveMQSession(Guid guid,Itinerary itineraryResponse)
        {
            IConnectionFactory factory = new ConnectionFactory("tcp://LEGION-JULIEN:61616");
            using (IConnection connection = factory.CreateConnection())
            {
                connection.Start();

                ISession session = connection.CreateSession(AcknowledgementMode.AutoAcknowledge);

                // Use the session to target a queue.
                string queueName = "Itinerary" + guid.ToString();
                IDestination destination = session.GetQueue(queueName);

                // Create a Producer targetting the selected queue.
                IMessageProducer producer = session.CreateProducer(destination);

                // You may configure everything to your needs, for instance:
                producer.DeliveryMode = MsgDeliveryMode.NonPersistent;


                foreach (Segment segment in itineraryResponse.routes[0].segments)
                {
                    foreach (Step step in segment.steps)
                    {
                        ITextMessage message = session.CreateTextMessage(Step.serialize(step));
                        producer.Send(message);
                    }
                }
                connection.Close();
                // Votre code pour interagir avec ActiveMQ ici

            }
        }

        private static async Task<Itinerary> getBikeItinerary(List<GeoCoordinate> pausePoint,bool activeMQ)
        {
            //RECUPERATION DE L'ITINERAIRE JSON
            var jsonItineraryTaskWithBike = Requester_OpenRouteService.getItinerary(pausePoint, MEANS_TRANSPORT.BICYCLE);
            await jsonItineraryTaskWithBike;
            string jsonItineraryResponseWithBike = jsonItineraryTaskWithBike.Result;
            Itinerary itineraryWithBike = JsonConvert.DeserializeObject<Itinerary>(jsonItineraryResponseWithBike);
            itineraryWithBike.typeOfItinerary = "BIKE";
            return itineraryWithBike;
        }

        private static async Task<Itinerary> getPedestrianItinerary(List<GeoCoordinate> pausePoint, bool activeMQ)
        {
            //RECUPERATION DE L'ITINERAIRE JSON
            var jsonItineraryTaskWithBike = Requester_OpenRouteService.getItinerary(pausePoint, MEANS_TRANSPORT.BICYCLE);
            await jsonItineraryTaskWithBike;
            string jsonItineraryResponseWithBike = jsonItineraryTaskWithBike.Result;
            Itinerary itinerary = JsonConvert.DeserializeObject<Itinerary>(jsonItineraryResponseWithBike);
            itinerary.typeOfItinerary = "PEDESTRIAN";
            return itinerary;
        }


    }
}
