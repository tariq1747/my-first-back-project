# Use an official OpenJDK runtime as the base image

FROM maven:3.8.5-openjdk-17 AS build

copy . .

RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim



# Copy the JAR file into the container
COPY --from=build target/demo-3-0.0.1-SNAPSHOT.jar demo.jar

EXPOSE 8080

# Run the application
CMD ["java", "-jar", "demo.jar"]
