package com.zuoye2;
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
        //调用方法(有返回值需要接收数据)
        int max = getMax(10,20);
        //打印
        System.out.println("max:"+max);
    }
    //定义一个方法,两个明确
    public static  int  getMax(int a ,int b){
        //使用if语句比较
        if(a>b){
            return a;
        }else{
            return  b;
        }

    }
}
