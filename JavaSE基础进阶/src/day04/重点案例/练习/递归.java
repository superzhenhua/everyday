package day04.重点案例.练习;
//递归的思想:1找出口  2找规律
//用递归思想求出5的阶乘
public class 递归 {
    public static void main(String[] args) {
        int getjc = getjc(5);
        System.out.println(getjc);
    }
    private static int getjc(int i) {
        //出口
        if(i==1){
            return 1;
            //规律
        }else {
            return i*getjc(i-1);
        }
    }
}
