package day12.作业.线程安全问题;

public class Fooder1 extends Thread{
        private Desk1 desk1;
    public Fooder1(Desk1 desk1) {
        this.desk1=desk1;
    }

    @Override
    public void run() {
        while(true){
            synchronized (desk1.getLock()){
                if (desk1.getCount()==0){
                    break;
                }if (desk1.isFlag()){
                    //有汉堡,直接吃汉堡,提醒厨师做汉堡
                    System.out.println("吃货正在吃汉堡");
                    desk1.setFlag(false);
                    desk1.getLock().notifyAll();
                    desk1.setCount(desk1.getCount()-1);
                }else{
                    //没有汉堡,等待
                    try {
                        desk1.getLock().wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
