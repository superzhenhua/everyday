package com.itheima;

/*
    课堂案例：数值拆分
        键盘录入一个三位整数，将其拆分为个位、十位、百位打印在控制台

    控制台示例：
        请输入一个三位数：
        789
        整数789个位为：9
        整数789十位为：8
        整数789百位为：7
 */

//导包
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc = new Scanner(System.in);

        //提示录入并接收一个三位数
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();

        //数值拆分
        int ge = num % 10; //345%10=34..5 -> 只取余数 -> 5
        int shi = num / 10 % 10; //345/10=34..5 -> 只取商 -> 34%10=3..4 -> 只取余数 -> 4
        int bai = num / 100; //345/100=3..45 -> 只取商 -> 3

        //按照格式要求,打印结果 -> Ctrl + D 向下复制一行
        System.out.println("整数" + num + "个位为：" + ge);
        System.out.println("整数" + num + "十位为：" + shi);
        System.out.println("整数" + num + "百位为：" + bai);
    }
}


