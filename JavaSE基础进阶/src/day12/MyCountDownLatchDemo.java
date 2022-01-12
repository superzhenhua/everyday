package day12;

import java.util.concurrent.CountDownLatch;

public class MyCountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch cd =new CountDownLatch(3);

        MotherTread m =new MotherTread(cd);
        m.start();

        ChileTread c1 =new ChileTread(cd,10);
        c1.setName("小明");
        c1.start();


        ChileTread c2 =new ChileTread(cd,15);
        c2.setName("小红");
        c2.start();


        ChileTread c3 =new ChileTread(cd,20);
        c3.setName("小刚");
        c3.start();

    }

}
