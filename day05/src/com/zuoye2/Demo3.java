package com.zuoye2;

/*
    需求:
        打印[n-m]之间,所有的奇数,对数据范围进行健壮性的判断
 */
public class Demo3 {
    public static void main(String[] args) {
        //调用方法
        printNumb(13, 56);

    }

    //定义一个方法,两个明确
    public static void printNumb(int n, int m) {
        //进行健壮性判断
        if (n > m) {
            System.out.println("您输入的数据有误,请重新输入");
            //结束方法
            return;
        }
        //遍历1-100的奇数,并改变参数
        for (int i = n; i < m; i++) {
            //if语句判断奇数
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
