package day02;

import day01.Fu;
import day01.Zi;

public class Text2 {
    public static void main(String[] args) {
        //向上转型:父类引用指向子类对象(多态的前提)
        fu f =new zi();
        f.show();//运行看右边:这里执行子类的逻辑方法
        //f.mether();//多态的弊端:不能调用子类特有的方法
        //向下转型:父类引用转为子类对象,强转
        zi z = (zi) f;
        z.show();
        z.method();
        //如果非要在多态的情况下,使用子类的特有功能,使用强转
        //建议直接创建子类对象更合理
        zi zz =new zi();
        zz.show();
        zz.method();

    }
}
class fu {
    public void show() {
        System.out.println("父类show方法");
    }
}
class zi extends fu{
    @Override
    public void show() {
        System.out.println("子类的show方法");
    }
    public void method(){
        System.out.println("子类特有的method方法");
    }
}