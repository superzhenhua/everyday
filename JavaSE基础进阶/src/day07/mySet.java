package day07;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class mySet {
    public static void main(String[] args) {
        //床架set集合set是一个接口不能直接new对象,new他的实现类
        Set<String> set = new TreeSet();
        //1给元素去重 2从小到大排序
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("aaa");

        //普通for遍历
        /*for (int i = 0; i < set.size(); i++) {
            //set集合没有索引,所以不能使用通过索引获取元素的方法
        }*/

        //单列集合都可以使用迭代器进行遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------");

        //增强for遍历
        for (String s : set) {
            System.out.println(s);
        }
    }
}
