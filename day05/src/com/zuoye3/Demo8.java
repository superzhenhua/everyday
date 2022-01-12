package com.zuoye3;
/*
    需求:
        定义一个方法, 获取一个int类型数组的max和min,并同时返回
        main方法中调用该方法测试
 */
public class Demo8 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {12, 23, 34, 45, 65, 34};
        //调用方法,并接收
        int [] newArr= numb(arr);
        //打印
        //System.out.println(newArr[0]);
        //System.out.println(newArr[1]);
        //遍历
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }


    }

    //定义方法.两个明确
    public static int[] numb(int[] arr) {
        //求最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                max = arr[i];
            }
        }
        //将max和min放入一个新数组并做返回
        //静态初始化
        int[] newArr = {max, min};
        return newArr;
    }
}