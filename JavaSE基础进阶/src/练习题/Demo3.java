package 练习题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*ArrayList有以下元素: "a","f","b","c","a","d"
       对ArrayList集合去重
       (最终结果: ArrayList中没有重复元素)*/
public class Demo3 {
    public static void main(String[] args) {
        //创建arraylist集合
        ArrayList<String>list=new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        //创建set集合实现去重
        Set<String>set =new HashSet<>(list);
        //遍历set集合
        for (String s : set) {
            System.out.println(s);
        }
    }
}
