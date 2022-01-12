package day07;

public class 泛型 {
    public static void main(String[] args) {
        //创建对象
        Box<String>box1 =new Box<>();
        box1.setElemt("给小李的土味情话");

        System.out.println(box1.getElemt());

       Box<Integer>box2 =new Box<>();
       box2.setElemt(23);

        System.out.println(box2.getElemt());
    }
}
