FROM openjdk:8u111-jdk-alpine

COPY target/springboot-mongo4-sample-1.0.0.war app.war

ENV LOG_DIR=/var/tmp/logs
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.war"]

