package com.javase.designpatterns.observer;

/**
 * @author: Admin
 * @create: 2020/8/23 0:28
 */
public class ConcreteSubject extends Subject {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }
}
