package com.javase.designpatterns.factory.simplefactory;

/**
 * @author: Admin
 * @create: 2020/8/21 19:50
 */
public class CarFactory {
    public static Car createCar(String name) {
        Car car = null;
        if ("奥迪".equals(name)) {
            car = new Audi();
        } else if ("比亚迪".equals(name)) {
            car = new Byd();
        }
        return car;
    }


    public static Car createAudi(){
        return new Audi();
    }

    public static Car createByd(){
        return new Byd();
    }
}
