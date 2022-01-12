package come.itheima;

import java.util.Random;
import java.util.Scanner;

/*
分析并完成以下需求:

    1.使用随机数生成一个[1-100]的整数，提示用户猜一个整数
    2.根据用户猜的整数，与随机数比较判断，打印用户猜的结果（猜对了或猜错了）
    3.多次游戏，猜对了停止游戏
 */
public class 案例_猜数字 {
    public static void main(String[] args) {
        //生成一个随机数组并接收
        int numb = new Random().nextInt(100)+1;
        //死循环
        while(true){
            //提示用户
            System.out.println("请猜一个整数");
            //键盘录入猜的数字
            int gussNumb = new Scanner(System.in).nextInt();
            //做健壮性判断
            if(gussNumb>100||gussNumb<=0){
                System.out.println("数字有误,请重新输入");
            }else if(gussNumb>numb){
                System.out.println("猜大了");
            }else if(gussNumb<numb){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                return;
            }

        }

    }
}
