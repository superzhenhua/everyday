package com.HomeWork2;
/*
    测试类
        1.创建对象
        2.赋值
        3.调用对象的方法
 */
public class StudentText {
    public static void main(String[] args) {
        //创建对象
        Student s1 =new Student("张三",21);
      /*
            com.day07.Student -> 全类名(包名+类名)
            @ -> 分隔符
            16b98e56 -> 十六进制的内存地址
         */
        //打印全类名
        System.out.println(s1);
        //赋值
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        //调用study方法
        s1.study();
    }
}
