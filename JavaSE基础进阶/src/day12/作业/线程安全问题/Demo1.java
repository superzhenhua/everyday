package day12.作业.线程安全问题;

public class Demo1 {
    public static void main(String[] args) {
        //创建对象
        Desk1 desk1 =new Desk1();
        Cooker1 ck =new Cooker1(desk1);
        Fooder1 fd =new Fooder1(desk1);

        ck.start();
        fd.start();
    }
}
