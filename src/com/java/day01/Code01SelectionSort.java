package com.java.day01;
/**
 * 选择排序
 */
public class Code01SelectionSort {
    // 定义一个选择排序的方法
    public static void selectSort(int[] arr){
        if (arr==null || arr.length<2){
            return;
        }
        for (int i=0;i<arr.length-1;i++){
            int middle=i;
            for (int j=i+1;j<arr.length;j++){
               middle= arr[j]<arr[middle]?j:middle;
            }
            swap(arr,i,middle);
        }
    }
    // 定义一个数组元素的交换方法
    public static void swap(int[] arr,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{4,6,8,7,1,6,3,4};
        selectSort(arr);
//        System.out.println(arr);
        for (int a : arr){
            System.out.println(a);
        }
    }
}
