package day12.作业;

public class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"在执行了");
    }
}
