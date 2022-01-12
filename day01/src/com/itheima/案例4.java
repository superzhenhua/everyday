package com.itheima;

//求 1-100 的偶数和
public class 案例4 {
    public static void main(String[] args) {
        //定义求和
        int sum = 0;
        //遍历1-100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;


            }
        }
        System.out.println("sum:"+sum);
    }
}

