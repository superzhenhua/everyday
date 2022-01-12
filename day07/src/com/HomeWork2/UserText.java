package com.HomeWork2;

import com.HomeWork.User;

/*
 实例化三个对象,属性自拟
 存储到一个合适的容器中
     需求1:计算容器中所有对象的年龄和
     需求2:判断,如果你年龄小于18,将爱好修改为"敲代码"
 */
public class UserText {
    public static void main(String[] args) {
        //创建对象
        User u1 =new User("张三",12,"吃饭");
        User u2 =new User("李四",15,"睡觉");
        User u3 =new User("王五",19,"大洞洞");
        //定义一个数组
        User []arr ={u1,u2,u3};
        //定义求和
        int sum =0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }
        System.out.println("sum:"+sum);
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //需求2:判断,如果年龄小于18,将爱好修改为"敲代码"
            if(arr[i].getAge()<18){
                arr[i].setHobby("敲代码");
            }
        }
        //遍历修改后的数组,打印各自对象属性
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName()+
                    "  "+arr[i].getAge()+"  "+arr[i].getHobby());
        }

    }
}
