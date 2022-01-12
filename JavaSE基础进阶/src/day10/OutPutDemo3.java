package day10;

import java.io.*;

public class OutPutDemo3 {
    //缓冲流就是对普通字节进行包装
    public static void main(String[] args) throws IOException {
        //缓冲流结合数组完成拷贝
        //创建一个字节缓冲输入流
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("D:\\aa"));
        //创建一个字节缓冲输出流
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("JavaEE\\Day11\\aa.txt"));
        //创建一个数组
        byte [] bytes =new byte[1024];
        //实现读写
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        //释放
        bis.close();
        bos.close();
    }
}
