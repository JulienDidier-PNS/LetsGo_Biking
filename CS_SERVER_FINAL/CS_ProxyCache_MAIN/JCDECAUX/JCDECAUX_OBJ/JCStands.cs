using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.InternalSystem.JCDECAUX.JCDECAUX_OBJ
{
    public class JCStands
    {
        public int capacity { get; set; }
        public class availabilities
        {
            public int bikes { get; set; }
            public int stands { get; set; }
            public int mechanicalBikes { get; set; }
            public int electricalBikes { get; set; }
            public int electricalInternalBatteryBikes { get; set; }
            public int electricalRemovableBatteryBikes { get; set; }
        }
    }
}
