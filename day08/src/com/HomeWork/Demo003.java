package com.HomeWork;

/*
    判断字符串对称案例：
        定义一个方法，判断传入的字符串是否对称
        main方法中测试并打印结果
 */
public class Demo003 {
    public static void main(String[] args) {
//调用方法
        method("123321");
        method("1234567");
        method("1234456");
    }

    //定义方法
    public static void method(String s) {
        //创建sb对象.将s参数传递
        StringBuilder sb = new StringBuilder(s);
        //翻转
        String s1 = sb.reverse().toString();
        //判断
        if (s.equals(s1)) {
            System.out.println("对称");
        } else {
            System.out.println("不对称");
        }
    }
}
