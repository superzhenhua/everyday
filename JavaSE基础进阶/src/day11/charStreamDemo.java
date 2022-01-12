package day11;

import javax.swing.*;
import java.io.*;

public class charStreamDemo {
    public static void main(String[] args) throws IOException {

        //字节流创建
        InputStream in =new FileInputStream("JavaEE:\\Day11\\aa.txt");
        //创建编码方式
        String code ="utf-8";
        //创建对象
        InputStreamReader reader = new InputStreamReader(in, code);

        //演示一次读一个字符
        int c =-1;
        while((c=reader.read())!=-1){
            System.out.print((char)c);
        }

        //演示一次读多个字符
        char[]chars =new char [1024];
        int len =-1;
        while((len= reader.read(chars))!=-1){
            //遍历数组
            for (int i = 0; i < len; i++) {
                System.out.println(chars[i]);
            }
        }
        //释放资源
        reader.close();
    }
}
