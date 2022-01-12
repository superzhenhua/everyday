package day07.作业;
/*需求：
        1.定义Student类，有两个属性，姓名（String），年龄(不确定，既可以是String，又可以是Integer)
        2.使用集合存储多个Student对象
        2.1 集合中存储的对象要唯一(如果两个Student对象的姓名和年龄都一样，则认为是同一个对象，只能存储一个)
        2.2 集合中存储的对象要按照年龄排序*/
public class Student2 <E>{
   private String name;
   private E  age ;

    public Student2() {
    }

    public Student2(String name, E age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
