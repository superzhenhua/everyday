package day09;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //循环添加元素到集合
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        //用tolist方法收集过滤的数据
        List<Integer> list1 = list.stream().filter(numb -> numb % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);

        //用toset方法收集过滤的数据
        Set<Integer> set = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet());
        System.out.println(set);

}
}
