package com.javase.datastructureandalgorithm.sort;

import java.util.Arrays;

/**
 * @author: Admin
 * @create: 2020/9/7 23:58
 */
public class ShellSort {
    public static void main(String[] args) {
        //int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        //shellSort(arr);
        //System.out.println(Arrays.toString(arr));
        int[] a = new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            a[i] = (int) (Math.random() * 8000000);
        }

        long start = System.currentTimeMillis();
        //shellSort(a);
        shellSort2(a);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("用时" + time + "ms");
    }

    //交换法
    public static void shellSort(int[] arr) {
        int temp = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }

    //移位法
    public static void shellSort2(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int index = i;
                int temp = arr[index];
                if (arr[index] < arr[index - gap]) {
                    while (index - gap >= 0 && temp < arr[index - gap]) {
                        arr[index] = arr[index - gap];
                        index -= gap;
                    }
                    arr[index] = temp;
                }
            }
        }
    }
}
