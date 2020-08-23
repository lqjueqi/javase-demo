package com.javase.designpatterns.strategy;

/**
 * @author: Admin
 * @create: 2020/8/22 23:56
 */
public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八五折");
        return standardPrice * 0.85;
    }
}
