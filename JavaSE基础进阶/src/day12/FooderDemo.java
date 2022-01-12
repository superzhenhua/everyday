package day12;

import java.util.concurrent.ArrayBlockingQueue;

public class FooderDemo extends Thread {
    private ArrayBlockingQueue<String> bd;

    public FooderDemo(ArrayBlockingQueue<String> bd) {
        this.bd = bd;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take = bd.take();
                System.out.println("吃货将" + take + "拿出来吃了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
