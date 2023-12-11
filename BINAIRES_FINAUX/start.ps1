Start-Process -Verb RunAs "CS_PROXY_CACHE\CS_ProxyCache_MAIN.exe"
Start-Sleep -Seconds 1
Start-Process -Verb RunAs "CS_SERVER/CS_Server_Main.exe"
Start-Sleep -Seconds 1
cd apache-activemq-5.17.0/bin/win64/
Start-Process -Verb RunAs "./activemq.bat" 
cd ../../../
Start-Sleep -Seconds 1
cd ../Java_Client
cmd.exe /c "mvn exec:java" 
cd ../BINAIRES_FINAUX