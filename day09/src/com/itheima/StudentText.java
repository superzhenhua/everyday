package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentText {
    public static void main(String[] args) {
        //定义集合
        ArrayList<Student> list = new ArrayList();
        //调用方法,接收返回的对象
        // Student a = creatStu();
       // Student b = creatStu();
       // Student c = creatStu();
        //将对象添加到集合中去
       // list.add(a);
       // list.add(b);
        //list.add(c);
        //第二种方法1
        list.add(creatStu());
        list.add(creatStu());
        list.add(creatStu());
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //获取当前对象
            Student stu = list.get(i);
            //打印
            System.out.println(stu.getId()+"  "+stu.getName()+
                    "  "+stu.getAge()+"  "+stu.getBirthday());

        }

    }

    //定义方法  返回值类型:student   参数列表:空参
    public static Student creatStu() {
        //创建键盘对象
        Scanner sc = new Scanner(System.in);
        //提示用户录入
        System.out.println("请输入学号");
        String id = sc.next();
        System.out.println("请输入名字");
        String name = sc.next();
        System.out.println("请输入年龄");
        String age = sc.next();
        System.out.println("请输入生日");
        String birthday = sc.next();
        //封装学生对象
        Student stu = new Student(id, name, age, birthday);
        //返回学生对象
        return stu;


    }
}
