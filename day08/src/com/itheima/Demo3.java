package com.itheima;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //定义四个计数器
        int bigcount = 0;
        int smallcount = 0;
        int numbcount = 0;
        int othercount = 0;

        //提示用户录入并接收
        System.out.println("请输入字符串");
        String s = new Scanner(System.in).next();

        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            //获取字符串内每个字符,i代表索引
            char c = s.charAt(i);
            //判断范围
            if (c >= 'A' && c <= 'Z') {
                bigcount++;
            } else if (c >= 'a' && c <= 'z') {
                smallcount++;
            } else if (c >= '0' && c <= '9') {
                numbcount++;
            } else {
                othercount++;
            }

        }
        //打印
        System.out.println("大写" + bigcount);
        System.out.println("小写" + smallcount);
        System.out.println("数字" + numbcount);
        System.out.println("其他" + othercount);

    }
}
