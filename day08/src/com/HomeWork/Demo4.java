package com.HomeWork;

import java.util.Scanner;

/*
    需求:
        提示用户录入一个字符串,将字符串内容按照[数字在左边,字母在右边]排列
        打印新的字符串
 */
public class Demo4 {
    public static void main(String[] args) {
        //提示用户并接收
        System.out.println("请输入一个字符串");
        String s = new Scanner(System.in).next();
        //创建两个新的容器
        StringBuilder shuzi = new StringBuilder();
        StringBuilder zimu = new StringBuilder();
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            //获取当前字符
            char c = s.charAt(i);
            //判断
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                zimu.append(c);
            } else if (c >= '0' && c <= '9') {
                shuzi.append(c);
            }
        }
        System.out.println(shuzi.append(zimu));
    }
}
