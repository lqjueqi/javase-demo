package com.javase.designpatterns.decorator;

/**
 * @author: Admin
 * @create: 2020/8/22 21:50
 * 抽象组件
 */
public interface ICar {
    void move();
}

//真实对象
class Car implements ICar{

    @Override
    public void move() {
        System.out.println("陆地上跑！");
    }
}

//装饰角色
class SuperCar implements ICar{

    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

//具体装饰
class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    public void Fly(){
        System.out.println("天上飞！");
    }

    @Override
    public void move() {
        super.move();
        Fly();
    }
}

//具体装饰
class WaterCar extends SuperCar{

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水上游！");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

//具体装饰
class AICar extends SuperCar{

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动跑！");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}