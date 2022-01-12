package com.Text;

public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println("------------");
        //成员变量赋值
        p.brand="小米";
        p.price= 2999;

        //使用成员方法
       p.show();
    }
}
