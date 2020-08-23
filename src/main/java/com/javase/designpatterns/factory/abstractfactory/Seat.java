package com.javase.designpatterns.factory.abstractfactory;

/**
 * @author: Admin
 * @create: 2020/8/21 23:07
 */
public interface Seat {
    void message();
}

class LuxurySeat implements Seat{

    @Override
    public void message() {
        System.out.println("可以自动按摩！");
    }
}


class LowSeat implements Seat{

    @Override
    public void message() {
        System.out.println("不能按摩！");
    }
}
