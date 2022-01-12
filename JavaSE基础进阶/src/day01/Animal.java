package day01;

public abstract class Animal {
    public void drink(){
        System.out.println("喝水");
    }
    public abstract void eat();
}

//text
class Text1{
    public static void main(String[] args) {
        //创建子类对象
        Cat c =new Cat();
        c.eat();
        c.drink();

        //创建子类对象
        Dog d =new Dog();
        d.eat();
        d.drink();
    }
}