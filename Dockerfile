FROM openjdk:21-jdk-slim AS build
WORKDIR /app

# Install Maven manually
RUN apt-get update && \
    apt-get install -y curl && \
    curl -fsSL https://downloads.apache.org/maven/maven-3/3.9.4/binaries/apache-maven-3.9.4-bin.tar.gz | tar -xz -C /opt && \
    ln -s /opt/apache-maven-3.9.4/bin/mvn /usr/bin/mvn

COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=build /app/target/teachToMe-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]