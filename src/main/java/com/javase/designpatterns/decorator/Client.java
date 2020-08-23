package com.javase.designpatterns.decorator;

/**
 * @author: Admin
 * @create: 2020/8/22 21:58
 */
public class Client {
    public static void main(String[] args) {
        Car car =new Car();
        car.move();

        System.out.println("增加新的功能，飞行---------");

        FlyCar flyCar =new FlyCar(car);
        flyCar.move();

        System.out.println("增加新的功能，水里游---------");
        WaterCar waterCar =new WaterCar(car);
        waterCar.move();

        System.out.println("增加两个新的功能，飞行，水里游---------");
        WaterCar waterCar2 =new WaterCar(flyCar);
        waterCar2.move();
    }
}
