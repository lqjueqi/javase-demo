package com.javase.designpatterns.proxy.dynamicproxy;

/**
 * @author: Admin
 * @create: 2020/8/22 20:20
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStart.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStart.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStart.bookTicket()");
    }

    @Override
    public void sing() {
        System.out.println("RealStart(本人).sing()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStart.collectMoney()");
    }
}
