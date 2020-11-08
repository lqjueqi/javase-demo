package com.javase.lock;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * @author: Admin
 * @create: 2020/10/7 12:05
 * 假如锁处于偏向状态，这时来了竞争者，那么他的状态是什么？
 */
public class HelloJOL {
    public static void main(String[] args) throws Exception {

        TimeUnit.SECONDS.sleep(5);

        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        synchronized (o) {
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
