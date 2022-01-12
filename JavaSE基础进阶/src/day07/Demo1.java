package day07;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;
/**
 * 自定义泛型方法
 * 定义一个泛型方法，传递一个集合和四个元素，将元素添加到集合中并返回
 */
public class Demo1 {
    public static void main(String[] args) {
        //调用方法
        ArrayList<String> list1 = addElement(new ArrayList<String>(), "a", "v", "d", "2");
        System.out.println(list1);

        ArrayList<Integer>list =new ArrayList<>();
        ArrayList<Integer> list2 = addElement(list, 1, 3, 4, 5);
        System.out.println(list2);

    }
    public static <T>ArrayList<T> addElement(ArrayList<T>list,T t1,T t2,T t3,T t4){
            list.add(t1);
            list.add(t2);
            list.add(t3);
            list.add(t4);
            return list ;
    }
}
