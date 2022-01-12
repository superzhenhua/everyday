//带返回值方法联系
public class Demo6 {
    public static void main(String[] args) {

        //输出调用
        System.out.println(getMax(10,20));
    }
    //定义一个方法,带两个参数
    public static int getMax(int a , int b){
        if(a>b){
            return a;
        }else{
            return  b;
        }
    }
}
