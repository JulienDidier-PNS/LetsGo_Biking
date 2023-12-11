using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.InternalSystem.RoutingSystem
{
    [DataContract]
    public enum COMPUTE_METHOD {
        [EnumMemberAttribute]
        [Description("SHORTEST_DISTANCE")]
        SHORTEST_DISTANCE,
        [Description("SHORTEST_TIME")]
            [EnumMemberAttribute]
        SHORTEST_TIME
    }
}
