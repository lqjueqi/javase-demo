package com.javase.designpatterns.factory.factorymethod;

import com.javase.designpatterns.factory.simplefactory.Audi;
import com.javase.designpatterns.factory.simplefactory.Car;

/**
 * @author: Admin
 * @create: 2020/8/21 21:54
 */
public class AudiFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Audi();
    }
}
