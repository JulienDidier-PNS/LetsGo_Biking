using CS_Server_Main.InternalSystem.JCDECAUX.JCDECAUX_OBJ;
using CS_Server_Main.Utils;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Device.Location;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace CS_Server_Main
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom d'interface "IService1" à la fois dans le code et le fichier de configuration.
    [ServiceContract]
    public interface I_JCDecaux
    {
        [OperationContract]
        JCContrat getContractByCityName(string cityName);
        [OperationContract]
        JCStation getNearestStationFromPosition(GeoCoordinate coordinates, JCContrat contrat);
        [OperationContract]
        GeoCoordinate positionToGeoCoordinates(Position position);
        [OperationContract]
        void testCom();

    }

    [DataContract]
    public class JCContrat
    {
        [DataMember]
        public string name { get; set; }
        [DataMember]
        public string commercial_name { get; set; }
        [DataMember]
        public string[] cities { get; set; }
        [DataMember]
        public string country_code { get; set; }
    }
    [DataContract]
    public class JCStands
    {
        [DataMember]
        public int capacity { get; set; }
        public class availabilities
        {
            [DataMember]
            public int bikes { get; set; }
            [DataMember]
            public int stands { get; set; }
            [DataMember]
            public int mechanicalBikes { get; set; }
            [DataMember]
            public int electricalBikes { get; set; }
            [DataMember]
            public int electricalInternalBatteryBikes { get; set; }
            [DataMember]
            public int electricalRemovableBatteryBikes { get; set; }
        }
    }
    [DataContract]
    public class JCStation
    {
        [DataMember]
        public int number { get; set; }
        [DataMember]
        public string contractName { get; set; }
        [DataMember]
        public string name { get; set; }
        [DataMember]
        public string adress { get; set; }
        [DataMember]
        public Position position { get; set; }
        [DataMember]
        public Boolean banking { get; set; }
        [DataMember]
        public Boolean bonus { get; set; }
        [DataMember]
        public string status { get; set; }
        [DataMember]
        public string lastUpdate { get; set; }
        [DataMember]
        public Boolean connected { get; set; }
        [DataMember]
        public Boolean overflow { get; set; }
        [DataMember]
        public string shape { get; set; }
        [DataMember]
        public JCStands totalStands { get; set; }
        [DataMember]
        public JCStands mainStands { get; set; }
        [DataMember]
        public Object overflowStands { get; set; }
    }
}
