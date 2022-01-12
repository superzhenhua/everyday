package day04;

import java.math.BigDecimal;

//除法的操作
public class MyBigDecimal {
    public static void main(String[] args) {
        BigDecimal bd1 =new BigDecimal("0.3");
        BigDecimal bd2 =new BigDecimal("4");
        //四舍五入法
        BigDecimal divide = bd1.divide(bd2,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(divide);
        //去尾法
        BigDecimal divide1 = bd1.divide(bd2,2,BigDecimal.ROUND_FLOOR);
        System.out.println(divide1);
        //进一法
        BigDecimal divide2 = bd1.divide(bd2,2,BigDecimal.ROUND_UP);
        System.out.println(divide2);
    }
}
