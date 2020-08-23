package com.javase.designpatterns.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author: Admin
 * @create: 2020/8/22 21:25
 */
public class Client {
    public static void main(String[] args) {
        Star realStar= new RealStar();

        StarHandler handler =new StarHandler(realStar);

        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);

        proxy.bookTicket();
        proxy.sing();
    }
}
