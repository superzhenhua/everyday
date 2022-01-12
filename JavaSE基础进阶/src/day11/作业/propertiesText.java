package day11.作业;

import java.io.*;
import java.util.Properties;

public class propertiesText {
    public static void main(String[] args) throws IOException {
        //创建读取对象
        Properties pt =new Properties();
        //字节输入流
        InputStream in =new FileInputStream("D:\\workspace\\zhenhua_code\\JavaEE\\Day11\\prop.properties");
        //编码方式
        String code ="UTF-8";
        //字符输入流
        InputStreamReader reader =new InputStreamReader(in,code);
        //调用local方法,文件中的键值对数据已经在集合中
        pt.load(reader);
        //释放资源
        reader.close();
    }
}
