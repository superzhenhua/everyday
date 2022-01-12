package day12;

public class BoyDemo extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MoneyDemo.money=90000;

    }
}
