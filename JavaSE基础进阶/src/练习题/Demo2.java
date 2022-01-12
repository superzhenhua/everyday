package 练习题;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*1. 定义类，提供main方法，在main方法中
        2. 把你生日的字符串,转换为日期对象
        3. 把日期对象转换为对应的毫秒值
        4. 获取当前系统的毫秒值
        5. 当前系统毫秒值-出生时间对于的毫秒值计算你活的毫秒值
        6. 把你活毫秒值转换为天
        7. 输出天数 */
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        //定义生日字符串
        String str = "1996年3月12日";
        //设置日期字符串格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //2. 把你生日的字符串,转换为日期对象
        Date date = sdf.parse(str);
        //3. 把日期对象转换为对应的毫秒值
        long timebirthday = date.getTime();
        // 4. 获取当前系统的毫秒值
        long timeMillis = System.currentTimeMillis();
        //5. 当前系统毫秒值-出生时间对于的毫秒值计算你活的毫秒值
        long time = timeMillis - timebirthday;
        //6. 把你活毫秒值转换为天
        long day = time / 1000 / 60 / 60 / 24;
        //7. 输出天数
        System.out.println(day+"天");

    }
}
