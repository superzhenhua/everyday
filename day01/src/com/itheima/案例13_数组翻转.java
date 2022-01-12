package com.itheima;

public class 案例13_数组翻转 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //判断语句
        for(int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
            //遍历
            for (int i = 0; i < arr.length; i++) {
                System.out.println(i);
            }


    }
}
