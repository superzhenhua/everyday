package com.HomeWork;

import java.util.Scanner;

/*
    需求:
        提示用户录入一个字符串,将字符串内容按照[数字在左边,字母在右边]排列
        打印新的字符串
 */
public class Demo04 {
    public static void main(String[] args) {
        //定义两个新的sb容器
        StringBuilder zimu = new StringBuilder();
        StringBuilder shuzi = new StringBuilder();
        //提示用户录入
        System.out.println("请输入");
        String s = new Scanner(System.in).next();
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            //获取当前每个字符
            char c = s.charAt(i);
            //判断并将字符放入容器
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                zimu.append(c);

            } else if (c >= '0' && c <= '9') {
                shuzi.append(c);
            }

        }
        System.out.println(shuzi.append(zimu));
    }

}
