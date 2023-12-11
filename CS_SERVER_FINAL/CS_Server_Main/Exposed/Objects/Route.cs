using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Runtime.Serialization;
using static Itinerary;

namespace CS_Server_Main.Exposed.Objects
{
    [DataContract]
    public class Route
    {
        [DataMember]
        public Summary summary { get; set; }

        [DataMember]
        public List<Segment> segments { get; set; }

        [DataMember]
        public List<double> bbox { get; set; }

        [DataMember]
        public string geometry { get; set; }

        [DataMember]
        public List<int> way_points { get; set; }

        [DataMember]
        public List<object> legs { get; set; }
    }
}
