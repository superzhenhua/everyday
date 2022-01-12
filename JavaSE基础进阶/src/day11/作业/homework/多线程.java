package day11.作业.homework;

public class 多线程 {
    public static void main(String[] args) {
        //创建对象
        MyRunnable mr =new MyRunnable();
        MyRunnable1 mr1 =new MyRunnable1();

        //创建线程
        Thread t1 =new Thread(mr);
        Thread t2 =new Thread(mr1);
        //开启线程
        t1.start();
        t2.start();
    }
}
