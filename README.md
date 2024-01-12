# spring-boot-demo

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
