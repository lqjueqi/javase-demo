package com.javase.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Admin
 * @create: 2020/8/16 18:51
 */
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        Condition c1 = lock.newCondition();
        Condition c2 = lock.newCondition();
        //TimeUnit.SECONDS.sleep(100);
        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxlMemory = Runtime.getRuntime().maxMemory();
        System.out.println("totalMemory(-Xms)" + totalMemory + "字节、" + (totalMemory / (double) 1024 / 1024) + "MB");
        System.out.println("maxlMemory(-Xmx)" + maxlMemory + "字节、" + (maxlMemory / (double) 1024 / 1024) + "MB");

        byte[] bytes = new byte[20 * 1024 * 1024];
    }
}
