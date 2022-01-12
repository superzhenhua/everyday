package com.itheima;

/*
    if语句格式2：先判断关系表达式的结果, 结果为true执行语句体1, 结果为false执行语句体2
		if(关系表达式){
			语句体1;
		}else{
			语句体2;
		}

	课堂案例：
		判断一个整数的奇偶性
 */
public class Demo2 {
    public static void main(String[] args) {
        // 定义变量
        int a = 20;

        // 如果a对2取余,结果为0,代表a是偶数
        if(a % 2 == 0){
            System.out.println("偶数");
        } else {
            //反之a就是奇数
            System.out.println("奇数");
        }
    }
}

