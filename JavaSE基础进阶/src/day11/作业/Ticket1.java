package day11.作业;

public class Ticket1 implements Runnable{
    private int ticket =100;


    @Override
    public void run() {
        while(true){
            //调用方法完成卖票
            boolean flag = sellTicket();
            if(flag){
                break;
            }
        }
    }


//非静态方法  锁?其实this对象
  public synchronized boolean sellTicket(){
      if(ticket<=0){
          //卖完了
        return true;
      }else
          ticket--;
          System.out.println(Thread.currentThread().getName()+"在买票,还剩"+ticket+"张");
          return false;
      }
  }

