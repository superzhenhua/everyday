package day04.重点案例;

import java.math.BigDecimal;

/*
1.定义一个double类型的数组
double[] array={1.2, 0.6, 0.01, 3.2, 5.56, 7.21};
2.使用BigDecimal求数组中元素的平均值，保留2位小数(四舍五入)
注意：每一个元素都需要封装为BigDecimal对象，才能进行运算，运算的结果也是BigDecimal对象
 */
public class 作业 {
    public static void main(String[] args) {
        //定义一个double类型的数组
        double[] array = {1.2, 0.6, 0.01, 3.2, 5.56, 7.21};
        //定义BigDecimal对象用于求和
        BigDecimal sum =new BigDecimal("0");

        for (int i = 0; i < array.length; i++) {
            //将数组装换为字符串类型,再赋值给bd2
            BigDecimal bd2 = new BigDecimal(String.valueOf(array[i]));
            if(sum!=null){
                sum=bd2.add(sum);
            }
        }
        System.out.println(sum);
        System.out.println("平均值为:"+sum.divide(BigDecimal.valueOf(array.length),2,BigDecimal.ROUND_HALF_UP));


    }
}
