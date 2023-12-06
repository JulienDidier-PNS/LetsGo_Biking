using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

[DataContract]
public class Itinerary_OBJ
{
    [DataMember]
    public List<double> bbox { get; set; }

    [DataMember]
    public List<Route> routes { get; set; }

    [DataMember]
    public Metadata metadata { get; set; }

    [DataContract]
    public class Engine
    {
        [DataMember]
        public string version { get; set; }

        [DataMember]
        public DateTime build_date { get; set; }

        [DataMember]
        public DateTime graph_date { get; set; }
    }

    [DataContract]
    public class Metadata
    {
        [DataMember]
        public string attribution { get; set; }

        [DataMember]
        public string service { get; set; }

        [DataMember]
        public long timestamp { get; set; }

        [DataMember]
        public Query query { get; set; }

        [DataMember]
        public Engine engine { get; set; }
    }

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

    [DataContract]
    public class Route
    {
        [DataMember]
        public Summary summary { get; set; }

        [DataMember]
        public List<Segment> segments { get; set; }

        [DataMember]
        public List<double> bbox { get; set; }

        [DataMember]
        public string geometry { get; set; }

        [DataMember]
        public List<int> way_points { get; set; }

        [DataMember]
        public List<object> legs { get; set; }
    }

    [DataContract]
    public class Segment
    {
        [DataMember]
        public double distance { get; set; }

        [DataMember]
        public double duration { get; set; }

        [DataMember]
        public List<Step> steps { get; set; }
    }

    [DataContract]
    public class Step
    {
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
    }

    [DataContract]
    public class Summary
    {
        [DataMember]
        public double distance { get; set; }

        [DataMember]
        public double duration { get; set; }
    }
}
