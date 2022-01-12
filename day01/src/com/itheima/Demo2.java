package com.itheima;

/*
	变量的定义和使用

		定义变量格式：
			数据类型 变量名 = 变量值;

		基本数据类型的四类八种：
			1.整型 byte short int(默认) long
			2.浮点型 float double(默认)
			3.字符 char
			4.布尔 boolean

		引用数据类型：字符串就是一种引用类型
			String name = "吴彦祖";
*/
public class Demo2{
    public static void main(String[] args){

		/*
			需求：通过变量的定义，展示个人信息（打印控制台）
		*/

        // 定义变量
        String name = "吴彦祖";
        int age = 29;
        double height = 178.5;
        char sex = '男';
        String tel = "13279440986";

        // 使用变量 -> 使用的是变量名
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(sex);
        System.out.println(tel);

    }
}