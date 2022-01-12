package day05.重点案例;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
需求：jdk1.7方式：
	1.控制台提示用户输入自己的出生日期，计算该用户已经活了多少天，并输出到控制台；
	2.如果用户输入的生日日期格式有误（使用异常处理），需要提示用户，格式有误，并让其继续输入；
	3.分别采用jdk1.7和jdk1.8提供的两种计算日期方法完成该需求；
*/
public class Text {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入自己的出生日期(yyyy-MM-dd)");
        String s = new Scanner(System.in).next();
        //把日期转换成date对象
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);

        long time = date.getTime();





    }
}
