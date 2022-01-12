package com.dao;

import com.domain.Teacher;

import java.util.ArrayList;

public class OtherTeacherDao implements BaseTeacherDao {
    //创建集合
    private static ArrayList<Teacher> list =new  ArrayList<>();

    //静态代码块
    {
        Teacher t1 = new Teacher("001", "张三", "34", "1976-03-12");
        Teacher t2 = new Teacher("002", "李四", "40", "1976-03-12");
        Teacher t3 = new Teacher("003", "王五", "44", "1976-03-12");
        //添加对象
        list.add(t1);
        list.add(t2);
        list.add(t3);
    }

    //增加
    public boolean addTeacher(Teacher tea) {
       //直接添加元素进入集合
        list.add(tea);
        return true;
    }

    //查询
    public Teacher[] findfindTeacher() {
        //创建一个新数组
        Teacher[]arr =new Teacher[list.size()];
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //将元素取出放入数组
            arr[i]=list.get(i);
        }
        return arr;
    }

    //删除
    public void deletTeacher(String id) {
        //根据学号查找对象的索引
        int index = getIndex(id);
        //直接移除
        list.remove(index);
    }

    /*
    getIndex方法:获取指定学号的学生对象的索引
    返回-1  没找到
    返回不是-1  找到了,返回索引
     */
    public int getIndex(String id) {
        //
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    //修改
    public void updateTeacherById(String id, Teacher teacher) {
        //根据学号查找索引
        int index = getIndex(id);
        //替换对象
        list.set(index,teacher);
    }

}
