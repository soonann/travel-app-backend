FROM openjdk:17-alpine

ARG DATABASE_USERNAME
ARG DATABASE_PASSWORD
ARG DATABASE_HOST
ARG DATABASE_NAME
ARG AWS_COGNITO_ISSUER_URI

WORKDIR /opt/app

RUN apk update && apk upgrade

COPY . .

RUN ./mvnw install

CMD ["./mvnw", "spring-boot:run"]
