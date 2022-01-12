package day04.重点案例;

//用递归思想求5!
public class 递归 {
    public static void main(String[] args) {
        //调用方法
        int getjc = getJc(5);
        System.out.println(getjc);
    }

    private static int getJc(int i) {
        //递归思想考虑出口
        if (i == 1) {
            return 1;
        } else {
            return i * getJc(i - 1);
        }
    }
}
