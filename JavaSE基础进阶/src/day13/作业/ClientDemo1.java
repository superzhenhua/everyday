package day13.作业;

import java.io.*;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket socket =new Socket("127.0.0.1",22222);
        //创建本地字节输入流,读取本地文件
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("D:\\workspace\\zhenhua_code\\JavaSE基础进阶\\Day11\\pp.jpg"));

        //将客户端文件传入服务器,创建网络中的输出流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos =new BufferedOutputStream(os);
        int b;
        while((b= bis.read())!=-1){
            bos.write((char)b);
        }
        //需要给服务器一个结束标记
        socket.shutdownOutput();

        //创建一个网络内的字符输入流
        BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line ;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        //关流,释放资源
        socket.close();
        bis.close();


    }
}
