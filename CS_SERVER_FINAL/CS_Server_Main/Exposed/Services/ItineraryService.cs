using CS_Server_Main.InternalSystem.RoutingSystem;
using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CS_Server_Main.Exposed.Objects;
using System.ServiceModel.Channels;
using Apache.NMS;
using Apache.NMS.ActiveMQ;
using CS_Server_Main.InternalSystem;
using CS_Server_Main.Exceptions;
using System.Web.Services.Protocols;
using System.Net.Sockets;
using System.Net;
using Newtonsoft.Json;
using CS_Server_Main.Utils;
using Apache.NMS.ActiveMQ.Transport;

namespace CS_Server_Main.Exposed.Services
{
    public class ItineraryService : I_ItineraryService
    {
        ItineraryManager manager = ItineraryManager.GetInstance();

        //retourne l'ensemble des adresses trouvées
        public Places[] getCorrectAdress(string input)
        {
            try
            {
                Console.WriteLine("Recherche de l'adresse exacte de :" + input);
                return AdressService.inputToCompleteAdress(input);
            }
            catch (Exception ex)
            {
                throw new Exception(ex.ToString());
            }
        }

        public GeoCoordinate getCoordonateWithUniqueCorrectAdress(string uniqAdress)
        {
            Console.WriteLine("Recherche des coordonnées pour :" + uniqAdress);
            return AdressService.correctAdressToGeoCoordonate(uniqAdress).Result;
        }

        public void itineraryFinish(Guid uuid)
        {
            ItineraryManager.removeItinerary(uuid);
        }

        public Itinerary getItinerary(Guid uuid)
        {
            Console.WriteLine("============================getItinerary()============================");
            Console.WriteLine("Recherche d'itinéraire ID : "+uuid.ToString());

            Itinerary toReturn = null;
            try
            {
                toReturn = ItineraryManager.getItinerary(uuid);
            }
            catch(Exception ex)
            {
                Console.WriteLine("Trajet Impossible à faire !");
            }
            return toReturn;
        }

        public Guid computeItineraryWithGeoCoordinates(GeoCoordinate startCoordinate, GeoCoordinate endCoordinate,bool activeMQ, string transport, string method)
        {
            Places startPlace = AdressService.getPlaceFromCoordinates(startCoordinate);
            Places endPlace = AdressService.getPlaceFromCoordinates(endCoordinate);

            Console.WriteLine("COORDONEES POINT DE DEPART : " + startPlace.finalCoordinate.ToString());
            Console.WriteLine("COORDONEES POINT DE D'ARRIVEE : " + endPlace.finalCoordinate.ToString());

            return ItineraryCalculator.getItinerary(startPlace, endPlace,activeMQ, transport, method).Result;
        }


        public List<List<double>> getCoordonatesFromWaypoint(int waypoint,Guid itineraryID)
        {
            return  GeometryDecoder.DecodeGeometry(getItinerary(itineraryID).routes[0].geometry, false);
        }

        public Guid computeItineraryWithAddress(Places startPlaces, Places endPlaces,bool activeMq, string transport, string method)
        {
            Console.WriteLine("COORDONEES POINT DE DEPART : " + startPlaces.finalCoordinate.ToString());
            Console.WriteLine("COORDONEES POINT DE D'ARRIVEE : " + endPlaces.finalCoordinate.ToString());

            return ItineraryCalculator.getItinerary(startPlaces, endPlaces, activeMq,transport,method).Result;
        }

        public string getCorrectAdressFromCooordinates(GeoCoordinate coordinate)
        {
            Places place = AdressService.getPlaceFromCoordinates(coordinate);
            return place.display_name;
        }
    }
}
