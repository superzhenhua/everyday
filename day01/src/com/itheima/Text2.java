package com.itheima;

import java.util.Scanner;

/*
分析并完成以下需求:

	1.模拟计算器，提示用户选择运算方式，[1加法/2减法/3乘法/4除法/5取余/0退出程序]
	2.提示用户分别录入两个整数，然后根据运算方式进行计算
	3.打印用户选择的运算方式，和运算结果（使用字符串拼接算式和结果）
 */
public class Text2 {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc = new Scanner(System.in);
        //提示
        System.out.println("欢迎来到黑马计算器");
        //做循环
        while (true) {
            System.out.println("请选择运算方式");

            System.out.println("[1加法/2减法/3乘法/4除法/5取余/0退出程序]");
            int numb = sc.nextInt();
            //做健壮性判断
            if (numb == 0) {
                System.out.println("正在退出程序");
                break;

            }
            if (numb < 1 || numb > 5) {
                System.out.println("输入有误,请重新输入");
                continue;
            }
            //提示用户输入两个数字并接收
            System.out.println("请输入第一个数字");
            int a = sc.nextInt();
            System.out.println("请输入第二个数字");
            int b = sc.nextInt();
            //switch语句
            switch (numb) {
                case 1:
                    System.out.println("用户选择加法");
                    System.out.println(a + "+" + b + "=" + (a + b));
                    break;
                case 2:
                    System.out.println("用户选择加法");
                    System.out.println(a + "+" + b + "=" + (a + b));
                    break;
                case 3:
                    System.out.println("用户选择减法");
                    System.out.println(a + "-" + b + "=" + (a - b));
                    break;
                case 4:
                    System.out.println("用户选择乘法");
                    System.out.println(a + "*" + b + "=" + (a * b));
                    break;
                case 5:
                    System.out.println("用户选择除法");
                    System.out.println(a + "/" + b + "=" + (a /b));
                    break;
                case 6:
                    System.out.println("用户选择取余");
                    System.out.println(a + "%" + b + "=" + (a %b));
                    break;



            }

        }


    }
}
