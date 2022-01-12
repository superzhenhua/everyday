package day11;

public class ThreadDemo {
    public static void main(String[] args) {
        //创建线程对象
        MyThread t1 =new MyThread();
        //创建线程对象
        MyThread t2 =new MyThread();
        //开启线程,自动调用run方法
        t1.start();
        t2.start();

        System.out.println("aaaaaaaaaa");
    }
}
