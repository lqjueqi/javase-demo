package com.javase.designpatterns.strategy;

/**
 * @author: Admin
 * @create: 2020/8/22 23:53
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折，原价");
        return standardPrice;
    }
}
