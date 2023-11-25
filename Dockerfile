# Use the official OpenJDK base image for Java 17
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/cicd-0.0.1-SNAPSHOT.jar /app/cicd-0.0.1-SNAPSHOT.jar

# Expose the port the app runs on
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "cicd-0.0.1-SNAPSHOT.jar"]
