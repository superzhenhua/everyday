package com.dao;

import com.domain.Teacher;

public class TeacherDao implements BaseTeacherDao{
    //定义数组
    static Teacher[] tArr = new Teacher[5];

    //静态代码块
    {
        Teacher t1 = new Teacher("001", "张三", "34", "1976-03-12");
        Teacher t2 = new Teacher("002", "李四", "40", "1976-03-12");
        Teacher t3 = new Teacher("003", "王五", "44", "1976-03-12");
        //添加对象
        tArr[0] = t1;
        tArr[1] = t2;
        tArr[2] = t3;
    }

    //增加
    public boolean addTeacher(Teacher tea) {
        //
        int index = -1;
        //遍历
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == null) {
                //为null,找到了
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            tArr[index] = tea;
            return true;
        }


    }

    //查询
    public Teacher[] findfindTeacher() {
        return tArr;
    }

    //删除
    public void deletTeacher(String id) {
        //根据学号查找对象的索引
        int index = getIndex(id);
        //将该索引位置的对象,使用null替换
        tArr[index] = null;
    }

    /*
    getIndex方法:获取指定学号的学生对象的索引
    返回-1  没找到
    返回不是-1  找到了,返回索引
     */
    public int getIndex(String id) {
        //
        int index = -1;
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] != null && tArr[i].getId().equals(id)) {
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
        tArr[index] = teacher;
    }

}
