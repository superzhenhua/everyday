package com.controller;

import com.domain.Student;
import com.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    //业务层对象
    private StudentService studentService = new StudentService();
    //键盘对象
    private Scanner sc = new Scanner(System.in);

    //启动学生管理系统方法
    public final void start() {
        lo:
        while (true) {
            //学生界面搭建
            System.out.println("----欢迎来到黑马<学生>管理系统----");
            System.out.println("1 添加学生  2 删除学生  3 修改学生   4 查看学生   5 退出");
            //提示用户选择并接收数据
            System.out.println("请输入您的选择:");
            String choose = sc.next();
            //判断用户操作
            switch (choose) {
                case "1":
                    // System.out.println("添加");
                    addStudent();
                    break;
                case "2":
                    // System.out.println("删除");
                    deletStudentById();
                    break;
                case "3":
                    //System.out.println("修改");
                    updateStudentById();
                    break;
                case "4":
                    //System.out.println("查看");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("谢谢使用,正在退出!");
                    break lo;
                default:
                    System.out.println("您的输入有误,请重新输入!");
                    break;
            }
        }
    }

    //修改学生
    private final void updateStudentById() {
        //指派service层,调用findAllStudent(),得到学生数组
        Student[] stuArray = studentService.findAllStudent();
        //判断数组地址
        if (stuArray == null) {
            System.out.println("数组中还未添加学生,请先添加!");
            //停止方法
            return;
        }
        //提升id作用域
        String id;
        while (true) {
            System.out.println("请输入学生学号");
            id = sc.next();
            //判断学号是否存在
            boolean result = studentService.isExists(id);
            if (!result) {
                System.out.println("输入的学号不存在,请重新输入");
            } else {
                break;

            }
        }
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        String age = sc.next();
        System.out.println("请输入生日:");
        String birthday = sc.next();
        //封装对象
        Student newStu = new Student();
        newStu.setId(id);
        newStu.setName(name);
        newStu.setAge(age);
        newStu.setBirthday(birthday);
        //指派studnetService调用updateStudentById()方法
        studentService.updateStudentById(id, newStu);
        //提示
        System.out.println("修改成功");

    }

    //删除学生
    private final void deletStudentById() {
        String id;
        //指派service层,调用findAllStudent(),得到学生数组
        Student[] stuArray = studentService.findAllStudent();
        //判断数组地址
        if (stuArray == null) {
            System.out.println("数组中还未添加学生,请先添加!");
            //停止方法
            return;
        }
        while (true) {
            System.out.println("请输入要删除的学号");
            id = sc.next();
            //判断学号
            //指派业务层的isEexits方法,判断学号是否存在
            boolean result = studentService.isExists(id);
            if (!result) {
                System.out.println("您输入的学号不存在,请重新输入");
            } else {
                break;
            }
        }
        //指派studnetService调用deleteStudentById方法
        studentService.deleteStudentById(id);
        //成功提示
        System.out.println("删除成功");

    }

    //查询学生
    public final void findAllStudent() {
        //指派StudentService,调用findAllStudent方法,得到学生数组
        Student[] strArr = studentService.findAllStudent();
        //数组非空判断
        if (strArr == null) {
            System.out.println("数组中还未添加学生,请先添加!");
            //结束方法
            return;
        }
        //打印表头
        System.out.println("学号    姓名    年龄    生日");
        //遍历数组
        for (int i = 0; i < strArr.length; i++) {
            //打印非空学生对象
            if (strArr[i]!= null) {
                System.out.println(strArr[i].getId() + "    " + strArr[i].getName()
                        + "    " + strArr[i].getAge() + "    " + strArr[i].getBirthday());
            }
        }
    }

    //添加学生
    private final void addStudent() {
        //提升id的作用域
        String id;
        //提示用户键盘录入信息

        while (true) {
            System.out.println("请输入学号:");
            id = sc.next();
            //学号查重
            boolean result = studentService.isExists(id);
            //判断返回结果
            if (result) {
                //如果为true,则表示该学号已存在
                System.out.println("学号已存在,请重新输入!");
            } else {
                break;
            }
        }
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
        //指派StudentService完成添加
        boolean result = studentService.addStudent(stu);
        //判断返回结果
        if (result) {
            System.out.println("添加成功!");
        } else {
            System.out.println("添加失败!");
        }

    }

    //代码优化-封装学生对象的方法->inputStudentInfo(String id)
    public abstract Student inputStudentInfo(String id);
}
