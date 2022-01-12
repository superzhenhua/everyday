package day07.作业;
//自定义类型实现Comparable接口<泛型>
public class Studnent implements Comparable<Studnent> {
    private String name;
    private int age;

    public Studnent() {
    }

    public Studnent(String name, int age) {
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
        return "Studnent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Studnent o) {
        int result = this.age - o.age;
        result = result == 0 ? this.name.compareTo(o.name) : result;
        return result;
    }
}
