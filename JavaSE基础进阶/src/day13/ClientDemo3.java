package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
//客户端
public class ClientDemo3 {
    public static void main(String[] args) throws IOException {
        Socket socket =new Socket("127.0.0.1",9998);
        //创建字节输出流
        OutputStream os = socket.getOutputStream();
        os.write("Hello".getBytes());
        //关闭输出流,写一个结束标记,对socket没有任何影响
        socket.shutdownOutput();

        //创建字符输入流
        InputStreamReader reader =new InputStreamReader(socket.getInputStream(),"UTF-8");
        BufferedReader br =new BufferedReader(reader);
        String len;
        while((len= br.readLine())!=null){
            System.out.println(len);
        }
        br.close();
        os.close();
        socket.close();


    }
}
