package day03;

public class innerText {
    public static void main(String[] args) {
        //创建内部类对象
        Outer.Inner aa =new Outer().new Inner();
        //使用成员变量和方法
        System.out.println(aa.num);
        aa.show();

    }
}
//外部类
class Outer{
    int a =20;
    class Inner{
        //成员变量
        int num =10;
        public void show(){
            System.out.println("Inner的show方法执行");
            //
            System.out.println("使用外部类私有的变量"+a);
        }
    }
}