//带参数方法比较两个值大小
public class Demo4 {
    public static void main(String[] args) {
        //调用方法(常量值)
        getMax(10,20);
        //调用方法(变量)
        //定义变量
        int a=10;
        int b=20;
        getMax(a,b);
    }
    //定义一个方法(带两个参数)
    public static void getMax(int a ,int b){
        //if语句判断
        if(a>b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

