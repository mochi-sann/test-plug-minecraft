#java -jar -Xms1024M -Xmx1024M paper-1.19.2-246.jar --nogui
java -jar -XX:+UseG1GC -Dsun.rmi.dgc.server.gcInterval=2147483646 -XX:+UnlockExperimentalVMOptions -XX:G1NewSizePercent=20 -XX:G1ReservePercent=20 -XX:MaxGCPauseMillis=50 -XX:G1HeapRegionSize=32M ./test/paper-1.19.2-246.jar --nogui
