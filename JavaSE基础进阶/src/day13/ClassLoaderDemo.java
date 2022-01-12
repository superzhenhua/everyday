package day13;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderDemo {
    public static void main(String[] args) throws IOException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //利用加载器去加载一个指定文件
        //参数:文件的路径
        //返回值:字节流
        InputStream in = systemClassLoader.getResourceAsStream("prop.properties");
        //创建集合对象,把加载的文件放入集合中
        Properties prop =new Properties();
        prop.load(in);
        System.out.println(prop);
        //关流
        in.close();
    }
}
