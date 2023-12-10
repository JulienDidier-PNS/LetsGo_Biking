using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.Exposed.Objects
{
    [DataContract]
    public class Address
    {
        [DataMember]
        public string road { get; set; }
        [DataMember]
        public string neighbourhood { get; set; }
        [DataMember]
        public string suburb { get; set; }
        [DataMember]
        public string town { get; set; }
        [DataMember]
        public string municipality { get; set; }
        [DataMember]
        public string county { get; set; }
        [DataMember]

        [JsonProperty("ISO3166-2-lvl6")]
        public string ISO31662lvl6 { get; set; }
        [DataMember]
        public string state { get; set; }
        [DataMember]

        [JsonProperty("ISO3166-2-lvl4")]
        public string ISO31662lvl4 { get; set; }
        [DataMember]
        public string region { get; set; }
        [DataMember]
        public string postcode { get; set; }
        [DataMember]
        public string country { get; set; }
        [DataMember]
        public string country_code { get; set; }
    }
}
