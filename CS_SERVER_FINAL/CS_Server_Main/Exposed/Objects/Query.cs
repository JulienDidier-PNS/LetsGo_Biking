using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.Exposed.Objects
{
    [DataContract]
    public class Query
    {
        [DataMember]
        public List<List<double>> coordinates { get; set; }

        [DataMember]
        public string profile { get; set; }

        [DataMember]
        public string format { get; set; }
    }
}
