package day08;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        //创建hashmap集合
        HashMap<Student2,String>hm=new HashMap<>() ;

        //创建学生对象
        Student2 s1=new Student2("zhangsan",25);
        Student2 s2=new Student2("zhangsan",25);
        Student2 s3=new Student2("li",28);

        //添加集合
        hm.put(s1,"北京");
        hm.put(s2,"上海");
        hm.put(s3,"广州");

        //遍历
        //将集合中的每个键获取.存入到set集合
        Set<Student2> key = hm.keySet();
        for (Student2 keys : key) {
            //根据键获取值
            String value = hm.get(keys);
            System.out.println(keys+" "+value );
        }


        //第二种方法 ,获取键值对
        Set<Map.Entry<Student2, String>> entries = hm.entrySet();
        //遍历set集合
        for (Map.Entry<Student2, String> entry : entries) {
            Student2 key1 = entry.getKey();
            String value = entry.getValue();
            System.out.println(key1+" "+ value);
        }


        //第三种方法,底层就是第二种方式的封装
        hm.forEach((Student2 s,String ss )->{
            System.out.println(s+"  "+ss);
        });


    }
}
