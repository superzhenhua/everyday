package com.controller;

import com.domain.Student;
import com.domain.Teacher;
import com.service.TeacherService;

import java.net.IDN;
import java.util.Scanner;

public class TeacherController extends BaseTeacherController {
    //创建对象
    private TeacherService teacherService = new TeacherService();
    //创建键盘对象
    private Scanner sc = new Scanner(System.in);

    @Override
    public Teacher inputStudentInfo(String id) {
        System.out.println("输入姓名");
        String name = sc.next();
        System.out.println("输入年龄");
        String age = sc.next();
        System.out.println("输入生日");
        String birthday = sc.next();
        //封装
        Teacher tea = new Teacher(id, name, age, birthday);
        //返回学生对象
        return tea;


    }

}



