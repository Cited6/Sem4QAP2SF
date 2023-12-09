# Use the official OpenJDK image as a base image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY target/Sem4QAPSF-1.0-SNAPSHOT.jar /app

# Expose the port that the application will run on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "Sem4QAPSF-1.0-SNAPSHOT.jar"]
