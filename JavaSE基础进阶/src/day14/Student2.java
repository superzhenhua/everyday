package day14;

public class Student2 {
    public  String name;
    public  int age;
    public  String gender;
    private  int money =100;



    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", money=" + money +
                '}';
    }
}
