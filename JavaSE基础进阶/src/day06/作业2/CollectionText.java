package day06.作业2;

import java.util.ArrayList;
import java.util.Iterator;

//使用增强for查询所有同学 //快捷方式 list.for
//使用迭代器方式：删除小路同学，查询所有
//使用普通for，所有同学年龄修改为88岁，查询所有，删除小皮
public class CollectionText {
    public static void main(String[] args) {
        //定义一个集合
        ArrayList<Student>list=new ArrayList<>();
        //创建学生对象
        Student stu1 =new Student("小路",23);
        Student stu2 =new Student("小贾",26);
        Student stu3 =new Student("小皮",35);
        //将学生对象添加到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

     /*   //使用增强for查询所有同学 //快捷方式 list.for
        for (Student student : list) {
           System.out.println(student);

     }
        //使用迭代器方式：删除小路同学，查询所有
        //创建迭代器对象,默认迭代器指向0索引
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){//判断当前位置是否有元素能够取出
            Student stu = it.next();//取出当前元素,迭代器对象指向下一个索引
            if(stu.getName().equals("小路")){
                it.remove();
            }
        }
        //创建新的迭代器
        Iterator<Student> it2 = list.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }*/

        //使用普通for，所有同学年龄修改为88岁，查询所有，删除小皮
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getName().equals("小皮")){
                list.remove(i);
                i--;
            }
            list.get(i).setAge(88);
        }
        System.out.println(list);
    }
}
