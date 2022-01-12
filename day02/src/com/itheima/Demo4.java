package com.itheima;

/*
    逻辑运算符：
        与 &
        或 |
        非 !
        异或 ^

	短路逻辑运算符：
		短路与 &&：遇到false则短路
		短路或 ||：遇到true则短路、
	效果和普通逻辑运算符是一样的
	以后都使用短路的逻辑运算符，可以提升代码的效率

 */
public class Demo4 {
    public static void main(String[] args) {

        // 与 &：遇false则false
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && false); //false
        System.out.println(false && true); //false

        System.out.println("-----------------------");

        // 或 |：遇true则true
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || false); //false
        System.out.println(false || true); //true

        System.out.println("-----------------------");

        // 非 !：取反
        System.out.println(!true); //false
        System.out.println(!!true); //true

        System.out.println("-----------------------");

        // 异或 ^：两边一样为false，变量不一样为true
        System.out.println(true ^ true); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ false); //false
        System.out.println(false ^ true); //true

    }
}
