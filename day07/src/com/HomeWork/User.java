package com.HomeWork;

public class User {
    //成员变量
    private String name;
    private  int age;
    private String hobby;
    // 提供构造方法 -> Alt + Insert -> Constructor -> 空参和带参
    // 1.如果我们不提供构造方法，系统会默认提供一个空参构造
    // 2.如果我们提供了带参构造，那么系统就不会再提供空参构造
    // 3.要求：两种都提供

    public User() {
    }

    public User(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    //构造set和get方法

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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


}
