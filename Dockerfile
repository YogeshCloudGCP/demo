FROM tomcat:9.0.52-jre21-openjdk-slim
COPY ./target/demo*.jar /usr/local/tomcat/webapps
EXPOSE 8080
USER demo
WORKDIR /user/local/tomcat/webapps
CMD ["catalina.sh", "run"]