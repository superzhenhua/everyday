package day06.作业;

import day06.AgeErrorExciption;

import java.util.IllegalFormatCodePointException;

public class Studnet {
    private String name;
    private int age;

    public Studnet() {
    }

    public Studnet(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        if (age >= 18 && age <= 23) {
            this.age = age;
        } else {
            throw new AgeErrorExciption("您的输入的年龄不在要求范围");
        }

    }

    @Override
    public String toString() {
        return "Studnet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
