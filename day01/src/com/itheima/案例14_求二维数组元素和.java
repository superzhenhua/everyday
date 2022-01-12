package com.itheima;

import org.w3c.dom.ls.LSOutput;

public class 案例14_求二维数组元素和 {
    public static void main(String[] args) {
        //动态数组初始化
        int[][]arr=new int[2][2];
        //打印数组名
        System.out.println(arr);

        //取值-默认初始化
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

        //赋值
        arr[0][0]=11;
        arr[0][1]=22;
        arr[1][0]=33;
        arr[1][1]=44;

        //取值
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        //二维数组静态初始化
        int[][]crr={{1,2,3},{4,5,6}};
        //需求:求二维数组元素和
        //定义求和
        int sum = 0 ;
        //外部遍历二维数组 ,获取到每一个一维数组->crr[i]
        for (int i = 0; i < crr.length; i++) {
            //内部遍历一维数组,获取到一维数组的元素->crr[i][j]
            for (int j = 0; j < crr[i].length; j++) {
                //累加求和
                sum += crr[i][j];
            }
        }
        //打印
        System.out.println("sum:"+sum);
    }

}
