package com.heima1;

/*
    需求:
        打印[n-m]之间,所有的奇数,对数据范围进行健壮性的判断
 */
public class Demo3 {
    public static void main(String[] args) {
        //调用方法
        printNum(10,20);  //实参(实际参与运算的参数)
    }

    //定义方法
    public static void printNum(int n, int m) {//形参作用是接收实参
        //if判断并做健壮性分析
        if (n > m) {
            System.out.println("您输入的数据有误,请重新输入");
            return;
        }
        //打印1-100的所有奇数,并将参数做替换
        for (int i = n; i < m; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
