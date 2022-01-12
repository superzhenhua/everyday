package day07.作业;

import java.util.TreeSet;

//treeSet默认排序  (1.自定义类型实现Comparable接口<泛型>  2.重写方法  3定义默认排序规则)
public class myTreeset1 {
    public static void main(String[] args) {
        //创建TreeSet集合
        TreeSet<Studnent> ts=new TreeSet<>();
        //创建学生对象
        Studnent stu1 =new Studnent("zhangsan",23);
        Studnent stu2 =new Studnent("lisi",23);
        Studnent stu3 =new Studnent("zhangsan",25);


        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);

        System.out.println(ts);
    }
}
