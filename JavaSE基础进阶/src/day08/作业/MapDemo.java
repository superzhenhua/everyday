package day08.作业;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        //创建集合,map集合是一个接口,不能直接创建对象,需创建他的实现类接口
        Map<String,Integer>map=new HashMap<>();
        //添加键值对进入集合
        map.put("001",123);
        map.put("002",1233);
        map.put("003",123456);
        //将集合内每组键值对的键获取,存入一个set集合中
        Set<String> strings = map.keySet();
        //遍历set集合,通过键获取对应的value值
        for (String key: strings) {
            Integer value = map.get(key);
            System.out.println(key+" "+value);
        }

    }
}
