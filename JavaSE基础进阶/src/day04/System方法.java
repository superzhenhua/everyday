package day04;

import org.w3c.dom.ls.LSOutput;

public class System方法 {
    public static void main(String[] args) {
        System.out.println(11);
        //终止当前虚拟机
        System.exit(0);

        //获取当前时间(毫秒)
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        //arrarycopy(数源数组,起始索引,目的地数组,起始索引,拷贝个数)
        int[]arr1={1,2,3,4,5};
        int[]arr2=new int[10];
        System.arraycopy(arr1,0,arr2,0, arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
