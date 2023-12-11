using CS_Server_Main.Exceptions;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.Services.Protocols;
using System.Xml;

namespace CS_Server_Main.InternalSystem
{
    public class ItineraryManager
    {
        static ItineraryManager itineraryManager;

        public static ItineraryManager GetInstance()
        {
            if (itineraryManager == null) { itineraryManager = new ItineraryManager(); }
            return itineraryManager;
        }

        private static Dictionary<Guid,Itinerary> itineraryList = new Dictionary<Guid, Itinerary>();
        public static Guid addItinerary(Itinerary newItinerary)
        {
            Guid guid = Guid.NewGuid();
            itineraryList.Add(guid,newItinerary);
            return guid;
        }

        public static int getNbItineraryActive()
        {
            return itineraryList.Count();
        }

        public static void removeItinerary(Guid uuid)
        {
            itineraryList.Remove(uuid);
        }

        public static Itinerary getItinerary(Guid id)
        {
            if (itineraryList.ContainsKey(id)){return itineraryList[id];}
            else{ throw new NoItineraryFoundException("Aucun itineraire avec cet ID !"); }
        }
    }
}
