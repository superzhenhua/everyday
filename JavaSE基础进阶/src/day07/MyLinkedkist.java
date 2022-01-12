package day07;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedkist {
    public static void main(String[] args) {
        //创建集合
        LinkedList<String>list =new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //在第一个索引增加一个
        list.addFirst("qqq");
        //在最后一个索引增加一个
        list.addLast("rrr");
        //返回第一个索引元素
        String first = list.getFirst();
        System.out.println(first);
        //返回最后一个索引元素
        String last = list.getLast();
        System.out.println(last);
        //移除第一个索引元素
        list.removeFirst();
        //移除最后一个索引元素
        list.removeLast();

        System.out.println("--------");
        //增强for遍历
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------");
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("--------");
        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
