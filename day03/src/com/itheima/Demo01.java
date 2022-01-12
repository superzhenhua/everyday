package com.itheima;

import java.util.Scanner;

/*

	switch语句使用注意：
		switch后面的小括号跟要匹配的值，可以是常量，也可以使变量
		case后面只能跟常量，并且不能重复
		default语句作用类似于if语句的else，可以省略但是不建议

	需求：
		要求键盘录入一个月份，根据输入的月份，打印对应的季节
			冬季 12 1 2
			春季 3 4 5
			夏季 6 7 8
			秋季 9 10 11

	case的穿透: 我们通过这个特点, 可以进行代码的优化
		当case后面省略了break, 后续的case就不具备匹配效果了
		知道碰到下一个break停止, 或者整个switch执行完毕停止
*/
public class Demo01 {
    public static void main(String[] args) {
    //提示用户录入
        System.out.println("输入月份");
        //接收month
        int month = new Scanner(System.in).nextInt();
        //
        switch (month){
            case 12:
            case 2:
            case 1:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
