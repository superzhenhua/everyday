
package day12;

public class Demo {
    public static void main(String[] args) {
        //创建对象
        Desk desk = new Desk();
        Foodie f = new Foodie(desk);
        Cooker c = new Cooker(desk);

        f.start();
        c.start();
    }
}

