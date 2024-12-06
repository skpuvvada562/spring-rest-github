# Use an official OpenJDK 17 image as the base image
FROM openjdk:23

# Expose the port on which the application will run
EXPOSE 8080

# Copy the application's JAR file to the container
ADD target/springboot-github-actions.jar springboot-github-actions.jar


# Define the command to run the application
ENTRYPOINT ["java", "-jar", "/springboot-github-actions.jar"]
