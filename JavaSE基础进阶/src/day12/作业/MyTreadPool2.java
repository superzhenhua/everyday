package day12.作业;

import day11.MyRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyTreadPool2 {
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor pool =new ThreadPoolExecutor(
                2,//核心线程数量
                4,//线程池中最大线程数量
                4, //临时线程如果没有任务了,最多可存活的时间
                TimeUnit.SECONDS,//时间单位
                new ArrayBlockingQueue<>(2), //阻塞队列:当前线程不够用时用来储存任务的
                Executors.defaultThreadFactory(),//线程工厂,用来创造线程对象的
                new ThreadPoolExecutor.AbortPolicy()//任务被线程拒绝时的策略
        );
                //往线程池内提交任务
                    for (int i = 1; i < 7; i++) {
                        //MyRunnable1 mr =new MyRunnable1();
                        pool.submit(new MyRunnable1());
                    }
                //结束
                pool.shutdown();

    }
}
