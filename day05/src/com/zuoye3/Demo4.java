package com.zuoye3;

/*
    返回值: 该方法完成后, 要不要返回一个结果? 如果要,返回的结果就是返回值
    return关键字: 作用是返回返回值, 并结束方法

    public static 返回值类型 方法名(参数列表){
        方法体;
        return 返回值;
    }

    三种调用方式:
        1. 赋值调用
        2. 打印调用
        3. 直接调用
        需求：定义方法,求两个整数的较大值并返回
 */
public class Demo4 {
    public static void main(String[] args) {


        //调用方法并接收数据进行打印(一步完成)-如果没有后续操作可用这种方法
        System.out.println(getMax(20,35));
    }

    //定义一个方法
    public static int getMax(int a, int b) {
        //if语句做比较判断
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
