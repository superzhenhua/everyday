package 练习题;
/*有100个限量版的水杯，但是只能通过实体店和官网才能进行购买，并且分别统计卖了多少。
        请用线程进行模拟 并设置线程名称用来代表售出途径，再将信息打印出来。
        比如（实体店卖出第1个，总共剩余n个..  ）
 */
public class Demo {
    public static void main(String[] args) {

        //创建线程对象
        Thread shiti =new Thread();
        Thread guanwang =new Thread();

        shiti.setName("实体店");
        guanwang.setName("官网");

        shiti.start();
        guanwang.start();
    }

}
