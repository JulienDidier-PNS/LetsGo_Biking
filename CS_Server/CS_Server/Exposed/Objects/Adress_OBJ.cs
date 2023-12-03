using CS_Server.InternalSystem;
using GeoCoordinatePortable;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace CS_Server.Exposed.Objects
{
    public class Adress_OBJ
    {
        public string road { get; set; }
        public string city { get; set; }
        public string postcode { get; set; }
        public string region { get; set; }
        public string country { get; set; }
        public GeoCoordinate coordinates { get; set; }

        public override string ToString() {
            string toReturn = "";
            toReturn += "Road : " + road + " | city : " + city + " | postcode : " + postcode + " | region : " + region + " | country : " + country + " | coordonates : lat-> "+ coordinates.Latitude + " | lon -> "+coordinates.Longitude;
            return toReturn;
        }  
    }
}