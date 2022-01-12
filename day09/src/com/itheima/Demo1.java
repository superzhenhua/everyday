package com.itheima;

import java.util.ArrayList;

//集合的增删改查
public class Demo1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String>list =new ArrayList();
        //add 增加元素
        list.add("java");
        list.add("python");
        list.add("c");
        //add 删除元素 删除集合中第一个该元素
        list.remove("java");
        //remove(索引),删除指定索引处元素
        list.remove(0);
        //set 修改指定索引处元素
        list.set(2,"c++");
        //get索引,返回指定索引处元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
