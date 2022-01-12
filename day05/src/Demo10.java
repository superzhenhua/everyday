public class Demo10 {
    public static void main(String[] args) {

        //调用方法(常量)
        method(10);//实参


    }
    //定义方法
    public static void method(int a){//形参

        if(a%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
