package com.javase;

import java.util.Random;

/**
 * @author: Admin
 * @create: 2020/9/20 13:06
 */
public class GCDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----GCDemo-----");
        try {
            String str = "hello GC";
            while (true) {
                str += str + new Random().nextInt(77777777) + new Random().nextInt(88888888);
                str.intern();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
