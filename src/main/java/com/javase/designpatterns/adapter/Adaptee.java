package com.javase.designpatterns.adapter;

/**
 * @author: Admin
 * @create: 2020/8/22 17:58
 * 被适配的对象
 */
public class Adaptee {
    public void request(){
        System.out.println("可以完成客户请求的需要的功能！");
    }
}
