using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.Json;
using System.Text.Json.Nodes;
using System.Threading.Tasks;

namespace CS_Server_Main.Utils
{
    public static class GeometryDecoder
    {
        internal static List<List<double>> DecodeGeometry(string encodedGeometry, bool inclElevation)
        {
            List<List<double>> geometry = new List<List<double>>();
            int len = encodedGeometry.Length;
            int index = 0;
            int lat = 0;
            int lng = 0;
            int ele = 0;

            while (index < len)
            {
                int result = 1;
                int shift = 0;
                int b;

                do
                {
                    b = encodedGeometry[index++] - 63 - 1;
                    result += b << shift;
                    shift += 5;
                } while (b >= 0x1f);

                lat += (result & 1) != 0 ? ~(result >> 1) : (result >> 1);

                result = 1;
                shift = 0;
                do
                {
                    b = encodedGeometry[index++] - 63 - 1;
                    result += b << shift;
                    shift += 5;
                } while (b >= 0x1f);

                lng += (result & 1) != 0 ? ~(result >> 1) : (result >> 1);

                if (inclElevation)
                {
                    result = 1;
                    shift = 0;
                    do
                    {
                        b = encodedGeometry[index++] - 63 - 1;
                        result += b << shift;
                        shift += 5;
                    } while (b >= 0x1f);

                    ele += (result & 1) != 0 ? ~(result >> 1) : (result >> 1);
                }

                List<double> location = new List<double>
            {
                lat / 1E5,
                lng / 1E5
            };

                if (inclElevation)
                {
                    location.Add((double)ele / 100);
                }

                geometry.Add(location);
            }

            return geometry;
        }
    }
}
