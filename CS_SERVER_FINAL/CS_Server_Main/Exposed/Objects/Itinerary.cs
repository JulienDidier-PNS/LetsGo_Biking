using CS_Server_Main.Exposed.Objects;
using CS_Server_Main.JCDecaux_API;
using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;


[DataContract]
public class Itinerary
{
    [DataMember]
    public string typeOfItinerary;
    [DataMember]
    public GeoCoordinate firstStationPosition;
    [DataMember] 
    public GeoCoordinate lastStationPosition;
    [DataMember]
    public List<double> bbox { get; set; }

    [DataMember]
    public List<Route> routes { get; set; }

    [DataMember]
    public Metadata metadata { get; set; }
    [DataMember]
    public int currentPosition;
    [DataMember]
    public int totalSteps;
}
