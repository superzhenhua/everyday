package com.itheima;


public class Demo1 {
    public static void main(String[] args) {
        //创建字符
        String  s1 = "abcd";
        String  s2 = "ABC";
        String  s3 = "abcd";
        String  s4 = "ABCD";
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s3));//true;
        System.out.println(s3==s1);//true
        System.out.println(s1.equalsIgnoreCase(s4));//true

    }

}
