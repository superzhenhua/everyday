package com.factory;

import com.dao.BaseStudentDao;
import com.dao.OtherStudentDao;
import com.dao.StudentDao;
/*
       可能有两种返回结果
           1. OtherStudentDao
           2. StudentDao
       让返回值类型为他们的父类型即可
    */
public class StudnetDaoFactory {
public static BaseStudentDao getStudentDao(){
    //使用集合操作
   // return new OtherStudentDao();
    //使用数组操作
    return new StudentDao();
}
}
