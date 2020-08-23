package com.javase.designpatterns.observer;

/**
 * @author: Admin
 * @create: 2020/8/23 0:30
 */
public class ObserverA implements Observer {

    private int myState;

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject) subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
