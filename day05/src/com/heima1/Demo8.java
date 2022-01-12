package com.heima1;
/*
    需求:
        定义一个方法, 获取一个int类型数组的max和min,并同时返回
        main方法中调用该方法测试
 */

public class Demo8 {
    public static void main(String[] args) {
        //定义数组,静态初始化
        int[] arr = {1, 2, 3, 4, 5};
        //调用方法
        int[] newArr = getMaxAndMin(arr);
        //打印
        System.out.println(newArr[0]);
        System.out.println(newArr[1]);
    }

    //定义一个方法,两个明确
    public static int[] getMaxAndMin(int[] arr) {
        //求最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //求最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //定义一个新的数组,将max和min放入
        //动态初始化
        int[] newArr = new int[2];
        newArr[0] = max;
        newArr[1] = min;
        return newArr;

    }
}

