# spring-boot-demo

## 部署

```shell
docker run -d \
  --name domain-hunter \
  -p 80:80 \
  -e TZ=Asia/Shanghai \
  -e MYSQL_HOST=localhost \
  daodaobot/domain-hunter:latest
```
