FROM registry.cn-beijing.aliyuncs.com/daodao-bot/openjdk:21
COPY ./target/*.jar app.jar
VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]