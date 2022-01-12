package 练习题;

public class CupDemo implements Runnable {
    //描述杯子的个数
    private int count = 100;
    private final Object lock = new Object();
    private int count1 = 0;
    private int count2 = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (count > 0) {
                    //有
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + (100 - (count--) + 1) + "个杯子,还剩余" + count + "个杯子");
                    //判断
                    if(Thread.currentThread().getName().equals("官网")){
                        count1++;
                    }else{
                        count2++;
                    }
                } else {
                   //没有退出循环
                    if(Thread.currentThread().getName().equals("官网")){
                        System.out.println("官网卖出了"+count1);
                    }else{
                        System.out.println("实体店卖出了"+count2);

                    }
                    break;

                }
            }
        }
    }
}