# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim as build

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY ./target/ems-backend-0.0.1-SNAPSHOT.jar /app/my-app.jar

# Expose the port that the application will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/my-app.jar"]


#docker build -t ems-backend .
#docker run -p 8080:8080 ems-backend

