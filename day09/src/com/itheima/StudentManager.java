package com.itheima;
/*
    学管系统开发步骤:
        1.项目演示
        2.界面搭建 -> 标准类,main方法中的界面
        3.完成具体功能 -> CRUD和退出
        4.优化代码

        自习 -> day09 -> 学管 -> 复习[1]选择题[2]重点案例 -> 良好心态 -> 升级肯定通过!
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    //main方法
    public static void main(String[] args) {
        //创建集合
        ArrayList<STU> list = new ArrayList<>();
        //创建键盘
        Scanner sc = new Scanner(System.in);
        //使用死循环->分析循环出口
        lo:
        for (; ; ) {
            System.out.println("欢迎来到黑马学生管理系统");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查询学生");
            System.out.println("0 退出");
            //提示用户选择并接收
            System.out.println("请选择");
            int choose = sc.nextInt();
            //功能匹配
            switch (choose) {
                case 1:
                    addStudent(list, sc);
                    break;
                case 2:
                    removeStudent(list,sc);
                    break;
                case 3:
                    update(list,sc);
                    break;
                case 4:
                    findStudent(list);
                    break;
                case 0:
                    System.out.println("退出");
                    break lo;//使用循环标号退出
                //System.exit(0);推出虚拟机(固定写法)
                default:
                    System.out.println("输入有误重新选择");
                    break;
            }
        }


    }
    //修改功能
    private static void update(ArrayList<STU> list, Scanner sc) {
        //非空判断;如果集合没有元素,错误提示并结束方法
        if (list.size() == 0) {
            System.out.println("当前系统没有学生,请先去添加");
            return;
        }
        while (true) {
            //获取要删除的学号
            System.out.println("请输入学号");
            String id = sc.next();
            //判断id是否在集合中
            int index = getIndex(list, id);
            //判断index
            if(index == -1){
                System.out.println("您输入的学号不存在,请重新输入");
            }else{
                System.out.println("请输入姓名");
                String name = sc.next();
                System.out.println("请输入年龄");
                String age = sc.next();
                System.out.println("请输入住址");
                String address = sc.next();
                //封装对象
                STU newstu = new STU(id, name, age, address);
               //根据索引修改
                list.set(0,newstu);
                //打印结果
                System.out.println("修改成功");
                break;
            }
        }

    }

    //删除功能
    private static void removeStudent(ArrayList<STU> list, Scanner sc) {
        //非空判断;如果集合没有元素,错误提示并结束方法
        if (list.size() == 0) {
            System.out.println("当前系统没有学生,请先去添加");
            return;
        }
        while (true) {
            //获取要删除的学号
            System.out.println("请输入学号");
            String id = sc.next();
            //判断id是否在集合中
            int index = getIndex(list,id);
            //判断返回值index
            if(index==-1){
                System.out.println("您输入的学号不存在,请重新输入");
            }else{
                //通过索引删除
                list.remove(index);
                //提示
                System.out.println("删除成功");
                //循环结束
                break;
            }
        }

    }

    //定义方法,查询传入学号是否存在
    public static int getIndex(ArrayList<STU>list,String id){
        //定义变量index
        int index = -1;
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //判断id在集合中是否存在
            if(list.get(i).getId().equals(id)){
                //找到了
                index = i;

            }
        }
        //循环结束返回索引记录值
        return index;
    }
    //查询功能
    private static void findStudent(ArrayList<STU> list) {
        //非空判断;如果集合没有元素,错误提示并结束方法
        if (list.size() == 0) {
            System.out.println("当前系统没有学生,请先去添加");
            return;
        }
        //打印表头
        System.out.println("学号     姓名     年龄     地址");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //获取当前对象
            STU stu = list.get(i);
            //打印当前属性
            System.out.println(stu.getId() + "     " + stu.getName()
                    + "     " + stu.getAge() + "     " + stu.getAddress());
        }
    }

    //添加功能
    private static void addStudent(ArrayList<STU> list, Scanner sc) {
        while (true) {
            //提示用户录入
            System.out.println("请输入学号");
            String id = sc.next();
            //判断该id是否在集合内
            int index = getIndex(list,id);
            //判断返回的index
            if(index == -1){
                //改学号不存在,可以继续存储
                System.out.println("请输入姓名");
                String name = sc.next();
                System.out.println("请输入年龄");
                String age = sc.next();
                System.out.println("请输入住址");
                String address = sc.next();
                //封装对象
                STU stu = new STU(id, name, age, address);
                //添加到集合中
                list.add(stu);
                //打印结果
                System.out.println("添加成功");
                break;
            }else{
                System.out.println("您输入的学号已经存在,请重新输入");
            }
        }


    }


}

