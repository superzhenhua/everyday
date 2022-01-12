package day11;

import java.util.Properties;
import java.util.Set;

public class propertiesDemo {
    public static void main(String[] args) {
        //创建集合对象
        Properties pt =new Properties();
        //增加
        pt.setProperty("江苏","南京");
        pt.setProperty("河北","保定");
        pt.setProperty("陕西","西安");

        System.out.println(pt);

        //获取键的搜索属性
        String value = pt.getProperty("江苏");
        System.out.println(value );

        //获取所有键值
        Set<String> keys = pt.stringPropertyNames();
        for (String key1 : keys) {
            String ptProperty = pt.getProperty(key1);
            System.out.println(key1+"=="+ptProperty);
        }
    }
}
