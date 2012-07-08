#Sample_JBossAS7_Clustered_App

##Install

	mkdir /opt/jboss
	cd /opt/jboss
	tar xvfz jboss-as-7.1.1.Final.tar.gz
	
Clone the sample project :

	cd /tmp
	git clone https://github.com/lionelg3/Sample_JBossAS7_Clustered_App.git


##Start
Start 2 jbossas7 instances using the following command lines :

	cd /op/jboss/jboss-as-7.1.1.Final/

	./bin/standalone.sh -server-config=standalone-ha.xml \
	 -Djboss.node.name=SERVER1
	 
	./bin/standalone.sh -server-config=standalone-ha.xml \
	-Djboss.socket.binding.port-offset=10 \
	-Djboss.node.name=SERVER2
	
##Build and deploy

	cd /tmp/Sample_JBossAS7_Clustered_App/
	mvn clean package
	
Open the following URL : [http://localhost:8080/guestbook/](http://) and see the session creation date.
Reload, the page few times.

Shutdown the JBoss instance on port 8080 and the open the following URL : [http://localhost:8090/guestbook/](http://) and see the app fallback.

#Requirements
Use the JBoss public Maven repository settings.
[https://community.jboss.org/wiki/MavenGettingStarted-Users](http://)

	
	