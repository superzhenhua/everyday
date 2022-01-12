package day04;

import java.math.BigDecimal;
//大小数的四则运算
public class bigDecimal {
    public static void main(String[] args) {
        //创建对象
        BigDecimal bd1 =new BigDecimal("3.0");
        BigDecimal bd2 =new BigDecimal("4.4");
        //加法
        BigDecimal add = bd1.add(bd2);
        System.out.println(add);
        //减法
        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println(subtract);
        //乘法
        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println(multiply);
        //除法
        BigDecimal divide = bd1.divide(bd2);
        System.out.println(divide);
    }
}
