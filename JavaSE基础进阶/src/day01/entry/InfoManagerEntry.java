package day01.entry;

import day01.Student;
import day01.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到黑马信息系统");
            System.out.println("1 学生系统     2 老师系统     3 退出");
            System.out.println("请选择你要进入的系统");
            int choose = sc.nextInt();
            switch(choose){
                case 1 :
                   // System.out.println("学生系统");
                    StudentController studentController =new StudentController();
                    studentController.start();
                    break;
                case 2 :
                    System.out.println("老师系统");
                    break;
                case 3 :
                    System.out.println("退出");
                    System.exit(0);
                default:
                    System.out.println("您的输入有误,请重新输入");
                    break;
            }
        }
    }
}
