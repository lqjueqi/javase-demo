package com.javase.designpatterns.strategy;

/**
 * @author: Admin
 * @create: 2020/8/22 23:58
 * 负责和具体的策略类交互
 * 算法和客户端调用分离，算法独立于客户端独立的变化
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s) {
        System.out.println("您改报价：" + strategy.getPrice(s));
    }
}
