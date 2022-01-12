package day11;

import jdk.swing.interop.SwingInterOpUtils;
//实现Runnable接口
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("第二种方式实现多线程"+i);
        }
    }
}
