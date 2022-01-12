package day13;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        //创建键盘对象
        Scanner sc =new Scanner(System.in);
        //创建对象
        DatagramSocket ds =new DatagramSocket();
        while (true) {
            String s = sc.nextLine();
            if ("886".equals(s)) {
                break;
            }
            byte[] bytes = s.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port =10000;
            //创建一个包,用来封装数据
            DatagramPacket dp =new DatagramPacket(bytes,bytes.length,address,port);
            //发送数据
            ds.send(dp);
        }

        //释放资源
        ds.close();
    }
}
