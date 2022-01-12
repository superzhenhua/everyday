
package day12;

public class Foodie extends Thread {
    private Desk desk;

    public Foodie(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (desk.getLock()) {
                if (desk.getCount() == 0) {
                    break;
                } else {
                    if (desk.isFlag()) {
                        //如果桌上有,就吃,吃完叫醒厨师
                        System.out.println("吃货正在吃汉堡");
                        desk.setFlag(false);
                        desk.getLock().notifyAll();
                        //汉堡总数减1
                        desk.setCount(desk.getCount() - 1);
                    } else {
                        //没有就等待
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

