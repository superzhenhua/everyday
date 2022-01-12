package com.itheima;

public class Demo {
    public static void main(String[] args) {
        //空参构造
        String s1 =new String();
        System.out.println(s1);
        //带参构造字符数组
        char [] chars ={'a','b','c'};
        String s2 =new String(chars);
        System.out.println(s2);
        //带参构造(字符串)
        String s3 =new String("abc");
        System.out.println(s3);
        //使用双引号直接创建
        String s4 ="ABC";
        System.out.println(s4);
    }
}
