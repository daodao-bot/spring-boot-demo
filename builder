FROM registry.cn-beijing.aliyuncs.com/daodao-bot/maven:latest AS builder
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -Dmaven.test.skip=true

FROM registry.cn-beijing.aliyuncs.com/daodao-bot/openjdk:21
COPY --from=builder /build/target/*.jar app.jar
VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
