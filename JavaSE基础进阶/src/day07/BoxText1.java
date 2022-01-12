package day07;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class BoxText1 {
    public static void main(String[] args) {
        //创建泛型类对象
        Box<String>Box1 =new Box<>();
        Box1.setElemt("111");

        String elemt = Box1.getElemt();
        System.out.println(elemt);
    }
}
