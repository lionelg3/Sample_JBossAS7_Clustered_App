# Sample_JBossAS7_Clustered_App

Run 2 jbossas7 instance using the following command lines :

./bin/standalone.sh -server-config=standalone-ha.xml -Djboss.node.name=SERVER1
./bin/standalone.sh -server-config=standalone-ha.xml -Djboss.socket.binding.port-offset=10 -Djboss.node.name=SERVER2