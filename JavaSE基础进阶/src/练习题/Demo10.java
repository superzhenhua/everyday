package 练习题;

import java.util.ArrayList;

public class Demo10 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<Student10> list = new ArrayList<>();
        //创建学生对象
        Student10 s1 = new Student10("张三", 10);
        Student10 s2 = new Student10("李四", 5);
        Student10 s3 = new Student10("王五", 18);
        Student10 s4 = new Student10("奎刚", 52);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //调用sort排序,使用Comparator比较器
        list.sort((o1,o2)->o1.getAge()- o2.getAge());
        //使用stream流进行遍历过滤+计数
        long count = list.stream().filter(student10 -> student10.getAge() > 5).count();

        System.out.println(count);
    }
}
