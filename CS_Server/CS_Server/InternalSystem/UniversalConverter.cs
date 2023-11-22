using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Web;
using System.IO;
using System.Text.Json;
using System.Text.Json.Nodes;
using System.Text.Json.Serialization;
using Newtonsoft.Json;

namespace CS_Server.InternalSystem
{
    public static class UniversalConverter
    {
        public async static void inputToCompleteAdress(string input)
        {
            //recupération des adresses trouvées par OPENSTREETMAP
            var correctStartingAdress = await RequestManager.getCompleteAdress(input);

            //on convertit le json en objet dynamic -> permet de prendre ce qu'on veut
            dynamic adress = JsonConvert.DeserializeObject<dynamic[]>(correctStartingAdress);
            int nb_adress = adress.Length;

            //TODO -> RETOURNER L'ADRESSE
            
            string[] adresses = new string[nb_adress];

            //on copie les adresses dans le tableau
            for (int i = 0; i < adress.Length ;i++){adresses[i] = adress[i].display_name;}
            //on affiche les adresses
            for(int i = 0;i < adresses.Length ;i++){Console.WriteLine(adresses[i]);}
        }
    }
}