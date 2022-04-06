FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} taxa-selic-api.jar
ENTRYPOINT ["java","-jar","/taxaSelicApi.jar"]