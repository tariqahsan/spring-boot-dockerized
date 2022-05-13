# Multi Stage build

# Base Image and name stage as "builder"
FROM maven:3-openjdk-15 AS builder

# Create App Directory inside our container
WORKDIR /tariqahsan/app/src/

# Copy files
COPY src ./
COPY pom.xml ../

RUN mvn -f /tariqahsan/app/pom.xml clean package

#### 2nd Stage ####

FROM openjdk:15.0.1

WORKDIR /tariqahsan/lib/

# Copy the Jar from the first Stage (builder) to the 2nd stage working directory
COPY --from=builder /tariqahsan/app/target/spring-boot-dockerized-0.0.1-SNAPSHOT.jar ./sb-dockerized.jar

# Expose the port to the inner container communication network
EXPOSE 3100

# Run the Java Application
ENTRYPOINT [ "java","-jar","/tariqahsan/lib/sb-dockerized.jar"]

