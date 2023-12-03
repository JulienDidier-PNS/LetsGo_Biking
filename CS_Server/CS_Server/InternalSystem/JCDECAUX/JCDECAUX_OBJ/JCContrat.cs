using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace CS_Server.InternalSystem.JCDECAUX.JCDECAUX_OBJ
{
    public class JCContrat
    {
        public string name { get; set; }
        public string commercial_name { get; set; }
        public string[] cities { get; set; }
        public string country_code { get; set; }
    }
}