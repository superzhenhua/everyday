package com.itheima;

/*
	逢七过:
		打印[1-1000]的整数,要求个位不是7,十位不是7,百位不是7,并且数字不是7的倍数
		一行打印5个满足条件的数字
*/
public class Demo04 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;
        //获取取值范围的整数
        for (int i = 1; i <= 1000; i++) {
            //数据拆分
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            //if语句判断
            if (ge != 7 && shi != 7 && bai != 7 && i % 7 != 0) {
                //打印一行
                System.out.print(i + " ");
                //打印一个记一次数
                count++;
                //count满足5个一行
                if (count % 5 == 0) {
                    //分行
                    System.out.println();
                }
            }

        }
    }
}
