package com.javase.wankwall;

import java.awt.*;

/**
 * @author: Admin
 * @create: 2022/2/21 21:22
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();

        //初始化敌方坦克
        for (int i = 0; i < 5; i++) {
            tf.tanks.add(new Tank(50 + i * 80, 200, Dir.DOWN, Group.BAD, tf));
        }
        while (true) {
            tf.repaint();
            Thread.sleep(50);
        }
    }
}
