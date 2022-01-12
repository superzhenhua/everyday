package com.HomeWork2;
/*
    面向对象的思想(java语言), 是基于面向过程(c语言)

    类 -> 对一类具有相同属性和行为事物的描述 -> 理解为[设计图]
    对象 -> 客观存在的看得见摸得着的事物(万物皆对象) -> 根据设计图创建

    练习: 基本的学生类
        1.属性 -> 成员变量 -> 不要给具体的值
        2.行为 -> 成员方法 -> 不带static关键字

    [成员]包含成员变量, 成员方法 -> 位置写在[类中方法外]

    private关键字: 修饰成员 (被private修饰的成员只能在本类访问)
 */
public class Student {
    //成员变量(属性)
    private String name ;
    private int age ;
    //构造方法->无参和带参

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //定义get和set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //成员方法
    public void study(){
        System.out.println("在学习");
    }
}
