package com.itheima;

public class 案例11_打印n到m所有的奇数 {
    public static void main(String[] args) {
        //调用方法
        printNumb(10, 20);
    }

    //定义方法
    public static void printNumb(int n, int m) {
        //健壮性判断
        if (n > m) {
            System.out.println("数据有误");
            return;
        }
            //获取范围内数据
            for (int i = n; i < m; i++) {
                //判断
                if (i % 2 != 0) {
                    //打印
                    System.out.println(i);
                }
            }
    }

}

