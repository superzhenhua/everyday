package day08;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<Student1>hs=new HashSet<>();
        Student1 xiaohei1 =new Student1("xiaohei",24);
        Student1 xiaohei2 =new Student1("xiaohei",24);
        Student1 xiaobai =new Student1("xiaohei",27);
        //通过对象地址值计算hashcode值,同一个对象hashcode值也是一样的
        System.out.println("打印对象地址值");
        System.out.println(xiaohei1);
        System.out.println(xiaohei2);
        System.out.println(xiaobai);
        //结论1：通过对象地址值计算HashCode值，同一个对象hashCode值也是相同的
       // System.out.println(xiaohei1.hashCode());
       // System.out.println(xiaohei1.hashCode());
       // System.out.println(xiaobai.hashCode());
      //  System.out.println("===============");
        //student1类重写了hashcode,该方法student对象所有的属性值计算hashcode值
        //当直接打印该对象时，就不是调用Object底层的hashCode方法：通过地址值计算hash值
        //而是调用自己本身重写的自定义类中hashCode方法：通过属性值计算hash值
        System.out.println(xiaohei1.hashCode());
        System.out.println(xiaohei2.hashCode());
        System.out.println(xiaobai.hashCode());

        //
    }
}
