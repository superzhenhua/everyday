package day14;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //获取class对象
        Class<?> clazz = Class.forName("day14.Student2");
        //获取成员变量的对象
        Field field = clazz.getDeclaredField("money");
        //暴力反射
        field.setAccessible(true);

        //给filed设置值
        //先创建对象,给对象设置值
        Object target = clazz.newInstance();
        field.set(target,100);

        //获取值
        Object value = field.get(target);
        System.out.println(value);

        System.out.println(target);

    }
}
