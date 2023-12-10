using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.ConstrainedExecution;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_ProxyCache_MAIN.Exposed.Objects
{
    [DataContract]
    public class JCStation
    {
        [DataMember]
        public int number { get; set; }
        [DataMember]
        public string contractName { get; set; }
        [DataMember]
        public string name { get; set; }
        [DataMember]
        public string adress { get; set; }
        [DataMember]
        public Position position { get; set; }
        [DataMember]
        public Boolean banking { get; set; }
        [DataMember]
        public Boolean bonus { get; set; }
        [DataMember]
        public string status { get; set; }
        [DataMember]
        public string lastUpdate { get; set; }
        [DataMember]
        public Boolean connected { get; set; }
        [DataMember]
        public Boolean overflow { get; set; }
        [DataMember]
        public string shape { get; set; }
        [DataMember]
        public JCStands totalStands { get; set; }
        [DataMember]
        public JCStands mainStands { get; set; }
        [DataMember]
        public Object overflowStands { get; set; }
       
    }
}
