package com.HomeWork;

import java.util.Scanner;

/*
    用户登录案例
        定义String类型的用户名和密码
        提示用户录入用户名和密码
        判断，有三次登录机会
        打印对应的登录结果(登录成功,登录失败,提示剩余次数)
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc = new Scanner(System.in);
        //定义String类型的用户名和密码
        String usename = "qwer";
        String passwork = "qwer";

        //提示用户录入
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String uname = sc.next();
            System.out.println("请输入密码");
            String uwork = sc.next();
            //判断
            if (uname.equals(usename) || uwork.equals(passwork)) {
                System.out.println("登陆成功");
                break;
            } else if (i == 2) {
                System.out.println("登陆失败,请联系管理员");
            } else {
                System.out.println("用户名密码错误,还有" + (2 - i) + "次机会");
            }
        }


    }
}
