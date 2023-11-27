using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace CS_Server.InternalSystem.JCDECAUX
{
    public class UtilsStations
    {
        public dynamic getContractByCityName(string cityName)
        {
            var allcontracts = Requester.Requester_JCdecaux.getAllContracts().Result;
            //on convertit le json en objet dynamic -> permet de prendre ce qu'on veut
            //ici type contrat
            dynamic contracts = JsonConvert.DeserializeObject<dynamic[]>(allcontracts);
            for(int i=0;i< contracts.Length;i++)
            {
                if (contracts[i].name == cityName)
                {
                    return contracts[i];
                }
            }
            return null;

        }
    }
}