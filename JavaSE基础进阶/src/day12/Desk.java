package day12;

import java.time.Period;

public class Desk {
    //定义标记
    // public static boolean flag =false;
    private boolean flag;

    //汉堡总量
    //public static int count = 10;
    private int count = 10;

    //锁对象
    //public static final Object lock =new Object();
    private final Object lock = new Object();

    public Desk() {
    }

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "flag=" + flag +
                ", count=" + count +
                ", lock=" + lock +
                '}';
    }
}
