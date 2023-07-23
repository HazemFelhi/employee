FROM openjdk:17-oracle
WORKDIR /app
# Copy the application source code to the container
COPY target/ms-employe-0.0.1-SNAPSHOT.jar ./app/ms-employee.jar


# Set the entrypoint command to run the application
ENTRYPOINT ["java", "-jar", "ms-employee.jar"]