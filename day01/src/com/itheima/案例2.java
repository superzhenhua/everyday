package com.itheima;
//减肥计划
import java.util.Scanner;

public class 案例2 {
    public static void main(String[] args) {

        //键盘录入提示
        System.out.println("请输入星期数");
        String week = new Scanner(System.in).next();
        //
        switch(week){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("吃饭");
                break;
            case "6":
            case "7":
                System.out.println("玩");
                break;
            default:
                System.out.println("请重新输入");
                break;
        }
    }
}
