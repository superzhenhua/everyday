package day03.匿名内部类应用场景;

import jdk.swing.interop.SwingInterOpUtils;

public class Text {
    public static void main(String[] args) {
        //创建实现类对象,调用方法
        SwimingImpl si = new SwimingImpl();
        si.swim();

        //goSwiming方法的参数是接口
        goSwiming(new Swiming() {
            @Override
            public void swim() {
                System.out.println("匿名内部类,实现我们去游泳");
            }
        });

    }

    //提供操作游泳接口的方法
    public static void goSwiming(Swiming swiming) {
        swiming.swim();
    }
}

//创建接口
interface Swiming {
    public abstract void swim();
}

//创建实现类,重写方法
class SwimingImpl implements Swiming {

    @Override
    public void swim() {
        System.out.println("创建实现类,实现我们去游泳");
    }
}
