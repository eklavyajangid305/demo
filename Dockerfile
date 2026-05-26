FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests
EXPOSE $PORT
CMD ["sh", "-c", "java -jar target/bfhl-0.0.1-SNAPSHOT.jar --server.port=$PORT"]