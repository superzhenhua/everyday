package com.zuoye3;
/*
    需求:
        定义方法，判断一个整数的奇偶性

    注意:
        方法需要先定义,再调用.方法不会自动执行
 */
public class Demo2 {
    public static void main(String[] args) {
        //调用方法
        method(20);
        method(51);
    }
    //定义一个方法 两个明确:1.是否需要返回值 2.参数列表
    public static void method(int a){
        //if判断一个整数的奇偶性
        if(a%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
