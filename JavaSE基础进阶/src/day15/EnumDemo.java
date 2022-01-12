package day15;

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINNER);

        //每一个枚举项其实就是该枚举的一个对象
        Season spring = Season.SPRING;
    }

}
