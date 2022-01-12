package 练习题;

public class Student10 {
    private String name ;
    private int age ;

    public Student10() {
    }

    public Student10(String name, int age) {
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
        return "Student10{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
