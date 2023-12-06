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
        string[] getCorrectAdress(string input);

        [OperationContract]
        //RETURN FORMAT : LAT/LONG
        GeoCoordinate getCoordonateWithUniqueCorrectAdress(string correctAdrress);

        [OperationContract]
        Itinerary_OBJ getItinerary(string start, string end);

    }
}
