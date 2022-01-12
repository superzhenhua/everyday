package com.itheima;

public class 案例7_珠峰 {
    public static void main(String[] args) {
        //定义变量
        double zhi = 0.1;
        int zf = 8844880;
        int count = 0;
        //while循环
        while (zhi<zf) {
            zhi *= 2;
            count++;
        }
        //打印
        System.out.println(count);
        }
    }

