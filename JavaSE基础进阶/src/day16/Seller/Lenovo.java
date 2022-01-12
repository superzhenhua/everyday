package day16.Seller;

public class Lenovo implements Seller {
    @Override
    public void repair(int money) {
        System.out.println("花" + money + "元修理电脑");
    }

    @Override
    public String sell(int money) {
        System.out.println("花" + money + "元卖电脑");
        return "Thinkpad";
    }
}
