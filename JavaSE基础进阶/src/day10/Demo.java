package day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流,准备读数据
        FileInputStream pis =new FileInputStream("D:\\1\\aaa.txt");
        //创建字节输出流,准备写数据
        FileOutputStream pos =new FileOutputStream("JavaEE\\aaa.txt\\");
        //流的拷贝
        byte [] bytes =new byte[1024];
        int len;//本次读到有效字节个数
        while((len=pis.read(bytes))!=-1){
            pos.write(bytes,0,len); //len表示读了len个字节,我就写了len个字节
        }
        //释放资源
        pis.close();
        pos.close();

    }
}
