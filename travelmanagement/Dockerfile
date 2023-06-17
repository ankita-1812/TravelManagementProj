FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY travelmanagement/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8283
