package day06;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>list =new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //普通for遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //增强for
        for (String s : list) {
            System.out.println(s);
        }
    }
}
