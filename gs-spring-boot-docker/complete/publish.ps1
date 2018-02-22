mvn clean package
mvn package docker:build -DpushImage
mvn azure-webapp:deploy