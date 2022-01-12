package day03.匿名内部类;

public class Text {
    public static void main(String[] args) {
        /*
        正常使用一个接口的步骤:1.创建实现类  2重写方法  3创建实现类对象  4调用重写后的方法
         */
        //3创建实现类对象
        InterImpl ii =new InterImpl();
        ii.show();
        //匿名内部类:将继承\实现,方法重写,创建对象放在了一步进行
        new Inner(){
            @Override
            public void show() {
            }
        }.show();
        //匿名内部类实现接口,调用接口中多个方法,可以接收这个实现类对象(多态的体现,父类引用指向实现类对象)
        Inner2 inner2 = new Inner2() {
            @Override
            public void show1() {
                System.out.println(1332);
            }
            @Override
            public void show2() {
                System.out.println(456);
            }
        };
        inner2.show1();
        inner2.show2();
    }
}
//1接口
interface Inner{
    //接口内的方法都是抽象方法
    public abstract void show();
}
//2创建实现类
class InterImpl implements Inner{
    @Override
    public void show() {
        System.out.println("实现类实现接口,执行show方法");
    }
}
//提供一个接口,有多个方法
interface Inner2{
    //抽象方法
    public abstract void show1();
    public abstract void show2();
}