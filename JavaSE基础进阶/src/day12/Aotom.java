package day12;

public class Aotom {
    public static void main(String[] args) {
        AotomTreadDemo atd =new AotomTreadDemo();
        for (int i = 0; i < 100; i++) {
            new Thread(atd).start();
        }
    }
}
