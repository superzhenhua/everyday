package 练习题;
/*
      有100个限量版的水杯，但是只能通过实体店和官网才能进行购买，并且分别统计卖了多少。

      请用线程进行模拟 并设置线程名称用来代表售出途径，再将信息打印出来。

      比如（实体店卖出第1个，总共剩余n个..    ）
   */
public class CupText {
    public static void main(String[] args) {
        //创建杯子对象
        Runnable r =new CupDemo();

        //创建线程对象
        Thread t1 =new Thread(r);
        t1.setName("官网");
        t1.start();

        Thread t2 =new Thread(r);
        t2.setName("实体店");
        t2.start();
    }


}
