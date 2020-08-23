package com.javase.designpatterns.observer2;

import java.util.Observable;

/**
 * @author: Admin
 * @create: 2020/8/23 0:40
 * 目标对象
 */
public class ConcreteSubject extends Observable {
    private int state;

    public void set(int s) {
        state = s;
        setChanged(); //表示目标对象已近做了更改
        notifyObservers(state); //通知所有的观察者
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
