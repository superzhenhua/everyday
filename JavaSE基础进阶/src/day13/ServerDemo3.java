package day13;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        ServerSocket sc = new ServerSocket(9998);
        //调用accept方法创建连接方式
        Socket accept = sc.accept();
        //获取字节输入流
        InputStream is = accept.getInputStream();
        int b;
        while ((b = is.read()) != -1) {
            //读取每个字节并转换成字符
            System.out.println((char) b);
        }

        //创建缓存字符输出流
        OutputStreamWriter writer = new OutputStreamWriter(accept.getOutputStream(), "UTF-8");
        BufferedWriter br = new BufferedWriter(writer);

        br.write("你谁啊?");
        br.newLine();
        br.flush();//把缓冲区中的数据刷到网络通道中

        br.close();//如果调用了close,可以不用调用flush
        sc.close();
        accept.close();
        is.close();


    }
}
