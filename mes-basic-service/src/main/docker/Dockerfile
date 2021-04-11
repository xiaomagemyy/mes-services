FROM openjdk:8-jdk-alpine
MAINTAINER Unilever
ARG JAR_FILE
VOLUME /tmp
ADD ${JAR_FILE} mes-basic-service.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xmx128m", "-Xms128m", "-jar", "/mes-basic-service.jar"]