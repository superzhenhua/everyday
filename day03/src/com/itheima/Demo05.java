package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
	猜数字小游戏：
		使用随机数对象, 生成一个范围在[1-100]的正确答案
		可以多次游戏, 提示用户猜，根据不同的录入结果打印对应的提示语句
			猜大了
			猜小了
			恭喜你,猜对了! -> break结束循环
*/
// 导包
public class Demo05 {
    public static void main(String[] args) {
        //取随机对象1-100
        int num = new Random().nextInt(100) + 1;
        //while死循环
        while(true){
            //提示并接收用户的答案
            System.out.println("请输入数字");
            //获取猜的数据
            int gussnumb = new Scanner(System.in).nextInt();
            //if语句判断,并做健壮性判断
            if (gussnumb > 100 || gussnumb < 0) {
                System.out.println("数字有误");
            }else if (gussnumb > num) {
                System.out.println("猜大了");
            } else if (gussnumb < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }

    }


}



