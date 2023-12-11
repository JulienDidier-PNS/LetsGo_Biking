using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using System.Runtime.Serialization;

namespace CS_Server_Main.Exposed.Objects
{
    [DataContract]
    public class Metadata
    {
        [DataMember]
        public string attribution { get; set; }

        [DataMember]
        public string service { get; set; }

        [DataMember]
        public long timestamp { get; set; }

        [DataMember]
        public Query query { get; set; }

        [DataMember]
        public Engine engine { get; set; }
    }
}
