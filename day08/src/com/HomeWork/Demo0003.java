package com.HomeWork;

/*
    判断字符串对称案例：
        定义一个方法，判断传入的字符串是否对称
        main方法中测试并打印结果
 */
public class Demo0003 {
    public static void main(String[] args) {
        //调用方法
        methor("123321");
        methor("12344321");
        methor("12323457");

    }//定义一个方法

    public static void methor(String s) {
        //创建sb对象,将s参数传递
        StringBuilder sb = new StringBuilder(s);
        //翻转并转回string
        String s1 = sb.reverse().toString();
        //判断
        if (s.equals(s1)) {
            System.out.println("对称");
        } else {
            System.out.println("不对称");
        }
    }
}
