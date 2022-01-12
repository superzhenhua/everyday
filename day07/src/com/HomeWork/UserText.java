package com.HomeWork;

import java.awt.print.Pageable;

/*
       实例化三个对象,属性自拟
       存储到一个合适的容器中
           需求1:计算容器中所有对象的年龄和
           需求2:判断,如果你按铃小于18,将爱好修改为"敲代码"
    */
public class UserText {
    public static void main(String[] args) {
        //创建三个对象
        User u1 = new User("玄德", 55, "蹦迪");
        User u2 = new User("云长", 30, "打洞洞");
        User u3 = new User("翼德", 16, "骑马");
        //定义数组,静态初始化
        User[] arr = {u1, u2, u3};
        //定义求和
        int sum = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //需求1:计算容器中所有对象的年龄和
            sum += arr[i].getAge();
        }
        System.out.println("sum:" + sum);

        for (int i = 0; i < arr.length; i++) {
            //需求2: 判断, 如果年龄小于18, 将爱好修改为"敲代码"
            if (arr[i].getAge() < 18) {
                arr[i].setHobby("敲代码");
            }
        }
        //将修改的数组遍历,打印各自对象属性
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + "," +
                    arr[i].getAge() + "," + arr[i].getHobby());
        }
    }


}
