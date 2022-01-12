public class AAA {
    public static void main(String[] args) {
        long sum = 0;
        int times = 100;
        for (int j = 0; j < times; j++) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                System.out.println(i);
            }
            long end = System.currentTimeMillis();
            long l = end - start;
            sum += l;

        }
        long ave = sum / times;
        System.out.println("测量" + times + "次" + "平均耗时" + ave + "ms");
    }
}