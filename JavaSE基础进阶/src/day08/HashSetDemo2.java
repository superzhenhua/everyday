package day08;

import com.sun.source.tree.NewArrayTree;

import java.util.HashSet;
//先不重写hashSet方法,存入hashset集合中,发现属性值相同也可以存入
// 重写hashset方法和equils方法,存储的学生对象属性值相同时,不能储存
public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Student1>hs= new HashSet<>();

        Student1 stu1 =new Student1("xiaohei",24);
        Student1 stu2 =new Student1("xiaobai",25);
        Student1 stu3 =new Student1("xiaohei",24);

        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);

        System.out.println(hs);
    }
}
