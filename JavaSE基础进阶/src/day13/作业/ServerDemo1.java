package day13.作业;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerDemo1 {
    public static void main(String[] args) throws IOException {
        //创建服务器端口对象
        ServerSocket socket =new ServerSocket(22222);
        //创建线程池
        ThreadPoolExecutor pool =new ThreadPoolExecutor(3,5,60, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //监视,连接网络
        while (true) {
            Socket accept = socket.accept();
           //创建线程对象
            TreadSocketDemo1 tsd =new TreadSocketDemo1(accept);
            pool.submit(tsd);
        }
    }
}
