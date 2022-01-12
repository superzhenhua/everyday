package com.itheima;

public class 案例_翻转 {
    public static void main(String[] args) {
//调用方法
        method("123321");
        method("123456");
        method("123432");

    }
    //定义一个方法
    public static void method(String s){
        //创建sb对象,将s作为参数传递
        StringBuilder sb= new StringBuilder(s);
        //翻转
        String sb2 = sb.reverse().toString();
        //判断s和sb2的内容
        if(s.equals(sb2)){
            System.out.println("对称");
        }else{
            System.out.println("不对称");
        }
    }
}
