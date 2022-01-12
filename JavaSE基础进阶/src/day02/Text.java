package day02;

import org.w3c.dom.ls.LSOutput;

class Text1{
    public static void main(String[] args) {
        System.out.println(inter.NUM);

        //访问成员方法,创建实现类对象,直接调用即可
        InterImpl ii =new InterImpl();
        ii.methor();
        ii.show();
    }
}


//实现类
class InterImpl implements  inter{
    //实现类构造,第一句super() 访问的是谁
    public InterImpl(){
        //实现类的父类是object,所以super()访问的是object的空参构造
        super();
    }
    public void methor(){
        //访问成员变量,可以直接访问
        System.out.println(NUM);

        //访问成员变量:,因为接口成员变量是常量
        //NUM=10;
    }

    @Override
    public void show() {
        System.out.println("我是实现类InterImpl重写的show方法");
    }
}