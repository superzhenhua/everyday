package day07.作业;

import jdk.swing.interop.SwingInterOpUtils;

//泛型在接口处使用
public class GenericityInterface {
    public static void main(String[] args) {
        //创建实现类对象
        Genericityimpl1 gimpl=new Genericityimpl1();
        gimpl.method("小雷给我的土味情话");

        //创建实现类对象
        Genericityimpl2  gimpl2 =new Genericityimpl2();
        gimpl2.method(19);
    }
}


//定义一个接口
interface  Genericity<E>{
    public abstract void method(E e);
}
//定义普通实现类(子类实现类如果确定了类型,直接在实现父类接口时指定具体类型即可)
class  Genericityimpl2 implements Genericity<Integer>{
    @Override
    public void method(Integer integer) {
        System.out.println(integer);
    }
}



//定义泛型实现类(子类实现如果没有确定类型,直接可以沿用父类接口处的类型)
class Genericityimpl1<E> implements Genericity<E>{
//重写方法
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}