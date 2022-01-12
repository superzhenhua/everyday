package come.itheima;
/*
分析并完成以下需求:

        定义Person类，包含属性：
        String类型 name，int类型 age
        提供空参、带参构造
        提供getXxx()、setXxx()方法

        测试类:
        定义方法 public static int getMinAge(ArrayList<Person> list)返回集合中最小的年龄
        定义方法 public static int getAvgAge(ArrayList<Person> list)返回集合中的对象平均年龄

        实例化三个Person对象，属性分别为："刘备",39、"关羽",35、"张飞",34
        将对象分别添加到合适的集合中
        分别测试两个方法
 */
public class Person {
    private String name;
    private int  age ;

    public Person() {
    }

    public Person(String name, int age) {
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
}
