FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/Reconectando-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} reconectando.jar

ENTRYPOINT ["java", "-jar","/reconectando.jar"]