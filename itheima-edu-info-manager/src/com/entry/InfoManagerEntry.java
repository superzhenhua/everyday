package com.entry;

import com.controller.OtherStudentController;
import com.controller.OtherTeacherController;
import com.controller.StudentController;
import com.controller.TeacherController;
import com.domain.Teacher;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //界面搭建
            System.out.println("----欢迎来到黑马管理系统----");
            System.out.println("1 学生管理    2 老师管理    3 退出");
            //提示用户选择并接收
            System.out.println("请输入您的选择:");
            String choose = sc.next();
            //判断用户选择
            switch (choose) {
                case "1":
                    //创建学生管理系统入口
                    OtherStudentController OtherstudentController = new OtherStudentController();
                    //调用start方法
                    OtherstudentController.start();
                    break;
                case "2":
                    //System.out.println("老师");
                    //创建老师管理系统入口
                    OtherTeacherController  OtherteacherController =new  OtherTeacherController();
                    //调用start方法
                    OtherteacherController.start();
                    break;
                case "3":
                    System.out.println("谢谢使用,正在退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误,请重新输入!");
                    break;
            }
        }
    }
}
