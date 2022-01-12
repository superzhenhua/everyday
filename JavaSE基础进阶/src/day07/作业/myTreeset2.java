package day07.作业;

import java.util.Comparator;
import java.util.TreeSet;
// 使用比较器进行排序
public class myTreeset2 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Teacher1> ts = new TreeSet<>(new Comparator<Teacher1>() {//(重写comparator对象,传入TreeSet有参构造中)
            @Override
            public int compare(Teacher1 o1, Teacher1 o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;

                return result;
            }
        });
        Teacher1 t1 = new Teacher1("zhangsan", 25);
        Teacher1 t2 = new Teacher1("lisi", 26);
        Teacher1 t3 = new Teacher1("wangwu", 25);
        Teacher1 t4 = new Teacher1("zhangsan", 28);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);

        System.out.println(ts);

    }
}
