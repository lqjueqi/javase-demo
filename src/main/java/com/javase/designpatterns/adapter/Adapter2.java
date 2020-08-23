package com.javase.designpatterns.adapter;

/**
 * @author: Admin
 * @create: 2020/8/22 18:09
 * 对象适配器-组合
 */
public class Adapter2 implements Target{

    private Adaptee adaptee;

    @Override
    public void handlerReq() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
