# Use OpenJDK 21 as the base image
FROM openjdk:21-jdk-slim

# Set environment variables
ENV TOMCAT_VERSION=9.0.52
ENV CATALINA_HOME=/usr/local/tomcat
ENV PATH="$CATALINA_HOME/bin:$PATH"

# Install wget and download & set up Tomcat
RUN apt-get update && \
    apt-get install -y wget && \
    wget https://archive.apache.org/dist/tomcat/tomcat-9/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz && \
    tar -xzf apache-tomcat-${TOMCAT_VERSION}.tar.gz -C /usr/local && \
    mv /usr/local/apache-tomcat-${TOMCAT_VERSION} $CATALINA_HOME && \
    rm apache-tomcat-${TOMCAT_VERSION}.tar.gz && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Copy the JAR file into the Tomcat webapps directory
COPY ./target/demo*.jar $CATALINA_HOME/webapps/

# Expose port 8080 for Tomcat
EXPOSE 8080

# Set up a non-root user to run Tomcat
RUN useradd -ms /bin/bash demo && \
    chown -R demo:demo $CATALINA_HOME

# Switch to the non-root user
USER demo

# Set the working directory
WORKDIR $CATALINA_HOME/webapps

# Run Tomcat
CMD ["catalina.sh", "run"]

