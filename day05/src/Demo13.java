/*
方法的重载:
在同一个类中,出现了方法名相同,参数列表不同(数量/类型/顺序)的方法,我们称这些方法构成了方法重载
扩展:程序中变量名如果是灰色的,证明没有被使用过
 */
public class Demo13 {
    public static void main(String[] args) {
        //调用方法
        getNext(10.1,20.2);
    }

    //定义方法
    public static int getNext(int a, int b) {
        return a + b;
    }

    public static int getNext(int a, int b,int c) {
        return a + b+c;

    }

    public static double getNext(double a, double b) {
        return a + b;
    }
}