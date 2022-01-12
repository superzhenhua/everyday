package com.Text;

public class StudentDemo1 {
    public static void main(String[] args) {
        //无参构造方法创建对象后使用setXxx()赋值
        Student s1= new Student();
        s1.setName("林青霞");
        s1.setAge(29);
        s1.show();
        //使用带参构造方法直接创建带有属性值的对象
        Student S2 = new Student("林青霞",29 );
        S2.show();
    }
}
