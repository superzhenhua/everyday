package com.itheima;

//1.打印1-5 5-1     2.求和1-5
public class 案例3 {
    public static void main(String[] args) {
        int sum = 0;
        //遍历1-5 并求和
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum:" + sum);
        //打印5-1
        //for (int i = 5; i >= 1; i--) {
        //   System.out.println(i);
    }
}

