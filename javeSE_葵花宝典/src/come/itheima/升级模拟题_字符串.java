package come.itheima;
/*
从控制台接收一串字符串，按顺序完成以下要求

        （1）将该字符串转换成字符数组(数组名为arr)；

        （2）判断arr数组中第一个和最后一个字符是否相等如果不相等则互换；

        （3）将arr中下标是偶数的字符用”*”号替换；

        （4）遍历输出数组元素；

        比如：”sdfjasklf”转换成*d*j*s*l*
 */


import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class 升级模拟题_字符串 {
    public static void main(String[] args) {

        //提示并接收
        System.out.println("请输入一个字符串");
        String s = new Scanner(System.in).next();
        //将该字符串转换成字符数组(数组名为arr)；
        char[] arr = s.toCharArray();


        if (arr[0] != arr[arr.length - 1]) {
            char temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        //遍历字符串
        for (int i = 0; i < arr.length; i++) {
            //将arr中下标是偶数的字符用”*”号替换；；
            if (i % 2 == 0) {
                arr[i] = '*';
            }
        }
        System.out.println(arr);
    }
}







