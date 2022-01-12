package day07;

import com.sun.source.tree.NewArrayTree;
//构造器排序
import java.util.Comparator;
import java.util.TreeSet;
//两种方式的区别:1创建对象不一样,重写的方法不一样
public class MyTreeSet2 {
    public static void main(String[] args) {
        //创建集合 (重写Comparator对象,传入TreeSet有参构造中)
        TreeSet<Teacher>ts =new TreeSet(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1,Teacher o2) {
                //主要判断
                int result = o1.getAge() - o2.getAge();
                //次要判断
                result= result == 0? o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });
            Teacher tea1 =new Teacher("zhangs",24);
            Teacher tea2 =new Teacher("zhangs",25);
            Teacher tea3 =new Teacher("lisi",24);

            ts.add(tea1);
            ts.add(tea2);
            ts.add(tea3);
        System.out.println(ts);
    }
}
