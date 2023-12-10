using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_ProxyCache_MAIN.Exposed.Objects
{
    [DataContract]
    public class JCContrat
    {
        [DataMember]
        public string name { get; set; }
        [DataMember]
        public string commercial_name { get; set; }
        [DataMember]
        public string[] cities { get; set; }
        [DataMember]
        public string country_code { get; set; }
    }
}
