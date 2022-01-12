package day07.作业;

import java.util.ArrayList;

/**
 * 自定义泛型方法
 * 定义一个泛型方法，传递一个集合和四个元素，将元素添加到集合中并返回
 */
public class GenericityMethod2 {
    public static void main(String[] args) {
        //调用方法(定义泛型方法是在调用方法时确定泛型具体类型)
        ArrayList<String> list = addDElement(new ArrayList<String>(), "AA", "BB", "CC", "DD");
        System.out.println(list);

        //调用方法(定义泛型方法是在调用方法时确定泛型具体类型)
        ArrayList<Integer> integers = addDElement(new ArrayList<Integer>(), 1, 2, 3, 4);
        System.out.println(integers);
    }

    //定义一个泛型方法
    public static <E> ArrayList<E> addDElement(ArrayList<E> list, E e1, E e2, E e3, E e4) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        return list;
    }
}
