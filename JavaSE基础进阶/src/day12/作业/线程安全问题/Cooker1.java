package day12.作业.线程安全问题;

public class Cooker1 extends Thread{
    private Desk1 desk1;
    public Cooker1(Desk1 desk1) {
        this.desk1 =desk1;
    }

    @Override
    public void run() {
        while(true){
            synchronized (desk1.getLock()){
                if (desk1.getCount()==0){
                    break;
                } if (!desk1.isFlag()){
                    //没有汉堡,做汉堡,叫醒吃货吃汉堡
                    System.out.println("厨师正在做汉堡");
                    desk1.setFlag(true);
                    desk1.getLock().notifyAll();
                }else {
                    //有汉堡,等待
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
