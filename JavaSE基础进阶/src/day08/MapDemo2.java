package day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //创建map集合
        Map<String,String>map=new HashMap<>();
        map.put("001","xiaohei");
        map.put("002","xiaoh");
        map.put("003","xiaohi");
        map.put("004","xi");
        //获取键值对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //遍历set集合获取键值对象的键值和数值
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"  "+value);
        }


    }
}
