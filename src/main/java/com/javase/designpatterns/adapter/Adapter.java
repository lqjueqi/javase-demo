package com.javase.designpatterns.adapter;

/**
 * @author: Admin
 * @create: 2020/8/22 18:03
 * 类适配器-继承
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void handlerReq() {
        super.request();
    }
}
