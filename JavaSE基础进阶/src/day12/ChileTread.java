package day12;

import java.util.concurrent.CountDownLatch;

public class ChileTread extends Thread{
    private CountDownLatch cd;
    private int n;
    public ChileTread(CountDownLatch cd,int n) {
        this.cd=cd;
        this.n=n;
    }

    @Override
    public void run() {
        //吃饺子
        for (int i = 0; i <= n; i++) {
            System.out.println(getName()+"在吃第"+i+"个饺子");
        }
        //吃完说一声
        cd.countDown();
    }
}
