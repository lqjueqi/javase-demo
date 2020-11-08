package com.javase.datastructureandalgorithm.sort;

import java.util.Arrays;

/**
 * @author: Admin
 * @create: 2020/9/7 20:53
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = new int[80000];
        for (int i = 0; i < 80000; i++) {
            a[i] = (int) (Math.random() * 8000000);
        }

        long start = System.currentTimeMillis();
        insertSort(a);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("用时" + time + "ms");
        //System.out.println(Arrays.toString(a));
    }

    public static void insertSort(int[] arr) {
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            insertVal = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }

            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }
}
