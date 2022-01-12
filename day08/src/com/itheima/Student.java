package com.itheima;
//学生类
public class Student {
    //成员变量
    private  String name;
    private  String age;
    private  String address;
    private  String tel;
    //构造方法

    public Student() {
    }

    public Student(String name, String age, String address, String tel) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.tel = tel;
    }
//成员方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
