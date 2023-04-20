#
# Build stage
#
FROM maven:3.8.2-jdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:11-jdk-slim
COPY --from=build /target/Online_Medical_System-0.0.1-SNAPSHOT.jar Online_Medical_System.jar
# ENV PORT=8080
EXPOSE 5050
ENTRYPOINT ["java","-jar","Online_Medical_System.jar"]