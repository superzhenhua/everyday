package day02;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
