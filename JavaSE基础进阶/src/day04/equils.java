package day04;


import jdk.swing.interop.SwingInterOpUtils;

public class equils {
    public static void main(String[] args) {
        Student s1 =new Student("zhang","45");
        Student s2 =new Student("HUA","23");

        System.out.println(s1==s2);//false
        //Object类中的equils方法,底层也用==号比较的地址值
        System.out.println(s1.equals(s2));//false
    }
}
