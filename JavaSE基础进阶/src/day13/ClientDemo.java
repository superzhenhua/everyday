package day13;

import java.io.IOException;
import java.net.*;

//发送端
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        DatagramSocket ds =new DatagramSocket();
        //打包要发送的数据
        String s ="送给村长的礼物";
        //容器
        byte[] bytes = s.getBytes();
        //送的地址
        InetAddress address = InetAddress.getByName("127.0.0.1");
        //端口
        int port =9999;
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length,address,port);
        //发送
        ds.send(dp);
        //释放资源
        ds.close();
    }

}
