using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.Exposed.Objects
{
    [DataContract]
    public class Step
    {
        [DataMember]
        public double distance { get; set; }

        [DataMember]
        public double duration { get; set; }

        [DataMember]
        public int type { get; set; }

        [DataMember]
        public string instruction { get; set; }

        [DataMember]
        public string name { get; set; }

        [DataMember]
        public List<int> way_points { get; set; }
    }
}
