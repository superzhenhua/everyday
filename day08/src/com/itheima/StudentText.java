package com.itheima;
//字符切割案例
public class StudentText {
    public static void main(String[] args) {
        //定义字符串
        String  s = "张三,18,西安,15535121692";
        //通过,切割字符串,标识是提前约定好的,统一使用
        String[]arr=s.split(",");
        //封装学生对象
        Student stu =new Student(arr[0],arr[1],arr[2],arr[3]);
        //打印
        System.out.println("姓名:"+stu.getName()+",年龄:"+stu.getAge()+",地址:"+stu.getAddress()+",电话:" +
                stu.getTel());
    }
}
