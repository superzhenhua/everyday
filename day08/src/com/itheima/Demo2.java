package com.itheima;

public class Demo2 {
    public static void main(String[] args) {
        //定义
        String s ="黑马程序员";
        //遍历字符串数组
        for (int i = 0; i < s.length(); i++) {
            //i代表字符串的索引
            System.out.println(s.charAt(i));
        }
        System.out.println("------------");
        //遍历字符串
        //将字符串转为字符数组
        char [] chars =s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
