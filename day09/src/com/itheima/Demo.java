package com.itheima;
/*
集合:用来存储相同数据类型的容器,可以自动扩容
定义格式:数据类型<泛型>变量名= new数据类型<>();
泛型:用来限制集合中可以存储的数据类型,只能写引用数据类型.
 */
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //空参构造创建集合对象
        ArrayList<String>list=new ArrayList();
        //返回集合长度
        System.out.println("长度:"+list.size());
        //add添加对象(顺序添加)>在集合的末尾添加
        list.add("成龙");
        list.add("吴彦祖");
        list.add("李连杰");
        //add(索引,对象)插队
        list.add(0,"张三");
        //返回集合长度
        System.out.println("长度:"+list.size());
        //打印集合变量
        System.out.println(list);
    }
}
