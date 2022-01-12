package com.controller;

import com.domain.Student;
import com.domain.Teacher;
import com.service.TeacherService;

import java.util.Scanner;

public class OtherTeacherController extends BaseTeacherController {
    private TeacherService teacherService = new TeacherService();
    //创建键盘对象
    private Scanner sc = new Scanner(System.in);

    //调用录入学生信息的方法
    @Override
    public Teacher inputStudentInfo(String id) {
        System.out.println("输入姓名");
        String name = sc.next();
        System.out.println("输入年龄");
        String age = sc.next();
        System.out.println("输入生日");
        String birthday = sc.next();
        //封装
        Teacher tea = new Teacher();
        tea.setId(id);
        tea.setName(name);
        tea.setAge(age);
        tea.setBirthday(birthday);
        //返回学生对象
        return tea;
    }
}


