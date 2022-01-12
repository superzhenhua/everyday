package day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        //用反射,获取一个私有的构造方法并创建对象
        //获取class类
        Class clazz = Class.forName("day14.Student");
        //获取一个私有的构造方法
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        //被privite修饰的成员不能直接使用
        //如果反射强行获取并使用,需要临时取消访问检查
        constructor.setAccessible(true);
        //用newInstance方法,直接创建对象
        Student student = (Student)constructor.newInstance("zhangsan");
        System.out.println(student);
    }
}
