package com.itheima;
//考试奖励
import java.util.Scanner;

public class 案例1  {
    public static void main(String[] args) {
        while(true){
            System.out.println("请输入你的成绩");
            //创建对象并接收
            int score = new Scanner(System.in).nextInt();
            //做健壮性
            if (score > 100 || score < 0) {
                System.out.println("输入有误,重新输入");

            } else if (score <= 100 && score >= 80) {
                System.out.println("优秀");
            } else if (score <= 79 && score >= 60) {
                System.out.println("良好");
            } else{
                System.out.println("不及格");
            }


        }
        //提示输入成绩

        }
    }