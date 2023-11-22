using CS_Server.Utils;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using System.Web.UI.WebControls;

namespace CS_Server
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom d'interface "IService1" à la fois dans le code et le fichier de configuration.
    [ServiceContract]
    public interface I_ItineraryService
    {

        [OperationContract]
        string toString();

        [OperationContract]
        void getItinerary(string start, string arrival);

        // TODO: ajoutez vos opérations de service ici
    }
}
