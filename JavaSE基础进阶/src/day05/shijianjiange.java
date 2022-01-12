package day05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class shijianjiange {
    public static void main(String[] args) {
        //获取时间对象
        LocalDate of1= LocalDate.of(2000, 1, 12);
        LocalDate of2 = LocalDate.of(2048, 2, 11);
        Period period = Period.between(of1, of2);
        System.out.println(period);

        //获得这段时间的年份
        int years = period.getYears();
        System.out.println(years);

        //获得月份
        int months = period.getMonths();
        System.out.println(months);

        //获得天数
        int days = period.getDays();
        System.out.println(days);

        //获得此期间的总月数
        long toTotalMonths = period.toTotalMonths();
        System.out.println(toTotalMonths);

    }

}
