package day04;

public class Math方法 {
    public static void main(String[] args) {
        //返回参数的绝对值
        int abs = Math.abs(-12);
        System.out.println(abs);

        //向上取整数
        double ceil = Math.ceil(12.4);
        System.out.println(ceil);

        //向下取整数
        double floor = Math.floor(12.43);
        System.out.println(floor);

        //四舍五入
        long round = Math.round(123.343);
        System.out.println(round);

        //返回两个int值中的最大值
        int max = Math.max(12, 23);
        System.out.println(max);

        //返回两个int最小值
        int min = Math.min(12, 34);
        System.out.println(min);

        //返回a的b次幂的值
        double pow = Math.pow(2, 3);
        System.out.println(pow);

        //返回值为double的正值:[0.0-1.0)
        double random = Math.random();
        System.out.println(random);
    }
}
