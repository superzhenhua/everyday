package day04.重点案例;
//如何将string类型的字符串放入一个int类型的数组中?
public class Integer1 {
    public static void main(String[] args) {
        //定义一个字符串
        String s ="2,3,4,6,1";
        //将字符串调用string类型的split方法进行切割(获取每个数字)
        String[] stuArr = s.split(",");
        //定义一个int类型的数组
        int [] arr =new int[stuArr.length];
        //遍历数组,将字符串类型转换为int
        for (int i = 0; i < arr.length; i++) {
            //将字符串类型转换为int
            int num = Integer.parseInt(stuArr[i]);
            //将转换后的int整数放入数组中
            arr[i]=num;
        }
        //遍历转换后的数组并打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
