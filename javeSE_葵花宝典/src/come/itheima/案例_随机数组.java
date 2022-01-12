package come.itheima;
/*
按要求定义方法.
   a.定义public static int[] getNums(int[] arr, int num)方法,实现以下功能: 获取arr中,最大的5个被num整除的数,并按升序排列后以数组的方式返回。

        b.定义main方法,要求:

        1).定义一个长度为200的int型数组arr，数组元素为1001-1200(包含1001和1200)。

        2).随机生成一个1-40(包含1和40)之间的数字num。

        3).调用getNums方法,将数组arr和数字num传入,按格式打印返回的数组元素。
 */

import java.util.Random;
import java.util.Scanner;

public class 案例_随机数组 {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr = new int[200];
        //随机生成越高1-40的数字
        int num  = new Random().nextInt(41);
        System.out.println("num:"+num);
        //调用方法接收数组
        //int[] num1 = getNum(arr);
    }
    //定义方法
    public static int[]getNum(int[]arr,int num){
        //遍历数组
        for (int i = 1001; i <= 1200; i++) {
            if(i%num==0){
                arr[i]=i;
            }
        }
        return arr;


    }

}
