package com.HomeWork;

import java.security.PrivilegedAction;
import java.util.Scanner;

/*
    字符出现次数统计案例：
        提示用户录入一个字符串
        统计字符串中小写字母、大写字母、数字以及其他字符出现的次数
 */
public class Demo002 {
    public static void main(String[] args) {
        //定义四个计数器
        int daxie = 0;
        int xiaoxie = 0;
        int shuzi = 0;
        int qita = 0;
        //提示用户录入
        System.out.println("请输入字符串");
        String s = new Scanner(System.in).next();
        //遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //当前每个元素就是一个字符
            char c = chars[i];
            //判断当前char的范围
            if (c >= 'a' && c <= 'z') {
                xiaoxie++;
            } else if (c >= 'A' && c <= 'Z') {
                daxie++;
            } else if (c >= '0' && c <= '9') {
                shuzi++;
            } else {
                qita++;
            }
        }
        System.out.println("大写:" + daxie);
        System.out.println("小写:" + xiaoxie);
        System.out.println("数字:" + shuzi);
        System.out.println("其他:" + qita);
    }
}
