package day05.重点案例;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class 时间日期格式化对象类 {
    public static void main(String[] args) throws ParseException {
        //定义一个字符串日期
        String str ="2020年10月12日 12:12:11";

        //创建格式对象,设置日期字符串格式
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        //把日期字符串转换为时间对象-解析
        LocalDateTime dateTime = LocalDateTime.parse(str, dft);
        LocalDateTime localDateTime = dateTime.plusDays(1);
        //再将改变后的时间对象格式化
        String format1 = localDateTime.format(dft);
        System.out.println(format1);


        //创建时间对象
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //解析
        Date date1 = sdf.parse(str);
        long time = date1.getTime();
        time+=24*60*60*1000;
        //需要将添加完的时间再转为字符串
        Date date2 =new Date(time);
        //格式化时间对象
        String format = sdf.format(date2);
        System.out.println(format);

    }
}
