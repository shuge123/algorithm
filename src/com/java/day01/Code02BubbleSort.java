package com.java.day01;

/**
 * 冒泡排序
 */
public class Code02BubbleSort {
    // 冒泡排序方法
    public static void bubbleSort(int[] arr){
        if (arr==null || arr.length<2){
            return;
        }
        for (int i=arr.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(arr[j+1]<arr[j]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    // 数组位置的交换方法
    public static void swap(int[] arr,int i,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }

    /**
     * 测试冒泡排序
     * @param args
     */
    public static void main(String[] args) {
        int[] arr=new int[]{4,6,9,2,1,6,7,9,2,4,3,1};
        bubbleSort(arr);
        System.out.println("排序后的结果：");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
