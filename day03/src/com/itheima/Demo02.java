package com.itheima;

/*
	需求：打印水仙花数
		水仙花数是一个三位整数，该数字每一个位置上的立方和，为数字本身
*/
public class Demo02 {
    public static void main(String[] args) {
        //for循环找到100-999的整数
        for (int i = 100; i < 1000; i++) {

            //数据拆分
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            //if语句按要求判断每个位置的立方和
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                System.out.println(i);
            }
        }
    }
}
