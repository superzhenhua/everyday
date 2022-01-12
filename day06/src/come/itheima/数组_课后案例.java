package com.itheima;
/*
请定义一个方法，实现将指定int数组中的索引为偶数的元素值增加1。
假如数组为{1, 2, 3, 4, 5, 6, 7}，那么调用方法后，
组中的元素变为{2, 2, 4, 4, 6, 6, 8}。调用方法，测试结果
 */

public class 数组_课后案例 {
    public static void main(String[] args) {
        for (int i = 0; i < getArr(new int[]{1,2,3,4,5,6,7}).length; i++) { //遍历新数组
            System.out.println(getArr(new int[]{1,2,3,4,5,6,7})[i]);  //打印
        }
    }
    //定义方法
    public static int [] getArr(int[]arr){   //遍历
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i%2==0?arr[i]+1:arr[i];  //索引为偶数元素值加1
            }
        return arr; //循环结束返回
        }
    }


