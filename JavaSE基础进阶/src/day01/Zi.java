package day01;

public class Zi extends Fu {
    int a = 20;

    public void methor(){
        //子类局部出现重名
        int a =30;
        //需求:打印局部
        System.out.println(a);
        //打印本类成员变量
        System.out.println(this.a);
        //打印父类成员
        System.out.println(super.a);
    }


}
