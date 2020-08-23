package com.javase.designpatterns.factory.simplefactory;

/**
 * @author: Admin
 * @create: 2020/8/21 18:24
 */
public class Byd implements Car{
    @Override
    public void run() {
        System.out.println("比亚迪 run ~！");
    }
}
