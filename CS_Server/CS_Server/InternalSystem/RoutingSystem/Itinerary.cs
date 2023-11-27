using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Web;

namespace CS_Server.InternalSystem.Itinerary
{
    [DataContract]
    public class Itinerary
    {
        [DataMember]
        List<Step> steps;

        public Itinerary(){steps = new List<Step>();}

    }
}