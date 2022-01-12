package day13.作业2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket socket =new ServerSocket(1234);
        //创建线程池T
        ThreadPoolExecutor pool =new ThreadPoolExecutor(3,6,40, TimeUnit.SECONDS,new ArrayBlockingQueue<>(6), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //监视连接
        while (true) {
            Socket accept = socket.accept();
           TreadSocketDemo2 tsd2 =new TreadSocketDemo2(accept);
           // new Thread().start();
            pool.submit(tsd2);

        }

    }
}
