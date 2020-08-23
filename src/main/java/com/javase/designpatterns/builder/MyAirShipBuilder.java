package com.javase.designpatterns.builder;

/**
 * @author: Admin
 * @create: 2020/8/21 23:42
 */
public class MyAirShipBuilder implements AirShipBuilder { //StringBuilder

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("轨道舱"); //可结合工厂模式
    }

    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("发动机");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("逃逸塔");
    }
}
