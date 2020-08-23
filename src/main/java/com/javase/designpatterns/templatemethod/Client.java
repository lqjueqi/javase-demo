package com.javase.designpatterns.templatemethod;

/**
 * @author: Admin
 * @create: 2020/8/23 0:11
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱！");
            }
        };
        btm2.process();
    }
}

class DrawMoney extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("我要取款！！！");
    }
}
