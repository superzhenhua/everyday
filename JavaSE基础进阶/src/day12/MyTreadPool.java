package day12;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyTreadPool {
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor pool =new ThreadPoolExecutor(
                2,//线程池中核心线程的数量
                5,//线程池中最大线程数量=核心线程数量+临时线程数量
                2,//临时线程如果没有任务了,最多可存活的时间
                TimeUnit.SECONDS,//时间单位
                new ArrayBlockingQueue<>(10),//阻塞队列:当线程不够用时,用来储存任务
                Executors.defaultThreadFactory(),//线程工厂,用来创建线程的对象
                new ThreadPoolExecutor.AbortPolicy() );//任务被线程池拒绝时的策略
        //往池子里提交任务
        pool.submit(()->{
            System.out.println("爱是一道光");
        });
        //停止
        pool.shutdown();
    }
}
