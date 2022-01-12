package com.itheima;
//提示用户录入一个字符串,将字符串内容按照[数字在左边,字母在右边],打印新的字符串.

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        //提示用户录入并接收
        System.out.println("请输入一个字符串");
        String s = new Scanner(System.in).next();
        //创建两个空的sb容器
        StringBuilder numb = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            //获取到当前字符
            char c = s.charAt(i);
            //筛选字符串
            if (c >= '0' && c <= '9') {
                numb.append(c);
            } else if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
                letter.append(c);
            }
        }
        System.out.println(numb.append(letter));
    }
}
