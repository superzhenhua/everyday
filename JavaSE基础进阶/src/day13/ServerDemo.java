package day13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        DatagramSocket ds =new DatagramSocket(9999);
        //创建一个新的容器用来接收数据,形参表示容器形式及大小
       // byte [] bytes =new byte[1024];
        DatagramPacket dp =new DatagramPacket(new byte[1024], 1024) ;
        //接收数据,把数据放入新容器
        ds.receive(dp);//是一个阻塞方法:要接收数据,但如果目前没有数据,就死等
        //从新的容器中获取数据
        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(data,0, length));
        //释放资源
        ds.close();
    }
}
