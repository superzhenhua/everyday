package day12;

import java.util.concurrent.Semaphore;

public class MyRunableDemose implements Runnable{
    //获取管理员对象
    private Semaphore sp =new Semaphore(2);

    @Override
    public void run() {
            //获取通行证
        try {
            sp.acquire();
            //开始通行
            System.out.println("获取了通行证开始行使");
            System.out.println("归还通行证");
            sp.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
