package day06.作业2;

import day06.AgeErrorExciption;

//学生类
public class Student {
    private String name ;
    private int age;

    public Student() {
        this.name = name;
    }

    public Student(String name, int age) {
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
        if(age>=18&&age<=23){
            this.age = age;
        }else
            throw new AgeErrorExciption();

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
