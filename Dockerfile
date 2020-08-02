FROM node:12 as frontend-builder

COPY ./ ./

WORKDIR frontend


RUN npm i

RUN npm run build


FROM maven:3.6-jdk-8 as builder

COPY --from=frontend-builder ./ ./

RUN mvn clean package -U -DskipTests

FROM openjdk:8

ENV DEVICES_SPRING_PROFILE default

EXPOSE 8080

WORKDIR /app


COPY --from=builder /target/devices-0.0.1-SNAPSHOT.jar ./devices.jar



CMD java -jar devices.jar --spring.profiles.active=$DEVICES_SPRING_PROFILE


