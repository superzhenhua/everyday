package com.zuoye3;
/*
    需求:
        打印[n-m]之间,所有的奇数,对数据范围进行健壮性的判断
 */
public class Demo3 {
    public static void main(String[] args) {
        printNum(1,100);
    }
    //定义一个方法
    public static void printNum(int n , int m){
        //做健壮性判断
        if(n>m){
            System.out.println("您输入的数据有误,请重新输入");
            return;
        }
        //打印1-100的奇数遍历
        for (int i = n; i < m; i++) {
            //判断奇数
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
