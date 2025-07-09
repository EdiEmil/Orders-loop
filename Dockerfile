# Dockerfile
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/*.jar order.jar
ENTRYPOINT ["java", "-jar", "order.jar"]
