package com.javase.designpatterns.factory.simplefactory;

import com.javase.designpatterns.factory.factorymethod.AudiFactory;
import com.javase.designpatterns.factory.factorymethod.BydFactory;

/**
 * @author: Admin
 * @create: 2020/8/21 18:29
 */
public class Client01 {
    public static void main(String[] args) {
        //Car c1 = new Audi();
        //Car c2 = new Byd();

        //简单工厂
        //Car c1 = CarFactory.createCar("奥迪");
        //Car c2 = CarFactory.createCar("比亚迪");
        //Car c1 = CarFactory.createAudi();
        //Car c2 = CarFactory.createByd();

        //工厂方法
        //Car c1 =new AudiFactory().createCar();
        //Car c2 =new BydFactory().createCar();

        //c1.run();
        //c2.run();
    }
}
