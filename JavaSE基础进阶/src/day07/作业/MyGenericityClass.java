package day07.作业;
//自定义泛型类
public class MyGenericityClass {
    public static void main(String[] args) {
        //创建泛型类对象
        Box<String>box=new Box();
        box.setElement("小李给我的土味情话");

        String boxElement = box.getElement();
        System.out.println(boxElement);

        //
        Box<Integer>box1=new Box();
        box1.setElement(19);;
        Integer box1Element = box1.getElement();
        System.out.println(box1Element);

    }
}
