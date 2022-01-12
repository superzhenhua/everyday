package com.controller;

import com.domain.Student;
import com.domain.Teacher;
import com.service.TeacherService;

import java.util.Scanner;

public abstract class BaseTeacherController {
    //创建对象
    private TeacherService teacherService = new TeacherService();
    private Scanner sc = new Scanner(System.in);

    public final void start() {
        lo:
        while (true) {
            System.out.println("欢迎来到老师信息管理系统");
            System.out.println("1 添加信息  2 删除信息  3 修改信息  4 查询信息  5 退出");
            System.out.println("请选择");
            String choose = sc.next();

            switch (choose) {
                case "1":
                    // System.out.println("增");
                    addTeacher();
                    break;
                case "2":
                    //System.out.println("删");
                    deletTeacher();
                    break;
                case "3":
                    //System.out.println("改");
                    updateTeacherById();
                    break;
                case "4":
                    // System.out.println("查");
                    findTeacher();
                    break;
                case "5":
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("输入有误请重新输入");
                    break;
            }
        }

    }

    //修改
    private final void updateTeacherById() {
        String id;
        //指派service层,调用find(),得到老师数组
        Teacher[] tea = teacherService.findTeacher();
        //判断数组是否存在
        if (tea == null) {
            System.out.println("数组中还未添加老师,请先添加!");
            return;
        }
        while (true) {
            System.out.println("请输入要修改的工号");
            id = sc.next();

            //判断学号是否重复
            //指派业务层调用isExists方法
            boolean exists = teacherService.isExists(id);
            //判断返回
            if (!exists) {
                System.out.println("您输入的工号不存在,请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        String age = sc.next();
        System.out.println("请输入生日");
        String birthday = sc.next();
        //封装对象
        Teacher teacher = new Teacher();
        //调用set方法赋值
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);

        //指派业务层,调用修改方法
        teacherService.updateTeacherById(id, teacher);
        //提示
        System.out.println("修改成功");


    }

    //删除
    public final void deletTeacher() {
        String id;
        //指派业务,调用findTeacher
        Teacher[] tea = teacherService.findTeacher();
        //判断数组地址
        if (tea == null) {
            System.out.println("数组中还未添加老师,请先添加!");
            return;
        }
        while (true) {
            System.out.println("请输入要删除的学号");
            id = sc.next();
            //判断学号
            //指派业务层,调用isExists方法判断学号是否存在
            boolean result = teacherService.isExists(id);
            if (!result) {
                System.out.println("您输入的学号不存在,请重新输入");
            } else {
                break;
            }
        }
        //指派业务层处理删除业务
        teacherService.deletTeacher(id);

        //提示
        System.out.println("删除成功");

    }

    //查询
    public final void findTeacher() {
        //指派业务,调用findTeacher方法
        Teacher[] tArr = teacherService.findTeacher();
        //非空判断
        if (tArr == null) {
            System.out.println("系统没有数据请先添加");
            return;
        }
        //打印表头
        System.out.println("工号  姓名  年龄  生日");
        //遍历打印
        for (int i = 0; i < tArr.length; i++) {
            //做不为空判断
            if (tArr[i] != null) {
                System.out.println(tArr[i].getId() + " " + tArr[i].getName() +
                        " " + tArr[i].getAge() + " " + tArr[i].getBirthday());
            }
        }

    }
    //代码优化-封装学生对象的方法->inputStudentInfo(String id)
    public abstract Teacher inputStudentInfo(String id);
    //增加
    public final void addTeacher() {
        String id;
        //接收数据
        while (true) {
            System.out.println("输入工号");
            id = sc.next();
            //解决学号重复问题,指派业务层,调用isExists方法
            boolean exists = teacherService.isExists(id);
            //判断
            if (exists) {
                System.out.println("学号存在,请重新输入");
            } else {
                break;
            }
        }
        System.out.println("输入姓名");
        String name = sc.next();
        System.out.println("输入年龄");
        String age = sc.next();
        System.out.println("输入生日");
        String birthday = sc.next();
        //封装
        Teacher tea = new Teacher(id, name, age, birthday);
        //指派业务层,调用addTeacher方法
        boolean result = teacherService.addTeacher(tea);
        //判断
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }


}

