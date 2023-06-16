FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY out/artifacts/travelmanagement_jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080