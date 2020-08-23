package com.javase.designpatterns.factory.simplefactory;

/**
 * @author: Admin
 * @create: 2020/8/21 18:23
 */
public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("奥迪 run ~！");
    }
}
