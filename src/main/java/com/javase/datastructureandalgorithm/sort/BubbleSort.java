package com.javase.datastructureandalgorithm.sort;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * @author: Admin
 * @create: 2020/9/7 16:50
 * 复杂算法-拆分成简单问题
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};
//        System.out.println("排序前");
//        System.out.println(Arrays.toString(arr));
//
//        bubbleSot(arr);
//
//        System.out.println("排序后");
//        System.out.println(Arrays.toString(arr));

        int[] a = new int[80000];
        for (int i = 0; i < 80000; i++) {
            a[i] = (int) (Math.random() * 8000000);
        }

        long start = System.currentTimeMillis();
        bubbleSot(a);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("用时" + time +"ms");
    }

    public static void bubbleSot(int[] arr) {
        int temp;
        boolean flag = false; //是否交换过
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
//            System.out.println("第" + (i+1) + "次排序后");
//            System.out.println(Arrays.toString(arr));

            if (!flag) {
                break;
            } else {
                flag = false; //重置flag,进行下次判断
            }
        }
    }
}
