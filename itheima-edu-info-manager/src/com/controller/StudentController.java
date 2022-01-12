package com.controller;

import com.domain.Student;
import com.service.StudentService;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class StudentController extends BaseStudentController {
    private StudentService studentService = new StudentService();
    //创建键盘对象
    private Scanner sc = new Scanner(System.in);

    //代码优化-封装学生对象的方法->inputStudentInfo(String id)
    @Override
    public Student inputStudentInfo(String id) {

        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        String age = sc.next();
        System.out.println("请输入生日:");
        String birthday = sc.next();
        //封装对象
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);
        //返回学生对象
        return stu;

    }
}
