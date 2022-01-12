package day01.controller;

import day01.domain.Student;
import day01.service.StudentService;

import java.util.Scanner;

public class StudentController {
    //创建业务层对象
    StudentService studentService = new StudentService();
    Scanner sc = new Scanner(System.in);

    public void start() {

        //
        lo:
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1 增加     2 删除     3 修改     4 查询     5退出");
            System.out.println("请输入选择");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    // System.out.println("增加");
                    addStudent();
                    break;
                case 2:
                    //System.out.println("删除");
                    deletStudent();

                    break;
                case 3:
                    System.out.println("修改");
                    break;
                case 4:
                    //System.out.println("查询");
                    findAllStudent();
                    break;
                case 5:
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("输入有误,请重新输入");
                    break;

            }
        }
    }

    private void deletStudent() {
        System.out.println("请输入要删除的学号");
        String id = sc.next();
        //指派业务层,调用find方法
        Student[]stu =studentService.findAllStudent();
        //非空判断
        if(stu==null){
            System.out.println("系统中还未添加学生,请先添加");
        }
        //指派业务层,调用isExists方法
        boolean result =studentService.isExists(id);
        if(!result){
            System.out.println("您输入的学号不存在,请重新输入");
        }
        //指派业务层调用删除方法
        studentService.deletStudent(id);

        System.out.println("删除成功");
    }

    private void findAllStudent() {
        //指派业务层调用find方法
        Student[] stu = studentService.findAllStudent();
        //进行非空判断
        if (stu == null) {
            System.out.println("系统中还未添加学生,请先添加");
            return;
        }
        //表头
        System.out.println("学号     姓名     年龄");
        //遍历返回的数组
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                System.out.println(stu[i].getId() + "     " + stu[i].getName() + "     " + stu[i].getAge());
            }
        }
    }

    private void addStudent() {
        String id = null;
        while (true) {
            System.out.println("输入学号");
            id = sc.next();
            //对输入学号做重复判断
            //指派业务层调用isExists方法
            boolean flag = studentService.isExists(id);
            //判断返回结果
            if (flag) {
                System.out.println("该学号已存在,请重新输入");
            } else {
                break;
            }
        }
        System.out.println("输入姓名");
        String name = sc.next();
        System.out.println("输入年龄");
        String age = sc.next();

        //封装
        Student stu = new Student(id, name, age);
        //指派业务层,调用添加方法
        boolean result = studentService.addStudent(stu);

        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }

    }

}



