package com.HomeWork;
import java.util.Scanner;
/*
    字符出现次数统计案例：
        提示用户录入一个字符串
        统计字符串中小写字母、大写字母、数字以及其他字符出现的次数
 */
public class Demo2 {
    public static void main(String[] args) {
        //定义计数器
        int bigcount= 0;
        int smallcount = 0;
        int numbcount = 0;
        int othercount = 0;
        //提示录入
        System.out.println("请录入字符串");
        String s=new Scanner(System.in).next();
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>='a'&&c<='z'){
                smallcount++;
            }else if (c>='A'&&c<='Z'){
                bigcount++;
            }else if (c>='0'&&c<='9'){
                numbcount++;
            }else{
                othercount++;
            }
        }
        System.out.println("大写:"+bigcount);
        System.out.println("小写:"+smallcount);
        System.out.println("数字:"+numbcount);
        System.out.println("其他:"+othercount);
    }
}
