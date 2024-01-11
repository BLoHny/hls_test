FROM maven:3.8.3-openjdk-17 AS MAVEN_BUILD

MAINTAINER rubycpp1225@outlook.kr

COPY src /build/src/

WORKDIR /build/

FROM openjdk:17-jdk

ADD build/libs/test-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]