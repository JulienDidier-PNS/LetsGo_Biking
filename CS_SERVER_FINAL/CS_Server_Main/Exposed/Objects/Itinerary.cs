using CS_Server_Main.Exposed.Objects;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;


[DataContract]
public class Itinerary
{
    [DataMember]
    public List<double> bbox { get; set; }

    [DataMember]
    public List<Route> routes { get; set; }

    [DataMember]
    public Metadata metadata { get; set; }




   

    

   
}
