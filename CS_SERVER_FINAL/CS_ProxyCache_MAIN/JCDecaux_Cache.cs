using CS_ProxyCache_MAIN.Exposed.Objects;
using CS_ProxyCache_MAIN.JCDECAUX.API;
using CS_ProxyCache_MAIN.OPENROUTESERVICE;
using CS_ProxyCache_MAIN.RoutingService;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CS_ProxyCache_MAIN
{
    internal class JCDecaux_Cache
    {
        private static JCDecaux_Cache _instance;
        public static JCDecaux_Cache GetInstance()
        {
            if (_instance == null)
            {
                _instance = new JCDecaux_Cache();
            }
            return _instance;
        }

        //délai de validité d'un contrat : 1 semaines
        private static long DEFAULT_TTL_CONTRACTS = 604800000;

        private DateTime lastupdateContracts = DateTime.MinValue;

        private static double MAXIMAL_DISTANCE_TO_GET_A_BIKE = 100000;

        //liste des contrats
        private List<JCContrat> contractsList;
        //liste des stations par noms de contrats
        private Dictionary<string, List<JCStation>> stationsList;
        //liste des dernières updates des stations par contrats
        private Dictionary<string, DateTime> lastUpdateStationsDate;

        public JCDecaux_Cache()
        {
            Console.WriteLine("NOUVELLE REQUETE POUR JCDECAUX SERVICE !");
            contractsList = new List<JCContrat>();
            stationsList = new Dictionary<string, List<JCStation>>();
            lastUpdateStationsDate = new Dictionary<string, DateTime>();
            updateCache();
        }


        /*
         *
         * UPDATES
         * 
         */

        private void updateCache()
        {
            DateTime now = DateTime.Now;
            if (DateTime.Now.Ticks - lastupdateContracts.Ticks > DEFAULT_TTL_CONTRACTS) { updateContract(); }
        }

        private void updateContract()
        {
            //UPDATE DES CONTRATS
            var allContractsTask = Task.Run<string>(() =>
            {
                return Requester_JCdecaux.getAllContracts();
            });
            string allContractJson = allContractsTask.Result;

            JCContrat[] contracts = System.Text.Json.JsonSerializer.Deserialize<JCContrat[]>(allContractJson);
            contractsList.Clear();
            contractsList.AddRange(contracts);

            this.lastupdateContracts = DateTime.Now;
        }

        internal JCContrat getContractByCityName(string cityname)
        {
            foreach (JCContrat contrat in this.contractsList)
            {
                if (contrat.name.ToLower().Equals(cityname.ToLower())) { Console.WriteLine("Contrat trouvé !"); return contrat; }
            }
            return null;
        }

        internal JCStation getNearestStationFromPositionInSpecificContract(GeoCoordinate coordinates, JCContrat contrat)
        {
            JCStation nearestStation = null;
            double lowestDistance = Double.MaxValue;
            List<JCStation> resultToRequest = getStationsFromContrat(contrat);
            foreach (JCStation station in resultToRequest)
            {
                double distance = station.position.toGeoCoordinate().GetDistanceTo(coordinates);
                if (distance < lowestDistance) { lowestDistance = distance; nearestStation = station; }
            }
            return nearestStation;
        }

        public JCStation getNearestStationFromPosition(GeoCoordinate coordinates)
        {
            JCStation nearestStation = null;
            double lowestDistance = Double.MaxValue;
            foreach (JCContrat contrat in this.contractsList)
            {
                foreach (JCStation station in getStationsFromContrat(contrat))
                {
                    double distance = station.position.toGeoCoordinate().GetDistanceTo(coordinates);
                    if (distance < lowestDistance) { lowestDistance = distance; nearestStation = station; }
                }
            }

            return nearestStation;
        }

        private List<JCStation> getStationsFromContrat(JCContrat contrat)
        {
            //ON UPDATE LA LISTE DES CONTRATS
            updateStationList(contrat);

            //PUIS, ON RENVOIE LA LISTE UPDATE
            List<JCStation> stationsToReturn;
            this.stationsList.TryGetValue(contrat.name.ToLower(), out stationsToReturn);
            return stationsToReturn;
        }

        private void updateStationList(JCContrat contrat)
        {
            //SI LA LISTE DES STATIONS A DEJA ETE MISE A JOUR UNE FOIS
            if (this.lastUpdateStationsDate.ContainsKey(contrat.name.ToLower()))
            {
                DateTime lastUpdate;
                lastUpdateStationsDate.TryGetValue(contrat.name.ToLower(), out lastUpdate);
                //SI LA DERNIERE UPDATE DATE DE PLUS DE "DEFAULT_TTL_CONTRACTS, ON UPDATE
                long difference = DateTime.Now.Millisecond - lastUpdate.Millisecond;
                if (DateTime.Now.Millisecond - lastUpdate.Millisecond > DEFAULT_TTL_CONTRACTS)
                {
                    var stationListUpdateRequest = Requester_JCdecaux.getAllStationFromContract(contrat.name);
                    string stationListJSON = stationListUpdateRequest.Result;
                    JCStation[] stationsToUpdate = JsonConvert.DeserializeObject<JCStation[]>(stationListJSON);
                    //on supprime l'ancienne liste plus à jour
                    this.stationsList.Remove(contrat.name.ToLower());
                    //on ajoute la nouvelle liste update
                    this.stationsList.Add(contrat.name.ToLower(), new List<JCStation>(stationsToUpdate));
                    //on met à jour la dernière date d'update avec la date d'aujourd'hui
                    this.lastUpdateStationsDate.Remove(contrat.name.ToLower());
                    this.lastUpdateStationsDate.Add(contrat.name.ToLower(), DateTime.Now);
                }
            }
            //SI NON, ON AJOUTE LA LISTE DES STATIONS
            else
            {
                var stationListUpdateRequest = Requester_JCdecaux.getAllStationFromContract(contrat.name);
                string stationListJSON = stationListUpdateRequest.Result;
                JCStation[] stationsToUpdate = JsonConvert.DeserializeObject<JCStation[]>(stationListJSON);
                //on ajoute la nouvelle liste update
                this.stationsList.Add(contrat.name.ToLower(), new List<JCStation>(stationsToUpdate));
                this.lastUpdateStationsDate.Add(contrat.name.ToLower(), DateTime.Now);
            }
        }

        public GeoCoordinate positionToGeoCoordinates(Position position)
        {
            return new GeoCoordinate(position.latitude, position.longitude);
        }

        public void testCom()
        {
            Console.WriteLine("proxy fonctionne !");
        }

        public JCStation getNearestStationWithBikesAvailableFromPositionInSpecificContract(GeoCoordinate coordinates, JCContrat contrat)
        {
            JCStation nearestStation = null;
            double lowestDistance = Double.MaxValue;
            List<JCStation> resultToRequest = getStationsFromContrat(contrat);

            //TRIE DE LA LISTE PAR ORDRE DE DISTANCE MINIMUM
            resultToRequest.OrderBy(i => i.position.toGeoCoordinate().GetDistanceTo(coordinates)).ToList();

            foreach (JCStation station in resultToRequest)
            {
                //PAS DE VELOS DISPO.
                if (station.status.Equals("CLOSE") || station.totalStands.availabilities.bikes <= 0) { }
                else
                {
                    //LISTE DES COORDONEES
                    List<GeoCoordinate> best = new List<GeoCoordinate>();
                    best.Add(coordinates);
                    best.Add(station.position.toGeoCoordinate());
                    //CALCULER LA DISTANCE A PIED ET NON A VOL D'OISEAU

                    double distance_foot = JsonConvert.DeserializeObject<Itinerary>(Requester_OpenRouteService.getItinerary(best, MEANS_TRANSPORT.PEDESTRIANS).Result).routes[0].segments[0].distance;
                    double distance_bird = station.position.toGeoCoordinate().GetDistanceTo(coordinates);
                    //double distance = station.position.toGeoCoordinate().GetDistanceTo(coordinates);
                    if (distance_foot < lowestDistance) { lowestDistance = distance_foot; nearestStation = station; }

                    //si distance à pied ajoute +/- de 50% de distance à vol d'oiseau, on accepte (trier par ordre croissant donc dès que condition validée : FORCEMENT la plus proche
                    Console.WriteLine("distance vol d'oiseau : " + distance_bird.ToString() + " | distance à pied : " + distance_foot.ToString());
                    if (distance_foot <= distance_bird + (distance_bird * 0.5) &&
                        distance_foot >= distance_bird - (distance_bird * 0.5)) { return station; }
                }
            }
            return nearestStation;

        }

        public JCStation getNearestStationWithBikesAvailableFromPosition(GeoCoordinate coordinates)
        {
            JCStation nearestStation = null;
            double lowestDistance = Double.MaxValue;

            //ON FAIT UN PREMIER PARCOURS
            List<JCStation> nearest = new List<JCStation>();

            /*  List<JCContrat> nearestContract = new List<JCContrat>();
            foreach(JCContrat contrat in this.contractsList)
            {
                List<JCStation> resultToRequest = getStationsFromContrat(contrat);
                foreach(JCStation station in resultToRequest)
                {
                    if (station.position.toGeoCoordinate().GetDistanceTo(coordinates) < MAXIMAL_DISTANCE_TO_GET_A_BIKE){nearestContract.Add(contrat);break;}
                }
            }
            */
            foreach (JCContrat contrat in this.contractsList)
            {
                List<JCStation> resultToRequest = getStationsFromContrat(contrat);
                resultToRequest.OrderBy(i => i.position.toGeoCoordinate().GetDistanceTo(coordinates)).ToList();

                foreach (JCStation station in resultToRequest)
                {
                    //PAS DE VELOS DISPO.
                    if (station.status.Equals("CLOSE") || station.totalStands.availabilities.bikes <= 0) { }
                    else
                    {
                        //LISTE DES COORDONEES
                        List<GeoCoordinate> best = new List<GeoCoordinate>();
                        best.Add(coordinates);
                        best.Add(station.position.toGeoCoordinate());
                        //CALCULER LA DISTANCE A PIED ET NON A VOL D'OISEAU
                        double distance_bird = station.position.toGeoCoordinate().GetDistanceTo(coordinates);
                        //double distance = station.position.toGeoCoordinate().GetDistanceTo(coordinates);
                        if (distance_bird < lowestDistance) { lowestDistance = distance_bird; nearestStation = station; }
                    }
                }
                if (nearestStation != null && !nearest.Contains(nearestStation)) { nearest.Add(nearestStation); }
            }

            double final_LowestDistance = Double.MaxValue;
            foreach (JCStation station in nearest)
            {
                //LISTE DES COORDONEES
                List<GeoCoordinate> best = new List<GeoCoordinate>();
                best.Add(coordinates);
                best.Add(station.position.toGeoCoordinate());
                //CALCULER LA DISTANCE A PIED ET NON A VOL D'OISEAU
                double distance_foot = JsonConvert.DeserializeObject<Itinerary>(Requester_OpenRouteService.getItinerary(best, MEANS_TRANSPORT.PEDESTRIANS).Result).routes[0].segments[0].distance;
                double distance_bird = station.position.toGeoCoordinate().GetDistanceTo(coordinates);
                //double distance = station.position.toGeoCoordinate().GetDistanceTo(coordinates);
                if (distance_foot < final_LowestDistance) { final_LowestDistance = distance_foot; nearestStation = station; }
            }
            return nearestStation;
        }

    }
}
