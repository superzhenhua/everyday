package day05.重点案例;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TextDemo {
    public static void main(String[] args) throws ParseException {

        //定义一个日期字符串
        String s ="2000年11月11日 12:00:00";
        //方法二
        //设置日期格式
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        //把日期字符串转换为时间对象
        LocalDateTime dateTime = LocalDateTime.parse(s, pattern);
        //给时间对象增加一天,返回一个新的时间对象
        LocalDateTime dateTime1 = dateTime.plusDays(1);
        //把新的时间对象格式化返回一个字符串形式
        String format1 = dateTime1.format(pattern);
        System.out.println(format1);


        //方法一:
       //创建日期格式
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //把改日期转换为date对象
        Date date = sdf.parse(s);
        //获取毫秒值
        long time = date.getTime();
        //
        time+=24*60*60*1000;
        //把增加的时间毫秒值转为date对象
        Date date1=new Date(time);
        //格式化
        String format = sdf.format(date1);
        System.out.println(format);
    }
}
