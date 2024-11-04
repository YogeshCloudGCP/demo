# Use a base image that has Java 21 available
FROM tomcat:9.0.52-jdk21-openjdk-slim

# Set working directory in Tomcat
WORKDIR /usr/local/tomcat/webapps

# Copy the application JAR into the webapps directory of Tomcat
COPY ./target/demo*.jar /usr/local/tomcat/webapps/

# Expose port 8080 to allow external access
EXPOSE 8080

# Run the Tomcat server
CMD ["catalina.sh", "run"]
