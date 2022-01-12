package day08;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //map集合是个接口不能直接创建对象,需要用他的父类引用指向子类对象(多态形式)
        Map<String,String>map=new HashMap<>();
        map.put("heima001","小何");
        map.put("heima002","小化");
        map.put("heima003","小李");
        map.put("heima004","小倩");
        map.put("heima005","小澜");
        map.put("heima006","小鸡");

     //根据键删除键值对元素
        boolean remove = map.remove("heima001", "小何");
        System.out.println(remove);
        System.out.println(map);

        //移除所有的键值对元素
        map.clear();
        System.out.println(map);

        //集合长度,也就是键值对个数
        int size = map.size();
        System.out.println(size);

        //判断集合是否为空
        boolean empty = map.isEmpty();
        System.out.println( empty);

        //判断集合是否包含指定的值
        boolean value = map.containsValue("小鸡");
        System.out.println(value);
    }
}
