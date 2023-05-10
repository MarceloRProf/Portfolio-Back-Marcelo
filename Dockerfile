FROM openjdk:14-jdk-alpine
MAINTAINER MarceloRiss
COPY target/msr-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]