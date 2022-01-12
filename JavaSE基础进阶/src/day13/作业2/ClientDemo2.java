package day13.作业2;

import java.io.*;
import java.net.Socket;

public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket socket =new Socket("127.0.0.1",1234);
        //读取文本内容
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("D:\\workspace\\zhenhua_code\\JavaSE基础进阶\\Day11\\ai.jpg"));
        //创建网络上的流,将文本内容传输给服务器
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos =new BufferedOutputStream(os);
        //读写
        int a ;
        while((a=bis.read())!=-1){
            bos.write((char)a);
        }
        //需要给出结束标识
        socket.shutdownOutput();

        //创建字符输入流,网络上的流
        BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String len;
        while ((len= br.readLine())!=null){
            System.out.println(len);
        }
        //关流
        bis.close();
        socket.close();

    }
}
