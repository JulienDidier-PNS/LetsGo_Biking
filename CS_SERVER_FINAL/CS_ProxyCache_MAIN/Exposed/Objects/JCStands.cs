using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_ProxyCache_MAIN.Exposed.Objects
{
    [DataContract]
    public class JCStands
    {
        [DataMember]
        public int capacity { get; set; }

        [DataMember]
        public availabilities availabilities { get; set; }
       
    }
    [DataContract]
    public class availabilities
    {
        [DataMember]
        public int bikes { get; set; }
        [DataMember]
        public int stands { get; set; }
        [DataMember]
        public int mechanicalBikes { get; set; }
        [DataMember]
        public int electricalBikes { get; set; }
        [DataMember]
        public int electricalInternalBatteryBikes { get; set; }
        [DataMember]
        public int electricalRemovableBatteryBikes { get; set; }
    }
}
