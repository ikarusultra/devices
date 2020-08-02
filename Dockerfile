
FROM maven:3.6-jdk-8 as builder

WORKDIR /app

COPY ./ ./

RUN mvn com.github.eirslett:frontend-maven-plugin:1.7.6:install-node-and-npm -DnodeVersion="v12.14.0" -X -e -U

RUN mvn clean package -U -DskipTests


FROM openjdk:8

ENV DEVICES_SPRING_PROFILE default

EXPOSE 8080

WORKDIR /app

COPY --from=builder /app ./


CMD java -jar target/devices-service-1.0-SNAPSHOT.jar --spring.profiles.active=$DEVICES_SPRING_PROFILE


