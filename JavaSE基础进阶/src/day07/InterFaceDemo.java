package day07;
//泛型在接口中使用的案例
public class InterFaceDemo {
    public static void main(String[] args) {
        //创建实现类对象
        Genericityimpl1 gtml =new Genericityimpl1();
        gtml.method("小丽给我的土味情话");

        //
        Genericityimpl2 gtml2 =new Genericityimpl2();
        gtml2.method(19);

    }
}
//定义一个泛型接口
interface Genericity<E>{
    public abstract void method(E e);
}
//创建实现类(子类实现如果确定了类型,直接在实现父类接口时指定具体类型即可)
class Genericityimpl2 implements Genericity<Integer>{
    @Override
    public void method(Integer integer) {
        System.out.println(integer);
    }
}
//创建实现类(子类实现如果没有确定类型,直接可沿用父类接口中的泛型)
class Genericityimpl1<E> implements Genericity<E>{
//重写实现类方法
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}

