FROM openjdk:8-jdk-alpine
COPY --from=build /travelmanagement/target/travelmanagement-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8283
