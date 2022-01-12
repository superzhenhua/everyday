package day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("1号丈夫","1号妻子");
        map.put("2号丈夫","2号妻子");
        map.put("3号丈夫","3号妻子");
        map.put("4号丈夫","4号妻子");

        //获取所有的键
        Set<String>keys = map.keySet();
        //遍历set集合
        for (String key : keys) {
            //获取get
            String value = map.get(key);
            System.out.println(key+"--"+value);
        }

    }
}
