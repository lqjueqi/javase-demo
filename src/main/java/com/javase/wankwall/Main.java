package com.javase.wankwall;

import java.awt.*;

/**
 * @author: Admin
 * @create: 2022/2/21 21:22
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Frame fm = new TankFrame();
        while (true){
           fm.repaint();
           Thread.sleep(100);
        }
    }
}
