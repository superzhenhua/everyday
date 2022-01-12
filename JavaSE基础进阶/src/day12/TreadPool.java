package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TreadPool {
    public static void main(String[] args) {
        //创建一个线程池对象,池子中默认是空的
        ExecutorService executorService = Executors.newCachedThreadPool();//自动创建线程
        //往池子中提交任务,池子会在内部自己找线程,如果没有线程就自己创建,执行这个任务
        //Executors.可以帮助我们创建线程对象
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行任务");
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行任务");
        });
        //停止
        executorService.shutdown();
    }
}
