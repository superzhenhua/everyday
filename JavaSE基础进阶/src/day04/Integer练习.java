package day04;
//int的包装类Integer 如何将string类型的字符串放入一个int类型的数组中?
public class Integer练习 {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "91,23,45,67,78";
        //获取字符串中的每一个数字
        String[] strArr = s.split(",");
        //创建一个int类型的数组
        int[] numbArr = new int[strArr.length];
        //把strArr中的数据进行转换并存入到新的数组中
        for (int i = 0; i < strArr.length; i++) {
            //字符串对int整数的转换
            int number = Integer.parseInt(strArr[i]);
            //将转换后的整数放入数组
            numbArr[i] = number;
        }
        //遍历
        for (int i= 0; i< numbArr.length;i++) {
            System.out.println(numbArr[i]);
        }

    }
}
