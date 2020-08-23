package com.javase.designpatterns.proxy.staticproxy;

/**
 * @author: Admin
 * @create: 2020/8/22 20:25
 */
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy =new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();

        proxy.sing();

        proxy.collectMoney();
    }
}
