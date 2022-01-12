package day09;

import java.util.ArrayList;
import java.util.stream.Stream;

//现在有两个 Arrarlist集合，分别存6名男演员名称和6名女演员名称，要求完成如下的操作 *
// 1.男演员只要名字为3个字的前两人 *
// 2.女演员只要姓扬的，并且不要第 *
// 3.把过滤后的男演员姓名和女演员姓名合并到一起 *
// 4.把上一步操作后的元素作为构造方法的参数创
public class Text {
    public static void main(String[] args) {
        //创建两个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张国荣");
        list.add("张国立");
        list.add("刘烨");
        list.add("郑伊健");
        list.add("徐峥");
        list.add("王宝强");

        ArrayList<String> list1 = new ArrayList<>();
        list.add("郑爽");
        list.add("杨紫");
        list.add("关晓彤");
        list.add("张天爱");
        list.add("杨幂");
        list.add("赵丽颖");
        //男演员只要名字为三个数的前两人
        Stream<String> stream1 = list.stream().filter(name -> name.length() == 3).limit(2);
        //女演员只要姓扬的，并且不要第一个
        Stream<String> stream2 = list.stream().filter(name -> name.startsWith("杨")).skip(1);
        //把过滤后的男演员姓名和女演员姓名合并到一起
        Stream.concat(stream1,stream2).forEach(name->{
            //封装对象  把上一步操作后的元素作为构造方法的参数创键
            Actor actor = new Actor(name);
            System.out.println(actor);

        });
    }
}
