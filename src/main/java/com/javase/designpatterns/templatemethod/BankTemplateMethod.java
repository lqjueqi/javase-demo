package com.javase.designpatterns.templatemethod;

/**
 * @author: Admin
 * @create: 2020/8/23 0:09
 */
public abstract class BankTemplateMethod {

    public void takeNumber(){
        System.out.println("取号排队！");
    }

    public abstract void transact(); //办理具体业务 //钩子方法

    public void evaluate(){
        System.out.println("反馈评分");
    }

    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
