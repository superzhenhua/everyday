package day11;

public class RunnableDemo {
    public static void main(String[] args) {
        //创建一个参数对象
        MyRunnable mr =new MyRunnable();
        //创建一个线程对象,并把参数传递给这个线程
        //在线程启动之后,执行的就是参数里面的run方法
        Thread t1 =new Thread(mr);
        t1.start();

        MyRunnable  mr2 =new MyRunnable();
        Thread t2 =new Thread(mr2);
        t2.start();
    }
}
