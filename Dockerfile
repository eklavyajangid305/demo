FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
RUN chmod +x mvnw
COPY src src
RUN ./mvnw clean package -DskipTests
RUN ls -la target/
CMD ["sh", "-c", "java -jar target/*.jar --server.port=$PORT"]