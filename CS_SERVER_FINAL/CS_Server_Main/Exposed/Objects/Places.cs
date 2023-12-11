
using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Net;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.Exposed.Objects
{
    [DataContract]
    public class Places
    {
        [DataMember]
        public int place_id { get; set; }
        [DataMember]
        public string licence { get; set; }
        [DataMember]
        public string osm_type { get; set; }
        [DataMember]
        public long osm_id { get; set; }
        [DataMember]
        public string lat { get; set; }
        [DataMember]
        public string lon { get; set; }
        [DataMember]
        public string category { get; set; }
        [DataMember]
        public string type { get; set; }
        [DataMember]
        public int place_rank { get; set; }
        [DataMember]
        public double importance { get; set; }
        [DataMember]
        public string addresstype { get; set; }
        [DataMember]
        public string name { get; set; }
        [DataMember]
        public string display_name { get; set; }
        [DataMember]
        public Address address { get; set; }
        [DataMember]
        public List<string> boundingbox { get; set; }
        [DataMember]
        public GeoCoordinate finalCoordinate { get; set; }
    }

}
