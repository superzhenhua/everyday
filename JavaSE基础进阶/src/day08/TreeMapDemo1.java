package day08;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        //集合
        TreeMap<Student3,String>tm=new TreeMap<>(new Comparator<Student3>() {
            @Override
            public int compare(Student3 o1, Student3 o2) {
                int result = o1.getAge() - o2.getAge();
                result=result==0?o1.getName().compareTo(o2.getName()):result;

                return result;
            }
        });
        Student3 s1=new Student3("zhangzhenhua",25);
        Student3 s2=new Student3("zhangzhenhua",25);
        Student3 s3=new Student3("lisi",26);

        tm.put(s1,"上海");
        tm.put(s2,"北京");
        tm.put(s3,"深圳");


        System.out.println(tm);


    }
}
