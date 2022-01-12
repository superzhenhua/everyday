package com.dao;

import com.domain.Teacher;

public interface BaseTeacherDao {

    //增加
    public abstract boolean addTeacher(Teacher tea) ;

    //查询
    public abstract Teacher[] findfindTeacher();

    //删除
    public abstract void deletTeacher(String id) ;

    /*
    getIndex方法:获取指定学号的学生对象的索引
    返回-1  没找到
    返回不是-1  找到了,返回索引
     */
    public abstract int getIndex(String id) ;

    //修改
    public abstract void updateTeacherById(String id, Teacher teacher) ;

}
