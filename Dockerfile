FROM openjdk:17-alpine

WORKDIR /opt/app

RUN apk update && apk upgrade

COPY . .

RUN ./mvnw install

CMD ["./mvnw", "spring-boot:run"]
