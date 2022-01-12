package day06;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Student stu =new Student();
        //提示并接收数据
        System.out.println("请输入姓名");
        String name =new Scanner(System.in).next();
        stu.setName(name);
        while (true) {
            System.out.println("请输入年龄");
            int age =new Scanner(System.in).nextInt();
            try {
                stu.setAge(age);
                break;
           } catch (RuntimeException e) {
                System.out.println("请输入正确的年龄");
            }
        }
        System.out.println(stu.getName()+"  "+stu.getAge());

    }

}
