package day11.作业;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("第一种方式实现多线程"+i);
        }
    }
}
