package day11.作业;

import java.util.Properties;
import java.util.Set;

//propertise集合
public class Demo1 {
    public static void main(String[] args) {
        //创建集合
        Properties pt =new Properties();
        //向集合中添加键值对
        pt.setProperty("陕西","西安");
        pt.setProperty("湖北","武汉");
        pt.setProperty("新疆","乌鲁木齐");

        System.out.println(pt);
        //获取键的搜索属性值
        String value = pt.getProperty("湖北");
        System.out.println(value);

        ///获取所有键值
        Set<String> keys = pt.stringPropertyNames();
        for (String key : keys) {
            String value1 = pt.getProperty(key);
            System.out.println(key+"=="+value1);
        }
    }
}
