package com.javase.designpatterns.strategy;

/**
 * @author: Admin
 * @create: 2020/8/22 23:57
 */
public class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八折");
        return standardPrice * 0.8;
    }
}
