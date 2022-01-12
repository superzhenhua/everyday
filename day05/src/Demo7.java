//方法参数传递(引用类型)
public class Demo7 {
    public static void main(String[] args) {
        //定义数组
        int [] arr = {10,20,30};
        //调用change方法前
        System.out.println("调用change方法前"+arr[1]);

        //调用方法
        change(arr);

        //调用后
        System.out.println("调用change方法后"+arr[1]);

    }
    //定义一个方法
    public static void change(int [] arr){
        arr[1] = 200;
    }
}
