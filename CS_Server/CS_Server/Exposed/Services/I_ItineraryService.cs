using CS_Server.InternalSystem;
using CS_Server.Utils;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using System.Threading.Tasks;
using System.Web.UI.WebControls;
using GeoCoordinatePortable;

namespace CS_Server
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
