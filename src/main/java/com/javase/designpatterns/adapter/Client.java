package com.javase.designpatterns.adapter;

/**
 * @author: Admin
 * @create: 2020/8/22 18:01
 * 客户端类
 */
public class Client {
    public void test1(Target t) {
        t.handlerReq();
    }


    public static void main(String[] args) {
        Client c =new Client();

        //Adaptee a =new Adaptee();
        //Target t =new Adapter();
        Target t =new Adapter2(new Adaptee());

        c.test1(t);
    }
}
