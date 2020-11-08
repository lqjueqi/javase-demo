package com.javase.datastructureandalgorithm.queue;

import java.util.HashMap;

/**
 * @author: Admin
 * @create: 2020/9/5 11:00
 */
public class ArrQueue {
    private Object[] elements;

    private int capticy;
    private int size;

    public ArrQueue(int capticy) {
        if (capticy != 0) {
            this.elements = new Object[capticy];
        } else {
            this.elements = new Object[10];
        }
    }

    public void add(Object o) {
        if (elements.length != 0 && elements.length != size) {
            elements[size++] = o;
        } else {
            System.out.println("队列满了");
        }
    }


    public Object get() {
        if (size != 0) {
            return elements[size - 1];
        }
        return null;
    }

    public Object get(int index) {
        return elements[index];
    }

    public int length() {
        return elements.length;
    }

    public void print() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void main(String[] args) {
        ArrQueue arrQueue = new ArrQueue(10);
        arrQueue.add("zs");
        arrQueue.add(1);
        arrQueue.add("王五");
        arrQueue.add(123L);
        arrQueue.add(12.56);
        //arrQueue.add('a');

//        System.out.println(arrQueue.length());
//        System.out.println(arrQueue.size);
//        arrQueue.print();
        System.out.println(arrQueue.get(0));

    }


}
