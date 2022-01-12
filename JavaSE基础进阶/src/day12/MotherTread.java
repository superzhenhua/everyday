package day12;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.CountDownLatch;

public class MotherTread extends Thread{
    private CountDownLatch cd;

    public MotherTread(CountDownLatch cd) {
        this.cd=cd;

    }

    @Override
    public void run() {
        //等待
        try {
            cd.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //洗碗筷
        System.out.println("妈妈正在洗碗");
    }


}
