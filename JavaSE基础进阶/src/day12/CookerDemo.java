package day12;

import java.util.concurrent.ArrayBlockingQueue;

public class CookerDemo extends Thread {
    private ArrayBlockingQueue<String> bd;
    public CookerDemo(ArrayBlockingQueue<String> bd) {
        this.bd =bd;
    }

    @Override
    public void run() {
        while(true){
            try {
                bd.put("汉堡包");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("厨师放入了一个汉堡包");
        }
    }
}
