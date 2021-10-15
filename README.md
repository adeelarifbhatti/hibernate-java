import the project in the eclipse as maven project, make the run configuration appropriate i.e. mvn clean package and click on runas and run the maven build task.
The copy the hibernate-java-0.0.1-SNAPSHOT.jar to Docker folder and rename the hibernate-java-0.0.1-SNAPSHOT.jar file to hibernate-java.jar, 
then run docker-compose up


The docker-compose.yml is the file for two containers, second is for the mysql and first is deployment of the image from Dockerfile.

The put command takes 5 parameter and they should be comma separated, e.g. 
put,1,2,3,4,5
value 1 is the primary key, it stores the data in the database.

The get command take 1 parameter e.g. get,1
1 is the primary key, it should get the values from the database.
