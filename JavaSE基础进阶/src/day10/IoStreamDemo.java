package day10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IoStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象-告诉虚拟机我要在哪个文件中写数据了
        OutputStream ops =new FileOutputStream("D:\\1\\a.txt");
        //写数据
        ops.write(97);
        //释放资源
        ops.close();
    }
}
