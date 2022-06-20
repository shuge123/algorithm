package com.java.day01;

/**
 * 插入排序
 */
public class Code03InsertSort {
    // 插入排序方法
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // 交换两个元素的位置
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    // 交换数组中两个元素的位置
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    // 测试排序算法
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 9, 5, 6, 8, 7, 4, 5, 6, 8, 6};
        insertSort(arr);
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
