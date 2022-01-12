package day11;

public class MyThread extends Thread{
    @Override
    public void run() {
      //代码就是 在线程开启之后执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开起来"+i);
        }
    }
}
