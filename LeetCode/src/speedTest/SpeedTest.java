package speedTest;

public class SpeedTest {
    private SpeedTest(){};
    public static void test01(){

        long start = 0;
        long end = 0;
        if (start==0) {
            start = System.currentTimeMillis();

        }else {
            end = System.currentTimeMillis();
            System.out.println(end-start);
        }

    }
}
