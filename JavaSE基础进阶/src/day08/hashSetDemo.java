package day08;

import java.util.HashSet;
import java.util.Iterator;
//hashset特性:存取顺序不一样,元素不重复,没有索引不能用for循环
public class hashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs =new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("java");//元素不重复
        hs.add("java");
        hs.add("java");

        //迭代器   没有索引
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------");
        //增强for
        for (String s : hs) {
            System.out.println(s);
        }
    }
}
