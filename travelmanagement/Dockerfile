FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY out/artifacts/travelmanagement_jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080