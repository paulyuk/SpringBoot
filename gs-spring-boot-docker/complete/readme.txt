Build Docker image and push to ACR
mvn package docker:build -DpushImage

Build Jar, Docker image, push to ACR and deploy web app
mvn clean package

mvn azure-webapp:deploy

