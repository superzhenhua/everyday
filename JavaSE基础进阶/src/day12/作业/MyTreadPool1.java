package day12.作业;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyTreadPool1 {
    public static void main(String[] args) {
        //创建一个线程池对象
        ExecutorService executorService = Executors.newCachedThreadPool();
        //往线程池内提交任务
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"正在执行程序");
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"正在执行程序");
        });
        //停止
        executorService.shutdown();

    }
}
