using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.Exposed.Objects
{
    [DataContract]
    public class Summary
    {
        [DataMember]
        public double distance { get; set; }

        [DataMember]
        public double duration { get; set; }
    }
}
