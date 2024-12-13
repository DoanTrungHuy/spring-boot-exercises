FROM openjdk:21

ARG FILE_JAR=target/*.jar

ADD ${FILE_JAR} API-service.jar

ENTRYPOINT ["java", "-jar", "API-service.jar"]

EXPOSE 8088