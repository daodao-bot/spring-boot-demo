# spring-boot-demo

## 部署

```shell
docker run -d \
  --name spring-boot-demo \
  -p 80:80 \
  -e TZ=Asia/Shanghai \
  -e MYSQL_HOST=localhost \
  daodaobot/spring-boot-demo:latest
```
