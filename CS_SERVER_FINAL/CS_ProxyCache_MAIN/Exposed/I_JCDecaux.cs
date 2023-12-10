using CS_ProxyCache_MAIN.Exposed.Objects;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Device.Location;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace CS_ProxyCache_MAIN.Exposed
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom d'interface "IService1" à la fois dans le code et le fichier de configuration.
    [ServiceContract]
    public interface I_JCDecaux
    {
        [OperationContract]
        JCContrat getContractByCityName(string cityName);
        [OperationContract]
        JCStation getNearestStationFromPositionInSpecificContract(GeoCoordinate coordinates, JCContrat contrat);
        [OperationContract]
        JCStation getNearestStationFromPosition(GeoCoordinate coordinates);
        [OperationContract]
        JCStation getNearestStationWithBikesAvailableFromPositionInSpecificContract (GeoCoordinate coordinates, JCContrat contrat);
        [OperationContract]
        JCStation getNearestStationWithBikesAvailableFromPosition(GeoCoordinate coordinates);
        [OperationContract]
        GeoCoordinate positionToGeoCoordinates(Position position);
        [OperationContract]
        void testCom();

    }

   
}
