# Usar una imagen de gradle que monte jdk-11:

# Build Stage
FROM  openjdk:11 AS base
WORKDIR /opt/hello-spring
COPY ./ ./
RUN chmod 777 ./
CMD ./gradlew assemble

#Runtime Stage
FROM amazoncorretto:11
WORKDIR /opt/hello-spring
RUN chmod 777 ./
COPY --from=base /opt/hello-spring/build/libs/hello-spring-1.0.0-SNAPSHOT.jar ./

#Deploy Stage
CMD java -jar hello-spring-1.0.0-SNAPSHOT.jar