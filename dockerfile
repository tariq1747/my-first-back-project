# Use an official OpenJDK runtime as the base image
FROM openjdk:17



# Copy the JAR file into the container
ADD target/demo-3-0.0.1-SNAPSHOT.jar demo-3-0.0.1-SNAPSHOT.jar

# Run the application
CMD ["java", "-jar", "demo-3-0.0.1-SNAPSHOT.jar"]
