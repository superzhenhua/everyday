package day12;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo1 {
    public static void main(String[] args) {
        //创建阻塞队列
        ArrayBlockingQueue<String> bd = new ArrayBlockingQueue<>(1);
        //
        CookerDemo ck = new CookerDemo(bd);
        FooderDemo fd = new FooderDemo(bd);

        ck.start();
        fd.start();
    }
}
