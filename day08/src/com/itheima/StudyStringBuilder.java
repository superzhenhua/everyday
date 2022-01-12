package com.itheima;

public class StudyStringBuilder {
    public static void main(String[] args) {
        //空参构造
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        //带参构造>将String转为sb
        StringBuilder sb2 = new StringBuilder("黑马程序员");
        System.out.println(sb2);
        //常用方法>StringBuilder append(任意类型)->拼接
        StringBuilder sb3 = sb2.append(123).append(false);
        System.out.println(sb3);
        //常用方法>reverse 翻转
        StringBuilder sb4 = sb3.reverse();
        System.out.println(sb4);
        //常用方法>String toString  将sb对象转为String
        String s = sb4.toString();
        System.out.println(s);
    }
}
