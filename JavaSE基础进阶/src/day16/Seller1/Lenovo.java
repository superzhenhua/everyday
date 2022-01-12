package day16.Seller1;

public class Lenovo implements Seller{

    @Override
    public void repair(int money) {
        System.out.println("花"+money+"元修理电脑");
    }

    @Override
    public String sell(int money) {
        System.out.println("花"+money+"元卖了电脑");
        return "Thinkpad";
    }
}
