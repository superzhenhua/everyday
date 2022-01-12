package 练习题;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

/*1、ClasspathApplicationContext构造方法
        ① 读取classpath路径下的applicationContext.properties文件中的内
        容到Properties集合中
        ② 遍历集合通过反射创建对应类的对象存储到beans集合中
        3、getBean方法：遍历beans集合获取value的Class类型和传入的
        Class类型进行比对，如果相等直接返回该对象*/
public class Demo9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //创建Properties集合,将配置文件读取到集合中去
        Properties pp =new Properties();
        //获取系统加载类读取配置文件
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("applicationContext.properties");
        pp.load(in);
        //通过orderService获取配置文件内容键的全类名
        String oderService = pp.getProperty("orderService");
        String userService = pp.getProperty("userService");

        //加载指定类到内存中,获取class类的对象
        Class clazz = Class.forName("applicationContext.properties");
        //获取指定类对象
        Object target = clazz.newInstance();
        //获取类的方法
        Method[] methods = clazz.getDeclaredMethods();
        //遍历
        for (Method method : methods) {
             method.invoke(target);
        }


    }

}
