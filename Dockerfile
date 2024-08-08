FROM openjdk:23-ea-21-jdk-slim

RUN mkdir /home/app
WORKDIR /home/app

COPY target/*.jar /home/app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
