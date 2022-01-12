package com.itheima;

public class 案例10_定义方法判断传入数据的奇偶性 {
    public static void main(String[] args) {
        //调用方法
        isEvenNumb(10);
    }

    //定义方法
    public static void isEvenNumb(int num) {
        //判断
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

    }
}

