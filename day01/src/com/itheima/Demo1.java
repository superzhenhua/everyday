package com.itheima;

/*
	常量：在程序运行过程中，其值不会发生改变的量(数据)

	分类：
		1.整数常量
		2.小数常量
		3.字符常量
		4.字符串常量
		5.布尔常量
		6.空常量
*/

public class Demo1{
    public static void main(String[] args){
        // 1.整数常量
        System.out.println(100); // java是一门强类型语言：java中每一个量都是有数据类型的
        System.out.println(-200);

        // 2.小数常量
        System.out.println(3.14);
        System.out.println(-5.0);

        // 3.字符常量 -> 单引号引起来的单个内容
        System.out.println(' ');
        System.out.println('哈');

        // 4.字符串常量 -> 双引号引起来的任意内容
        System.out.println("HelloWorld");
        System.out.println("黑马程序员");

        // 5.布尔常量 -> 只有true跟false两个值
        System.out.println(10 > 5); //true
        System.out.println(3 < 1); //false

        // 6.空常量 -> 不能直接打印
        // System.out.println(null);
    }
}

