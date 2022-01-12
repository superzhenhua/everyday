package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(List.of("张三丰","张无忌","张翠山","张振华","谢广坤","刘能"));

        //截取数据,保留前面的
        //list.stream().limit(2).forEach(s -> System.out.println(s));

        //跳过指定参数个数的数据
        //list.stream().skip(2).forEach(s -> System.out.println(s));

        //合并两个流
      /*  ArrayList<String>list1=new ArrayList<>();
        list1.add("张三丰");
        list1.add("张无忌");
        Stream.concat(list.stream(),list1.stream()).forEach(s -> System.out.println(s));*/

        //去除流中的重复元素
        list.stream().distinct().forEach(s -> System.out.println(s));
    }
}
