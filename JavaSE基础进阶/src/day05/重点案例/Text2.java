package day05.重点案例;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
需求：jdk1.8方式：
	1.控制台提示用户输入自己的出生日期，计算该用户已经活了多少天，并输出到控制台；
	2.如果用户输入的生日日期格式有误（使用异常处理），需要提示用户，格式有误，并让其继续输入；
	3.分别采用jdk1.7和jdk1.8提供的两种计算日期方法完成该需求；
*/
public class Text2 {
    public static void main(String[] args)  {
        //
        while (true) {
            try {
                caculately();
                break;
            } catch (ParseException e) {
                System.out.println("请输入正确格式");
            }
        }
    }

    private static void caculately() throws ParseException {
        //创建键盘对象
        Scanner sc =new Scanner(System.in);
        //提示
        System.out.println("请输入自己的出生日期(yyyy年MM月dd日)");
        String birthday =sc.next();

        //创建日期格式
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日");
        //解析时间对象
        Date date = sdf.parse(birthday);
        //获取用户出生日期的毫秒值
        long birthdayTime = date.getTime();
        //获取当前时间毫秒值
        long currentTime = System.currentTimeMillis();

        //计算用户活了多久
        System.out.println((currentTime - birthdayTime)/1000/60/60/24+"天");

    }
}
