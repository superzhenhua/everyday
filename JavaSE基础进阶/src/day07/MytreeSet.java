package day07;

import java.util.TreeSet;
//默认排序
public class MytreeSet {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Student>ts =new TreeSet<>();
        //创建学生对象
        Student stu1 =new Student("小红",24);
        Student stu2 =new Student("小黑",25);
        Student stu3 =new Student("小黑黑",19);
        Student stu4 =new Student("小绿",35);
        Student stu5 =new Student("小黄",24);

        //添加到集合
        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);
        ts.add(stu4);
        ts.add(stu5);

        System.out.println(ts);
    }
}
