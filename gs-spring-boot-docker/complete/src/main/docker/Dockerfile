FROM openjdk:8-jre-alpine
VOLUME /tmp
ARG JAR_FILE
#ADD ${JAR_FILE} app.jar
#WORKAROUND - hardcoding Jar file name since Mvn plugin has bug
ADD gs-spring-boot-docker-0.1.0.jar app.jar 
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]