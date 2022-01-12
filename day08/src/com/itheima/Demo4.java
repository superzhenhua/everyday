package com.itheima;

import java.util.Scanner;

//手机号码屏蔽案例
public class Demo4 {
    public static void main(String[] args) {
        //提醒用户
        System.out.println("请输入电话");
        //接收
        String tel = new Scanner(System.in).next();
        //截取前三位,截取后四位
        String a = tel.substring(0, 3);
        String b = tel.substring(7);

        //打印
        System.out.println(a+"****"+b);
    }
}
