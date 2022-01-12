package day03.Lambda带返回值带参数;

public class Text {
    public static void main(String[] args) {
        useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        useCalculator((a, b) -> a+b);
    }
        public static void useCalculator(Calculator calculator){
        int num =calculator.calc(10,20);
        System.out.println(num);
    }
}

interface Calculator{
    int calc (int a , int b);
}
