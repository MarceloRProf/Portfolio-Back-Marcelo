FROM amazoncorretto:11
MAINTAINER MarceloRiss
COPY target/msr-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]