package com.itheima;

import java.util.Scanner;

public class 案例_创建用户登录 {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc =new Scanner(System.in);
        //定义正确的用户名和密码
        String name = "asd";
        String word = "asd";
        //使用for循环控制次数
        for (int i = 0; i < 3; i++) {
            //提示用户录入
            System.out.println("请输入用户名");
            String uname = sc.next();
            System.out.println("请输入密码");
            String uword = sc.next();
            //判断登陆成功
            if(name.equals(uname)&&word.equals(uword)){
                System.out.println("登陆成功");
                break;
                //登陆失败
            }else if(i==2){
                System.out.println("登陆失败,请联系管理员");
            }else{
                System.out.println("您的用户名密码错误!您还有"+(2-i)+"次登录机会");
            }
        }

    }
}
