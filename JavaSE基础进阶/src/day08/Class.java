package day08;

import java.util.TreeSet;

public class Class {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Student>ts =new TreeSet<>();
        Student stu1 =new Student("zhangsan",80,80,80);
        Student stu2 =new Student("zhangsan",90,90,90);
        Student stu3 =new Student("zhangsan",100,100,100);

        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);

        System.out.println(ts);
    }
}
