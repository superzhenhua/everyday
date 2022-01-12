package day14;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//测试指定类的方法
//需求:把指定的类和指定的方法写到配置文件中,将来如果要切换测试的类和方法,修改配置文件即可
public class Text1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //读取配置文件
        //创建properties集合对象
        Properties prop =new Properties();
        //获取系统加载类,读取配置文件中的内容
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("prop1.properties");
        prop.load(in);//根据配置文件键值对中className,获取全类名
        String className = prop.getProperty("className");
        //加载指定类到内存中,并获取class对象
        Class<?> clazz = Class.forName(className);
        //创建指定类的对象
        //先回去构造方法对象,
        Constructor<?> constructor = clazz.getConstructor();
        //在调用newInstance方法获取类的对象
        Object target = constructor.newInstance();
        //根据method名字获取指定类的方法名称
        String methods = prop.getProperty("methods");
        //将所有方法名进行切割
        String[] methodNames = methods.split(",");
        //遍历数组,获取每一个方法名
        for (String methodName : methodNames) {
            //调用class的getMethod方法,得到每个方法名的对象
            Method method = clazz.getMethod(methodName);
            //调用得到的方法对象执行方法,无参的
            method.invoke(target);
        }
    }
}
