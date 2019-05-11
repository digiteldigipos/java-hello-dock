FROM openjdk:8-jdk-alpine

MAINTAINER asiregar310

COPY target/hello-dock-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR ./app

EXPOSE 6788

CMD ["java", "-jar", "app.jar"]

