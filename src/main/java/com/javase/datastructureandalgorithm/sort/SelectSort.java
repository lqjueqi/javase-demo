package com.javase.datastructureandalgorithm.sort;

import java.util.Arrays;

/**
 * @author: Admin
 * @create: 2020/9/7 19:43
 *
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};

        selectSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] a = new int[80000];
        for (int i = 0; i < 80000; i++) {
            a[i] = (int) (Math.random() * 8000000);
        }

        long start = System.currentTimeMillis();
        selectSort(a);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("用时" + time +"ms");
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
//            System.out.println("第" + (i + 1) + "次排序后");
//            System.out.println(Arrays.toString(arr));
        }
    }
}
