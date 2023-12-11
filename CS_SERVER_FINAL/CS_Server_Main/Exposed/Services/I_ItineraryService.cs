using CS_Server_Main.Exposed.Objects;
using CS_Server_Main.InternalSystem.RoutingSystem;
using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.Exposed.Services
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom d'interface "IService1" à la fois dans le code et le fichier de configuration.
    [ServiceContract]
    public interface I_ItineraryService
    {
        //ensemble des addresses compatible avec l'input
        [OperationContract]
        Places[] getCorrectAdress(string input);

        [OperationContract]
        GeoCoordinate getCoordonateWithUniqueCorrectAdress(string correctAdrress);

        [OperationContract]
        Guid computeItineraryWithAddress(Places start, Places end, bool activeMq, string typeOfTransport, string method);

        [OperationContract]
        string getCorrectAdressFromCooordinates(GeoCoordinate coordinate);

        [OperationContract]
        Guid computeItineraryWithGeoCoordinates(GeoCoordinate start, GeoCoordinate end, bool activeMq, string transport, string method);

        [OperationContract]
        void itineraryFinish(Guid uuid);
        [OperationContract]
        Itinerary getItinerary(Guid uuid);

        [OperationContract]
        List<List<double>> getCoordonatesFromWaypoint(int waypoint,Guid itineraryID);

    }
}
