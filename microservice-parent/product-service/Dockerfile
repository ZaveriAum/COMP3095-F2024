#--------------
# Build Stage
#--------------
FROM gradle:8-jdk22-alpine AS build

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src

RUN gradle build -x test


#--------------
#Package
#--------------
FROM openjdk:22-jdk

RUN mkdir /app

COPY --from=builder /home/gradle/src/build/libs/*jar /app/product-service.jar

ENV MONGO_DB_USERNAME=admin \
    MONGO_DB_PASSWORD=password

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "product-service.jar"]

