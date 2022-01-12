package com.itheima;

/*
课堂案例：考试奖励
        键盘录入学生的分数，根据分数打印不同的奖励
        其他分数，给出错误提示
        [100 - 80] 一套房
        [79 - 60] 一辆车
        [59 - 0] 头打歪

        [) -> 中括号代表包含,小括号代表不包含
        [0-100) -> 取0到100的数据包含0,但是不包含100(相当于0到99)
        */

// 导包
import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args){
        // 创建对象,提示并接收一个成绩score
        System.out.println("请输入成绩:");
        int score = new Scanner(System.in).nextInt(); //链式编程

        // 由于score成绩是外来数据 -> 有可能有错误 -> 做健壮性的判断
        if(score < 0 || score > 100){
            System.out.println("成绩有误!");
        }else if(score <= 100 && score >= 80){
            System.out.println("一套房");
        }else if(score <= 79 && score >= 60){
            System.out.println("一辆车");
        }else{
            System.out.println("头打歪");
        }
    }
}
