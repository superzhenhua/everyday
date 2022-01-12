package day07;

import java.util.ArrayList;
import java.util.Arrays;
//使用Java中的泛型方法
public class Demo {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("给小花的情书");
        list.add("给小李的情书");
        list.add("给小美的情书");

        //将list集合转为一个数组并返回
        //如果是空参, 那么返回数类型是object类型
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        //如果是带数据类型的参数,那么返回的数组和传入的类型一样
        String[] strings = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(strings));

    }
}
