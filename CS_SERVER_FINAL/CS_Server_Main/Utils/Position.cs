using System;
using System.Collections.Generic;
using System.Device.Location;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace CS_Server_Main.Utils
{
        [DataContract]
        public class Position
        {
            [DataMember]
            public double longitude;
            [DataMember]
            public double latitude;

            public Position(double longitude, double latitude)
            {
                this.longitude = longitude;
                this.latitude = latitude;
            }

            public double getLongitude() { return longitude; }
            public double getLatitude() { return latitude; }
            public string toString()
            {
                return latitude + "," + longitude;
            }

            public GeoCoordinate toGeoCoordinate()
            {
                return new GeoCoordinate(latitude, longitude);
            }
    }
}
