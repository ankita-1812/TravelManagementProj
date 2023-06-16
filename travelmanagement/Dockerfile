FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY travelmanagement/out/artifacts/travelmanagement_jar/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
