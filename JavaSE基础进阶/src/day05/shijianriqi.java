package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class shijianriqi {
    public static void main(String[] args) throws ParseException {
        String str ="2000年11月11日 12:00:00";
        //方法一:
        //通过DateTimeFormatter.ofPattern设置日期字符串格式
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        //把日期字符串转换为时间对象
        LocalDateTime localDateTime = LocalDateTime.parse(str, dtf);
        //给时间对象增加一天,返回一个新的时间对象
        LocalDateTime localDateTime1 = localDateTime.plusDays(1);
        //新的时间对象转为时间字符串
        String format1 = localDateTime1.format(dtf);
        //打印
        System.out.println(format1);


        //方法二:
        //创建日期格式
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //把该日期换为date对象
        Date date1 = sdf.parse(str);
        //date对象获取当前时间的毫秒值
        long time = date1.getTime();
        //加一天
        time+=24*60*60*1000;
        //把增加的时间毫秒值转为date对象
        Date date2 = new Date(time);
        //把Date对象转为日期字符串,并打印
        String format = sdf.format(date2);
        System.out.println(format);

    }
}
