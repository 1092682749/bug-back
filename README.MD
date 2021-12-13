# 这个仓库用来重现一些bug

## 1. 复现log4j2 远程代码执行bug
1.1 复现步骤
- 先启动 ```java  com.dyz.log4j.bug.back.hacker.Client ```

- 然后启动 ``` com.dyz.log4j.bug.back.server.BusinessServer ```

1.2 参考链接
  <br> https://docs.oracle.com/javase/tutorial/jndi/overview/index.html
  <br> https://logging.apache.org/log4j/2.x/manual/lookups.html 