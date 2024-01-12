# spring-boot-demo

---

## 构建

原生镜像 native image

```shell
mvn spring-boot:build-image -Pnative
```

或者 JVM 镜像

```shell
mvn package
docker build .
```

---

## 部署

```shell
docker run -d \
  --name spring-boot-demo \
  -p 80:80 \
  -e TZ=Asia/Shanghai \
  -e SERVER_PORT=80 \
  daodaobot/spring-boot-demo:latest
```

## 访问

/doc.html
