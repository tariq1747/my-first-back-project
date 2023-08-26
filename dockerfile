# Use an official OpenJDK runtime as the base image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/demo-3-0.0.1-SNAPSHOT.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]
