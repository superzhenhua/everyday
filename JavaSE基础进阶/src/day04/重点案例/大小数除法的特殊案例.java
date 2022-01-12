package day04.重点案例;

import java.math.BigDecimal;

public class 大小数除法的特殊案例 {
    public static void main(String[] args) {
        //创建对象
        BigDecimal bd1 =new BigDecimal("3.4");
        BigDecimal bd2 =new BigDecimal("1.8");

        //调用除法方法(进一法,去尾法,四舍五入法)
        //进一法
        BigDecimal divide = bd1.divide(bd2,2,BigDecimal.ROUND_UP);
        System.out.println(divide);
        //去尾法
        BigDecimal divide1 = bd1.divide(bd2, 2, BigDecimal.ROUND_FLOOR);
        System.out.println(divide1);
        //四舍五入法
        BigDecimal divide2 = bd1.divide(bd2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(divide2);

    }
}
