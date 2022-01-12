package day11;

public class TicketDemo {
    public static void main(String[] args) {
        //创建电影票对象
        Ticket t =new Ticket();
        //创建三个线程(三个售票窗口)
        Thread t1 =new Thread(t);
        Thread t2 =new Thread(t);
        Thread t3 =new Thread(t);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        //开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
