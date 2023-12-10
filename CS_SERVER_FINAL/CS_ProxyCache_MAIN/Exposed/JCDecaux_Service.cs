using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CS_ProxyCache_MAIN.RoutingService;
using CS_ProxyCache_MAIN.OPENROUTESERVICE;
using CS_ProxyCache_MAIN.Exposed.Objects;
using CS_ProxyCache_MAIN.JCDECAUX.API;

namespace CS_ProxyCache_MAIN.Exposed
{
    public class JCDecaux_Service : I_JCDecaux
    {
        private static JCDecaux_Service _instance;
        public static JCDecaux_Service GetInstance()
        {
            if (_instance == null)
            {
                _instance = new JCDecaux_Service();
            }
            return _instance;
        }

        JCContrat I_JCDecaux.getContractByCityName(string cityName)
        {
            JCDecaux_Cache cache = JCDecaux_Cache.GetInstance();
            Console.WriteLine("Recherche de contrat pour :" + cityName);
            return cache.getContractByCityName(cityName);
        }


        JCStation I_JCDecaux.getNearestStationFromPositionInSpecificContract(GeoCoordinate coordinates, JCContrat contrat)
        {
            JCDecaux_Cache cache = JCDecaux_Cache.GetInstance();
           return cache.getNearestStationFromPositionInSpecificContract(coordinates, contrat);
        }

        JCStation I_JCDecaux.getNearestStationFromPosition(GeoCoordinate coordinates)
        {
            JCDecaux_Cache cache = JCDecaux_Cache.GetInstance();
            return cache.getNearestStationFromPosition(coordinates);
        }

        public GeoCoordinate positionToGeoCoordinates(Position position)
        {
            return new GeoCoordinate(position.latitude, position.longitude);
        }

        public void testCom()
        {
            Console.WriteLine("proxy fonctionne !");
        }

        JCStation I_JCDecaux.getNearestStationWithBikesAvailableFromPositionInSpecificContract(GeoCoordinate coordinates, JCContrat contrat)
        {
            JCDecaux_Cache cache = JCDecaux_Cache.GetInstance();
            return cache.getNearestStationFromPositionInSpecificContract(coordinates, contrat);
        }

        public JCStation getNearestStationWithBikesAvailableFromPosition(GeoCoordinate coordinates)
        {
            JCDecaux_Cache cache = JCDecaux_Cache.GetInstance();
            return cache.getNearestStationWithBikesAvailableFromPosition(coordinates);
        }
           
    }
}
