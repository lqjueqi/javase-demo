package com.javase.designpatterns.factory.abstractfactory;

/**
 * @author: Admin
 * @create: 2020/8/21 23:13
 */
public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
