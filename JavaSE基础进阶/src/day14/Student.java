package day14;

public class Student {
    private  String name;
    private  int age;
    //私有的有参构造
    private Student(String name){
        System.out.println("name的值为:"+name);
        System.out.println("private...Student...有构造方法");
    }
    //公共的无参构造方法
    public Student(){
        System.out.println("public...Student...无参构造方法");
    }
}
