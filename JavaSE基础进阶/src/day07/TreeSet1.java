package day07;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        //创建集合
        Set<Student1> ts=new TreeSet<>();

        //创建学生对象
        Student1 stu1 =new Student1("zhangsan",25);
        Student1 stu2 =new Student1("lisi",25);
        Student1 stu3 =new Student1("wuwu",28);
        Student1 stu4 =new Student1("wangwu",32);
        Student1 stu5 =new Student1("wangwu",28);

        //添加到集合
        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);
        ts.add(stu4);
        ts.add(stu5);

        System.out.println(ts);


    }
}
