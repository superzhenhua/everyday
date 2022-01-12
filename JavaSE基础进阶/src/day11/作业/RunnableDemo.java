package day11.作业;

public class RunnableDemo {
    public static void main(String[] args) {
        //创建参数对象
        MyRunnable mr =new MyRunnable();
        //创建一个线程
        Thread t1 =new Thread(mr);
        t1.start();

        Thread t2 =new Thread(mr);
        t2.start();
    }
}
