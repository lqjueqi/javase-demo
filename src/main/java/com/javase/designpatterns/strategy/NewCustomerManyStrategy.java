package com.javase.designpatterns.strategy;

/**
 * @author: Admin
 * @create: 2020/8/22 23:54
 */
public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打九折");
        return standardPrice * 0.9;
    }
}
