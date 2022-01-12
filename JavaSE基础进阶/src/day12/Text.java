package day12;

public class Text {
    public static void main(String[] args) {
        BoyDemo boy =new BoyDemo();
        GirlDemo girl =new GirlDemo();
        boy.setName("小皮同学");
        girl.setName("小路同学");

        boy.start();
        girl.start();
    }
}
