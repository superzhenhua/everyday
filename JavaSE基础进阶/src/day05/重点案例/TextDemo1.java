package day05.重点案例;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//将时间"2000年11月11日 12:00:00"增加一年的时间,并按照改格式打印出来
public class TextDemo1 {
    public static void main(String[] args) throws ParseException {
        //jdk1.8之后的方法
        //定义一个时间字符串
        String s= "2000年11月11日 12:00:00";
        //创建一个时间格式对象
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        //将该字符串解析为date对象
        LocalDateTime dateTime = LocalDateTime.parse(s,pattern);
        //给时间对象增加一年
        LocalDateTime dateTime1 = dateTime.plusYears(1);
        //把增加后的时间对象格式化成字符串形式
        String format = dateTime1.format(pattern);
        System.out.println(format);

        //jdk1.7的方法
        //创建时间日期格式
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //将时间对象进行解析(把日期转换为date对象)
        Date date = sdf.parse(s);
        //获取当前时间对象的毫秒值
        long time = date.getTime();
        //将毫秒值增加一年
        time+=365*24*60*60*1000;
        //把增加的毫秒值转为新的时间对象
        Date date1 =new Date(time);
        //将date1对象转化为时间日期
        String format1 = sdf.format(date1);
        System.out.println(format1);

    }

}
