# LETSGO BIKING - JULIEN DIDIER

## How to launch the project 🚀 ?

### Content
    /apache-activemq-5.17.0
    /BINAIRES_FINAUX
    /CODES
        ...
        autoload.php
    /web
    composer.json


## Résumé de l'avancée 🌐

Toutes les parties sont couvertes (hormis la carte)
- ActiveMQ fonctionnel
    - besoin d'un ID d'itinéraire (correspondant à l'ID de la queue)
    - renvoie par vague de 10 étapes

- Proxy/Cache Fonctionnel
    - Proxy :
        - Fais les requêtes JC_Decaux
    - Cache :
        - Cache créé pour ce projet (n'est pas un cache générique)

## Proxy-Cache :
Création d'un "JCDecaux_service" qui contient les données en cache.
-  Les contrats 📜 si la dernière update date de +1 semaine
- Il update les contrats à chaques requête </br> *(je suis partit du principe qu'il faut avoir l'information en temps réel dès que l'utilisateur veut avoir une information)*

---

## Serveur de routing
### Méthode de routing 📈📍:

- Si le trajet est plus cours en vélo en terme de temps
    - Marche 🚶
    - Prochaine station dispo pour prendre un vélo 🏪
    - trajet à vélo 🚲
    - Prochaine station dispo pour poser le vélo 🏪
    - Marche jusqu'à l'arrivée 🚶
---

### 

