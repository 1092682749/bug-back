# 这个仓库用来重现一些bug

## 1. 复现log4j2 远程代码执行bug

1.1 复现步骤

- 先启动 ```java  com.dyz.log4j.bug.back.hacker.Client ```

- 然后启动 ```java com.dyz.log4j.bug.back.server.BusinessServer ```


- 说明(tree /f)
- com.dyz.log4j.bug.back.hacker 包下用来模拟黑客攻击
- com.dyz.log4j.bug.back.server 包下用来模拟业务服务器(被攻击)

<br>├─hacker --模拟黑客
<br>│&nbsp;&nbsp;&nbsp;&nbsp; │ Client.java -- 黑客的攻击服务
<br>│&nbsp;&nbsp;&nbsp;&nbsp; │
<br>│&nbsp;&nbsp;&nbsp;&nbsp; └─logic
<br>│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Attack.java -- 黑客的攻击逻辑
<br>│
<br>└─server --模拟业务服务器
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;BusinessServer.java

1.3 参考链接
<br> https://docs.oracle.com/javase/tutorial/jndi/overview/index.html
<br> https://logging.apache.org/log4j/2.x/manual/lookups.html 