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
        private static string SEPARATOR = "::";
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

        public static String serialize(Step step)
        {
            String serializable = "";
            serializable += step.instruction+ SEPARATOR + step.duration+ SEPARATOR + step.distance+SEPARATOR + step.name+SEPARATOR;
            foreach (var item in step.way_points){serializable += item + SEPARATOR;}
            return serializable;
        }
    }
}
