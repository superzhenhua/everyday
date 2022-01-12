package com.itheima;

import java.util.Scanner;

//敏感词替换案例
public class Demo5 {
    public static void main(String[] args) {
        //提示用户录入,并接收
        System.out.println("请输入字符串");
        String s = new Scanner(System.in).next();
        //替换敏感词,接收返回的新字符串
        String s1 = s.replace("TMD", "***");
        //打印
        System.out.println(s1);
    }
}
