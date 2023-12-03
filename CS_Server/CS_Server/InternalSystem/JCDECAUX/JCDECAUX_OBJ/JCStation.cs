using CS_Server.Utils;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace CS_Server.InternalSystem.JCDECAUX.JCDECAUX_OBJ
{
    public class JCStation
    {
        public int number { get; set; }
        public string contractName { get; set; }
        public string name { get; set; }
        public string adress { get; set; }
        public Position position { get; set; }
        public Boolean banking { get; set; }
        public Boolean bonus { get; set; }
        public string status { get; set; }
        public string lastUpdate { get; set; }
        public Boolean connected { get; set; }
        public Boolean overflow { get; set; }
        public string shape { get; set; }
        public JCStands totalStands { get; set; }
        public JCStands mainStands { get; set; }
        public Object overflowStands { get; set; }
    }
}