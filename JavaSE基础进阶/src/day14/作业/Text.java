package day14.作业;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//用反射实现指定类方法的测试
public class Text {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //读取配置文件中的内容
        //创建集合
        Properties prop =new Properties();
        //获取系统加载器,并读取配置文件中的内容
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("prop2.properties");
        //将内容读取到集合中
        prop.load(in);
        //根据className获取类的全路径名称
        String className = prop.getProperty("className");
        //加载指定的类,进入内存,获取class对象
        Class<?> clazz = Class.forName(className);
        //创建指定类的对象
        //先得到构造方法的对象,再调用newInstance方法获取类的对象
        Constructor<?> constructor = clazz.getConstructor();
        Object target = constructor.newInstance();
        //根据method,获取指定类方法的名称
        String methods = prop.getProperty("methods");
        //将多个方法名进行切割
        String[] methodNames = methods.split(",");
        //遍历数组,获取每一个方法名
        for (String methodName : methodNames) {
            //根据每一个方法名获取其方法对象
            Method method = clazz.getMethod(methodName);
            //执行方法
            method.invoke(target);
        }

    }
}
