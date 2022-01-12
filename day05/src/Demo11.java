public class Demo11 {
    public static void main(String[] args) {

        //调用
       int max=  gextMax(10,20);
        System.out.println("max:"+max);

    }
    //定义方法
    public static  int gextMax(int a,int b){
        //判断
        int max = a> b ? a: b;
        return max;

        }
    }

