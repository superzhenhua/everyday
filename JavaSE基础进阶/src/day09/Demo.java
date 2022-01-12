package day09;

public class Demo {
    public static void main(String[] args) {
        int sum=getSum(1,23,4,4,5,5,6);
        System.out.println(sum);
    }

    private static int getSum(int numb,int...arr) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
