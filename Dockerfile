FROM openjdk:17.0.2

COPY build/libs/hello-appinsights-0.0.1-SNAPSHOT.jar /app.jar
COPY applicationinsights-agent-3.2.8.jar /applicationinsights-agent-3.2.8.jar

EXPOSE 8080
ENTRYPOINT ["java", "-javaagent:/applicationinsights-agent-3.2.8.jar", "-jar", "/app.jar"]