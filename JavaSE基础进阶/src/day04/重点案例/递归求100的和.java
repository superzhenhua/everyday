package day04.重点案例;
//用递归求
public class 递归求100的和 {
    public static void main(String[] args) {
      int sum = getnum(100);
        System.out.println(sum);
    }
    private static int getnum(int i) {
        if(i==1){
            return 1;
        }else{
            return i+getnum(i-1);
        }
    }
}
