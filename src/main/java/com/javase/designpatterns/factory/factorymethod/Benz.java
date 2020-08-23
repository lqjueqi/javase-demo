package com.javase.designpatterns.factory.factorymethod;

/**
 * @author: Admin
 * @create: 2020/8/21 22:10
 */
public class Benz implements Car{
    @Override
    public void run() {
        System.out.println("奔驰 run ~！");
    }
}
