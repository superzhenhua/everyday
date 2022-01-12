package com.itheima;

/*
	计数器思想：
		题目中出现了"计次"、"求个数"我们就要定义计数器(变量)
		在满足条件的情况下，我们让count++即可

	课堂案例：珠峰折纸案例
		已知珠峰高度为8848.44米，假如有一张足够大的纸
		厚度为0.1毫米，问纸张对折多少次，厚度能达到珠峰高度?
*/
public class Demo3 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;
        //定义纸张
        double zh = 0.1;
        //定义zf
        int zf = 8848440;
        //由于不知道要折多少次,用while循环
        while (zh < zf) {
            zh *= 2;
            count++;


        }
        //打印
        System.out.println(count);

    }

}
