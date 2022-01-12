package day12;

public class SemaphoreDemo {
    public static void main(String[] args) {
        //创建对象
        MyRunableDemose mr =new MyRunableDemose();

        for (int i = 0; i < 100; i++) {
            new Thread(mr).start();
        }
    }
}
