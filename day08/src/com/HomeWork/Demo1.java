package com.HomeWork;

import java.util.Scanner;

/*
    用户登录案例
        定义String类型的用户名和密码
        提示用户录入用户名和密码
        判断，有三次登录机会
        打印对应的登录结果(登录成功,登录失败,提示剩余次数)
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc = new Scanner(System.in);
        //定义用户名密码
        String username = "asdf";
        String password = "1234";
        //实现三次循环
        for (int i = 0; i < 3; i++) {
            //提示录入
            System.out.println("请输入用户名");
            String uname = sc.next();
            System.out.println("请输入密码");
            String uword = sc.next();
            //判断三次机会
            if (uname.equals(username) || uword.equals(password)) {
                System.out.println("登录成功");
                break;
            } else if (i == 2) {
                System.out.println("登录失败,正在退出");
            } else {
                System.out.println("用户名密码输入错误,还有" + (2 - i) + "次输入机会");
            }


        }


    }
}
