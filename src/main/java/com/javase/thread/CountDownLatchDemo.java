package com.javase.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author: Admin
 * @create: 2020/8/20 22:15
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws Exception {
        CountDownLatch cd = new CountDownLatch(5);

        for (int i = 1; i <= 5; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "号线程执行完成");
                cd.countDown();
            }, String.valueOf(i)).start();
        }

        cd.await();
        System.out.println(Thread.currentThread().getName() + "最后线程执行");
    }
}
