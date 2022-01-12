package com.itheima;

public class 案例12_数据交换 {
    public static void main(String[] args) {
        //定义变量
        int a = 10;
        int b = 20;
        //使用temp记录a
        int temp = a;  //将a赋值给temp
        a=b;   //将b赋值给a
        b=temp;   //将temp给b
        //打印
        System.out.println("a"+a);
        System.out.println("b"+b);

        //不使用三方变量
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a"+a);
        System.out.println("b"+b);

    }
}
