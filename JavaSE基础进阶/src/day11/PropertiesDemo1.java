package day11;

import com.sun.source.tree.NewArrayTree;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        //读取
        Properties prop =new Properties();
        InputStream in= new FileInputStream("D:\\workspace\\zhenhua_code\\JavaEE\\Day11\\prop.properties");
        String code ="UTF-8";
        //创建字符输入流
        InputStreamReader isr=new InputStreamReader(in,code);
        //调用local方法,文件中的键值对数据已经在集合中
        prop.load(isr);
        //释放资源
        isr.close();
    }
}
