package com.itheima;

import java.util.Scanner;

public class 案例9_评委打分案例 {
    public static void main(String[] args) {
        int[] arr = getScannerArr(6);
        int sum = getSum(arr);
        int max = getMax(arr);
        int min = getMin(arr);

        int avg = (sum - max - min) / arr.length - 2;
        System.out.println("avg:"+avg);
    }
    //定义方法
    public static int[] getScannerArr(int length){
        //动态初始化数组
        int[] arr = new int[length];
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //提示录入并接收
            System.out.println("请第"+(i+1)+"位评委打分:");
            int score = new Scanner(System.in).nextInt();
            //数据判断
            if (score<0||score>100){
                System.out.println("分数输入错误,请重新输入");
                i--;
            }else {
                //给数组赋值
                arr[i] = score;
            }
        }
        return arr;
    }
    //数组求和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //数组最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    //数组最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
