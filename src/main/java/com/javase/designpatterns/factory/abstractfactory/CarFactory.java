package com.javase.designpatterns.factory.abstractfactory;

/**
 * @author: Admin
 * @create: 2020/8/21 23:11
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}