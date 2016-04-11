FROM jboss/wildfly

#Add users
RUN /opt/jboss/wildfly/bin/add-user.sh admin Admin#70365 --silent
RUN /opt/jboss/wildfly/bin/add-user.sh readuser password -a -g app --silent
RUN /opt/jboss/wildfly/bin/add-user.sh writeuser password1 -a -g app --silent

#Add MySQL Driver
ADD add_modules.sh /tmp
# http://central.maven.org/maven2/mysql/mysql-connector-java/5.1.38/mysql-connector-java-5.1.38.jar
ADD mysql-connector-java-5.1.38.jar /tmp/mysql-connector-java.jar
RUN source /tmp/add_modules.sh

#Run
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]