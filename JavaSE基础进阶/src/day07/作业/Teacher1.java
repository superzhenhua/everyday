package day07.作业;
//标准类
public class Teacher1 {
    private String name;
    private int age;

    public Teacher1() {
    }

    public Teacher1(String name, int age) {
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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
