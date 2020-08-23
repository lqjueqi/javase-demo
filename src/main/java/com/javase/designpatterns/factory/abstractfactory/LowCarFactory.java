package com.javase.designpatterns.factory.abstractfactory;

/**
 * @author: Admin
 * @create: 2020/8/21 23:15
 */
public class LowCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
