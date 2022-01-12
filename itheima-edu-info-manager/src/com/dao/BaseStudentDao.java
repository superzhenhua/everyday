package com.dao;

import com.domain.Student;


public interface BaseStudentDao {

    //增加
    public abstract boolean addStudent(Student stu);

    //查找
    public abstract Student[] findAllStudent() ;

    //删除
    public abstract void deleteStudentById(String id) ;

    /*
    getIndex方法:获取指定学号的学生对象的索引
    返回-1  没找到
    返回不是-1  找到了,返回索引
     */
    public abstract int getIndex(String id);

    //修改
    public abstract void updateStudentById(String id, Student newStu) ;


}
