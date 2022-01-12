package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

/*
    学管系统开发步骤:
        1.项目演示
        2.界面搭建 -> 标准类,main方法中的界面
        3.完成具体功能 -> CRUD和退出
        4.优化代码
 */
public class StudentManager2 {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc = new Scanner(System.in);
        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            //界面搭建
            System.out.println("欢迎来到黑马学生管理系统");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查询学生");
            System.out.println("0 退出");
            //提示并接收数据
            System.out.println("请选择");
            int choose = sc.nextInt();
            //功能匹配
            switch (choose) {
                case 1:
                    addstudent(list, sc);
                    break;
                case 2:
                    remove(list,sc);
                    break;
                case 3:
                    updatestudent(list,sc);
                    break;
                case 4:
                   findstudent(list);
                    break;
                case 0:
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您选的功能尚未开发");
                    break;
            }
        }


    }

    private static void updatestudent(ArrayList<Student> list, Scanner sc) {
        //非空判断
        if(list.size()==0) {
            System.out.println("当前系统没有学生,请先添加");
            return;
        }
        while (true) {
            //获取需要修改的学号
            System.out.println("请输入修改的学号");
            String id = sc.next();
            //判断id是否在集合中
            int index = getindex(list, id);
            if(index==-1){
                System.out.println("输入学号不存在,请重新输入");
            }else{//封装新的学生对象
                System.out.println("姓名");
                String name = sc.next();
                System.out.println("年龄");
                String age = sc.next();
                System.out.println("生日");
                String birthday = sc.next();
                //封装对象
                Student newstu = new Student(id,name,age,birthday);
                //根据索引修改
                list.set(0,newstu);
                //打印
                System.out.println("修改完成");
                break;
            }
        }

    }

    private static void remove(ArrayList<Student> list, Scanner sc) {
        //非空判断
        if(list.size()==0){
            System.out.println("当前系统没有学生,请先添加");
            return;
        }
        while (true) {
            //获取要删除的学号
            System.out.println("请输入要删除的学号");
            String id = sc.next();
            //判断id是否在集合中存在
            int index = getindex(list,id);
            if(index==-1){
                System.out.println("您输入的学号不存在,请重新输入");
            }else{
                //通过索引删除
                list.remove(index);
                System.out.println("删除成功");
                break;
            }

        }
    }

    private static void findstudent(ArrayList<Student> list) {
        //非空判断
        if(list.size()==0){
            System.out.println("当前系统没有学生,请先添加");
            return;
        }
        //打印表头
        System.out.println("学号     姓名      年龄     生日");
        //遍历
        for (int i = 0; i < list.size(); i++) {
            //获取当前对象
            Student stu = list.get(i);
            System.out.println(stu.getId()+"     "+stu.getName()+"     "+
                    stu.getAge()+"     "+stu.getBirthday());
        }

    }

    /*
        定义方法: 在传入的集合中,查询传入的学号是否存在?
            1.存在: 返回该学号对应的索引
            2.不存在: 返回-1
                返回值类型: int
                参数列表: ArrayList<Student> list,String id
    */
    //定义方法
    public static int getindex(ArrayList<Student> list,String id){
        //定义idnex
        int index = -1;
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //判断id是否在集合中
            if(list.get(i).getId().equals(id)){
                //找到了记录对应的索引
                    index=i;
                    break;
            }

        }
        //循环结束返回index
        return index;
    }




    private static void addstudent(ArrayList<Student> list, Scanner sc) {
        while (true) {
            //提示录入
            System.out.println("请输入需要添加的信息");
            System.out.println("学号");
            String id = sc.next();
            //判断id是否在集合中
            int index = getindex(list, id);
            //对index做判断
            if(index ==-1){
               //该学号不存在可以继续添加
                System.out.println("姓名");
                String name = sc.next();
                System.out.println("年龄");
                String age = sc.next();
                System.out.println("生日");
                String birthday = sc.next();
                //封装学生对象
                Student stu =new Student(id,name,age,birthday);
                //stu放入集合中
                list.add(stu);
                //打印
                System.out.println("添加成功");
                break;

            }else{
                System.out.println("该学号存在,请重新输入");
            }
        }


    }

}
