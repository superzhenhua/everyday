package day09;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        //集合的批量添加  list of
        ArrayList<String>list=new ArrayList<>(List.of("张三丰","张无忌","张翠山","老王","黄坤"));

        //stream流  filter()过滤条件  forEach()循环遍历
        list.stream().filter(s -> s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s -> System.out.println(s));
    }
}
