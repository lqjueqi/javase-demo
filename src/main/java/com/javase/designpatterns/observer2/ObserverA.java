package com.javase.designpatterns.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: Admin
 * @create: 2020/8/23 0:44
 */
public class ObserverA implements Observer {

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject) o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
