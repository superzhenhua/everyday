package day06.作业;

import java.util.ArrayList;
import java.util.Iterator;

//使用增强for查询所有同学 //快捷方式 list.for
//使用迭代器方式：删除小路同学，查询所有
//使用普通for，所有同学年龄修改为88岁，查询所有，删除小皮
public class Collection {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Studnet> list = new ArrayList<>();
        //创建对象
        Studnet stu1 = new Studnet("小路", 34);
        Studnet stu2 = new Studnet("小贾", 25);
        Studnet stu3 = new Studnet("小皮", 35);
        //将三个对象添加到集合内
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //使用增强for查询所有同学 //快捷方式 list.for
        for (Studnet studnet : list) {
            System.out.println(studnet);
        }
        ////使用迭代器方式：删除小路同学，查询所有
        //创建迭代器,该迭代器对象默认指向0索引
        Iterator<Studnet> it = list.iterator();
        while (it.hasNext()) {//判断当前索引是否能提取元素
            //将元素提取并将迭代器对象移向下一个索引
            Studnet stu = it.next();
            if (stu.getName().equals("小路")) {
                it.remove();
            }
        }
        //创建新的迭代器
        Iterator<Studnet> it2 = list.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        //使用普通for，所有同学年龄修改为88岁，查询所有，删除小皮
        for (int i = 0; i < list.size(); i++) {
            Studnet stu = list.get(i);
            if (stu.getName().equals("小皮")) {
                list.remove(i);
                i--;
            }
            list.get(i).setAge(88);
        }
        System.out.println(list);
    }
}
