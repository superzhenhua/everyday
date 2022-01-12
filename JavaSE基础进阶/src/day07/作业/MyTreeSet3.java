package day07.作业;

import java.util.Comparator;
import java.util.TreeSet;

/*需求：
        1.定义Student类，有两个属性，姓名（String），年龄(不确定，既可以是String，又可以是Integer)
        2.使用集合存储多个Student对象
        2.1 集合中存储的对象要唯一(如果两个Student对象的姓名和年龄都一样，则认为是同一个对象，只能存储一个)
        2.2 集合中存储的对象要按照年龄排序*/
public class MyTreeSet3 {
    public static void main(String[] args) {

        //创建TreeSet集合
        TreeSet<Student2<Integer>>ts=new TreeSet<>(new Comparator<Student2<Integer>>() {
            @Override
            public int compare(Student2<Integer> o1, Student2<Integer> o2) {
                int result = o1.getAge() - o2.getAge();
                result=result==0? o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });
        //创建对象
        Student2 stu1 =new Student2("zhangs",24);
        Student2 stu2 =new Student2("zhangs",24);
        Student2 stu3 =new Student2("lisi",28);
        Student2 stu4 =new Student2("wangwu",24);
        Student2 stu5 =new Student2("wuliu",56);

        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);
        ts.add(stu4);
        ts.add(stu5);

        System.out.println(ts);
    }
}
