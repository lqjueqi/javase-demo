package com.javase.designpatterns.factory.factorymethod;

import com.javase.designpatterns.factory.simplefactory.Byd;
import com.javase.designpatterns.factory.simplefactory.Car;

/**
 * @author: Admin
 * @create: 2020/8/21 21:56
 */
public class BydFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Byd();
    }
}
