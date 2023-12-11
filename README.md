# LETSGO BIKING - JULIEN DIDIER

## How to launch the project 🚀 ?

### Content
    /BINAIRES_FINAUX
        /apache-active-mq-5.7.0
            /w64
                apache.bat
        /CS_PROXY_CACHE    
            ...
            CS_PROXY_MAIN.exe
        /CS_SERVER
            ...
            CS_SERVER.exe
        start.ps1              
        /Java_Client
            ...
        ...

### Featrures Needed
**Java 17** 🍵/ **powershell**
### Running
(go in BINAIRES_FINAUX)
Open shell (as administrator)
And run :
```
./start.ps1
```
#### It would start :
1. ProxyCache
2. Routing Server
3. ActiveMQ
4. Java CLIENT 

*All adresses are showed in their respective windows*

## Current project status 🌐

All parts are covered (except the map 📍)
- ActiveMQ ✅
    - need the itineraryID (wich correspond to the queue ID) to get the instrcutions steps
    - the client get 10 messages per pull

- Proxy/Cache ✅
- Routing Server ✅

## PROXY-CACHE :
Creation of an service named "JCDecaux_service" wich contains all values in the "JCDecaux_Cache".
- Contracts are update📜 if the last update is more than 1 week
- The service update stations at every request </br> *(i assumed that the client need to get the real time information when he wants to get an available sattion)*

- Cache is not a generic cache

---

## ROUTING SERVER
### Routing method 📈📍:

-if the itinerary is shorter in time (see instruction below)
    - Walking🚶
    - next available station with bike 🏪
    - biking itinerary 🚲
    - next available station with bike🏪
    - walkking 🚶

**In default, we send the shorter itinerary in time !**
---

## JAVA CLIENT
The user can ask between 4 options :
1. Walking itinerary
2. Bicycle itinerary
3. Shorter itinerary in time
4. Shorter itinierary in distance 

The user can use ActiveMQ or not

