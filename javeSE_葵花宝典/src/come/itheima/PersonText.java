package come.itheima;

import java.util.ArrayList;

/*
 测试类:
        定义方法 public static int getMinAge(ArrayList<Person> list)返回集合中最小的年龄
        定义方法 public static int getAvgAge(ArrayList<Person> list)返回集合中的对象平均年龄

        实例化三个Person对象，属性分别为："刘备",39、"关羽",35、"张飞",34
        将对象分别添加到合适的集合中
        分别测试两个方法
 */
public class PersonText {
    public static void main(String[] args) {
        //创建三个对象
        Person p1 = new Person("刘备", 39);
        Person p2 = new Person("关羽", 35);
        Person p3 = new Person("张飞", 34);
        //定义一个集合
        ArrayList<Person> list = new ArrayList<>();
        //将对象添加到集合中
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //赋值打印
        System.out.println(getMinAge(list));
        System.out.println(getAvgAge(list));


    }

    public static int getMinAge(ArrayList<Person> list) {
        int min = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i).getAge()) {
                min = list.get(i).getAge();
            }
        }
        //返回最小值
        return min;
    }


    public static int getAvgAge(ArrayList<Person> list) {
        int avg = (list.get(0).getAge() + list.get(1).getAge() + list.get(2).getAge()) / list.size();
        return avg;
    }
}