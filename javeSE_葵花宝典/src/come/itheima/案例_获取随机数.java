package come.itheima;

import java.util.Random;
import java.util.Scanner;

/*
分析并完成以下需求:
    1.获取一个[10-100]之间的int类型随机数num，统计[10-num]之间，奇数的个数
    2.最终在控制台打印所有的奇数，和个数
 */
public class 案例_获取随机数 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;
        int[] randomArr = ArraryTools.getRandomArr(90, 10, 100);
        //获取随机数num
        int num = new Random().nextInt(100 - 10 + 1) + 10;
        //打印num
        System.out.println("num:" + num);
        System.out.println("------------");
        //遍历
        for (int i = 10; i <= num; i++) {
            //判断
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("----------------");
        System.out.println("count:" + count);
    }


}
