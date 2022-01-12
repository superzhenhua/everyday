package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class date {
    public static void main(String[] args) throws ParseException {
        //
        String start ="2020年11月11日 0:0:0";
        String end ="2020年11月11日 0:10:0";
        String jia ="2020年11月11日 0:3:03";
        String pi ="2020年11月11日 0:10:34";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //把对象进行解析,获取毫秒值
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();
        long jiaTime = sdf.parse(jia).getTime();
        long piTime = sdf.parse(pi).getTime();
        //判断是否在范围中
        if(jiaTime>=startTime&&jiaTime<=endTime){
            System.out.println("小贾在活动范围内");
        }else{
            System.out.println("小贾不在活动范围内");
        }
        if(piTime>=startTime&&piTime<=endTime){
            System.out.println("小皮在活动范围内");
        }else{
            System.out.println("小皮不在活动范围内");
        }
    }
}
