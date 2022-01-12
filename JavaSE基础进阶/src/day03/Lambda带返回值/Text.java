package day03.Lambda带返回值;

import java.util.Random;

public class Text {
    public static void main(String[] args) {
        //匿名内部类实现
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                return new Random().nextInt(10);
            }
        });
        //需求二
        useRandomNumHandler(() -> new Random().nextInt(10));
    }


    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        System.out.println(randomNumHandler.getNumber());
    }
}

//
interface RandomNumHandler {
    int getNumber();
}