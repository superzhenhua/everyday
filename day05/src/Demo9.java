public class Demo9 {
    public static void main(String[] args) {
    //调用方法
        eat();
        study();
    }
    //定义方法
    public static void eat(){
        System.out.println("吃饭的方法执行了");
    }
    public static void study(){
        System.out.println("学习的的方法执行了");
        //在study方法中间接调用sleep方法
        sleep();
    }
    public static void sleep(){
        System.out.println("睡觉");
    }
}
