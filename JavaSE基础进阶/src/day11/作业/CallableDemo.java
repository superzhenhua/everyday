package day11.作业;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建对象,线程开启之后需要执行里面的call方法
        Mycallable mc =new Mycallable();
        //可以获取线程执行完毕的结果,也可以作为参数传递给thread对象
        FutureTask<String>ft =new FutureTask<>(mc);
        //创建线程
        Thread t1 =new Thread(ft);
        //开启线程
        t1.start();
        //获取线程结果
        String s = ft.get();
        System.out.println(s);
    }
}
