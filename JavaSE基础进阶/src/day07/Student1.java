package day07;
//自定义类型实现Comparable接口<泛型>
public class Student1 implements Comparable<Student1> {
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
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
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
        //主要方法
        int result = this.age - o.age;
        //次要条件判断比较姓名
       result= result ==0 ? this.name.compareTo(o.name) : result;
       return result;
    }
}
