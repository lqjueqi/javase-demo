package com.javase.designpatterns.observer2;


/**
 * @author: Admin
 * @create: 2020/8/23 0:46
 */
public class Client {
    public static void main(String[] args) {
        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //多个观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //将3个观察者添加到subject对象的观察者队伍中
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);

        //改变subject的状态
        subject.set(3000);

        System.out.println("====================");
        //查看观察者的状态
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        //改变subject的状态
        subject.set(30);

        System.out.println("====================");
        //查看观察者的状态
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
