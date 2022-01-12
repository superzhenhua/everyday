package com.itheima;

/*
	键盘对象Scanner
		1.导包 import java.util.Scanner;
		2.创建对象 Scanner sc = new Scanner(System.in);
		*.控制台提示 System.out.println("提示内容");
		3.接收数据 int a = sc.nextInt();

	需求：
		键盘接收两个整数，打印这两个整数的和
*/

//1.导包
import java.util.Scanner;
public class Demo3{
    public static void main(String[] args){
        //2.创建对象
        Scanner sc = new Scanner(System.in);

        //3.控制台提示并接收数据
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();

        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();

        //4.求和并且打印
        int sum = a + b;
        System.out.println("sum:" + sum);
    }
}




