package com.itheima;

public class 案例5_水仙花数 {
    public static void main(String[] args) {
        //获取所有数
        for (int i = 100; i < 1000; i++) {
            //数据拆分
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + bai * bai * bai + shi * shi * shi == i) {
                //一行打印
                System.out.print(i + " ");
            }


        }
    }

}
