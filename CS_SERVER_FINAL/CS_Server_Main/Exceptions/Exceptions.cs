using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.Services.Protocols;

namespace CS_Server_Main.Exceptions
{
    [Serializable]
    public class NoStationsFoundException : Exception
    {
        public NoStationsFoundException(string message) : base(message)
        {
        }
    }
    public class NoItineraryFoundException : Exception{public NoItineraryFoundException(string message) : base(message){}}
}
