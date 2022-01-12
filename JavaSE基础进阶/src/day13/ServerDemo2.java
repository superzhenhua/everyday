package day13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo2 {
    public static void main(String[] args) throws IOException {

        //创建对象
        DatagramSocket ds =new DatagramSocket(10000);

        while (true) {
            byte[]bytes =new byte[1024];
            DatagramPacket dp =new DatagramPacket(bytes, bytes.length);
            //接收数据
            ds.receive(dp);
            //操作数据
            byte[] data = dp.getData();
            int length = dp.getLength();
            //把byte数组从0索引开始,
            System.out.println(new String( data, 0, length));
        }
    }
}
