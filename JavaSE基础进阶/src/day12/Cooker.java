
package day12;

public class Cooker extends Thread {
    private Desk desk;

    public Cooker(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (desk.getLock()) {
                if (desk.getCount() == 0) {
                    break;
                } else {
                    if (!desk.isFlag()) {
                        //没有汉堡,做汉堡,叫醒吃货吃汉堡
                        System.out.println("厨师正在生产汉堡");
                        //调整标记
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    } else {
                        //有,就等待
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

