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
    public enum MEANS_TRANSPORT
    {
        [EnumMemberAttribute]
        [Description("BICYCLE")]
        BICYCLE,
        [EnumMemberAttribute]
        [Description("PEDESTRIAN")]
        PEDESTRIANS,
        CAR
    }
}
