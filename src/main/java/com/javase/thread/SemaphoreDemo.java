package com.javase.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author: Admin
 * @create: 2020/8/20 22:42
 */
public class SemaphoreDemo {
    public static void main(String[] args) {

        Semaphore sp = new Semaphore(3); //模拟车位
        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                try {
                    sp.acquire();
                    System.out.println(Thread.currentThread().getName() + "\t抢到了车位");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(Thread.currentThread().getName() + "离开了车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    sp.release();
                }

            }, String.valueOf(i)).start();
        }
    }
}
