using CS_Server_Main.InternalSystem.JCDECAUX.API;
using CS_Server_Main.InternalSystem.JCDECAUX.JCDECAUX_OBJ;
using CS_Server_Main.Utils;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.InternalSystem.JCDECAUX
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

        //délai de validité d'un contrat : 1 semaines
        private static long DEFAULT_TTL_CONTRACTS = 604800000;
        //délai de validité d'une station : 10min
        private static long DEFAULT_TTL_STATION = 300000;

        private DateTime lastupdateContracts = DateTime.MinValue;

        //liste des contrats
        private List<JCContrat> contractsList;
        //liste des stations par noms de contrats
        private Dictionary<string, List<JCStation>> stationsList;
        //liste des dernières updates des stations par contrats
        private Dictionary<string, DateTime> lastUpdateStationsDate;

        public JCDecaux_Service()
        {
            Console.WriteLine("NOUVELLE REQUETE POUR JCDECAUX SERVICE !");
            contractsList = new List<JCContrat>();
            stationsList = new Dictionary<string, List<JCStation>>();
            lastUpdateStationsDate = new Dictionary<string, DateTime>();
            updateCache();
        }


        JCContrat I_JCDecaux.getContractByCityName(string cityName)
        {
            Console.WriteLine("Recherche de contrat pour :" + cityName);
            updateCache();
            foreach (JCContrat contrat in this.contractsList)
            {
                if (contrat.name.ToLower().Equals(cityName.ToLower())) { Console.WriteLine("Contrat trouvé !"); return contrat; }
            }
            return null;
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

        JCStation I_JCDecaux.getNearestStationFromPosition(GeoCoordinate coordinates, JCContrat contrat)
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
    }
}
