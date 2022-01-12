package com.Text;
//学生类
public class Student1 {
    //成员变量
    private String name;
    //int age;
    private  int age;
    //提供get/set方法
    public void setAge(int age){
        this.age= age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){ //局部变量
        //this修饰的是成员变量
       this.name= name;

    }
    public String getName(){
        return name;
    }
    //show方法
    public void show(){
        System.out.println(name+","+age);
    }
}
