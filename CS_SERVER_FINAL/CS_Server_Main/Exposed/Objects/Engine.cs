using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.Exposed.Objects
{
    [DataContract]
    public class Engine
    {
        [DataMember]
        public string version { get; set; }

        [DataMember]
        public DateTime build_date { get; set; }

        [DataMember]
        public DateTime graph_date { get; set; }
    }
}
