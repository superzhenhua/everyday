package com.itheima;

public class 案例6_逢七过 {
    public static void main(String[] args) {
        //定义count
        int count=0;
        //获取范围
        for (int i = 1; i <= 1000; i++) {
            if ((i % 10 != 7 )&& (i / 10 % 10 != 7) && (i / 100 != 7) && (i % 7 != 0)) {
                //打印一行
                System.out.print(i+" ");
                count++;
                //对count进行判断
                if(count%7==0){
                    //换行
                    System.out.println();



            }

            }

        }

    }

}
