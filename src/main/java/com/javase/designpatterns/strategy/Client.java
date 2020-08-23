package com.javase.designpatterns.strategy;

/**
 * @author: Admin
 * @create: 2020/8/23 0:02
 */
public class Client {
    public static void main(String[] args) {
        Strategy s1 = new OldCustomerManyStrategy();
        Context ctx = new Context(s1);

        ctx.printPrice(998);

    }
}
