package day05;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class getTime {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(2000, 10, 12, 3, 4, 5);
        //
        int year = of.getYear();
        System.out.println(year);

        Month month = of.getMonth();
        System.out.println(month);

        int dayOfMonth = of.getDayOfMonth();
        System.out.println( dayOfMonth);

        DayOfWeek dayOfWeek = of.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
