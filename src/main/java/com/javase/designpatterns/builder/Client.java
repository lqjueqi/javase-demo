package com.javase.designpatterns.builder;

/**
 * @author: Admin
 * @create: 2020/8/21 23:52
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());
        AirShip ship = director.directAirShip();
        System.out.println(ship.getEngine().getName());
        ship.launch();
    }
}
