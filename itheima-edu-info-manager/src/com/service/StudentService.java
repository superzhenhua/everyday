package com.service;

import com.dao.BaseStudentDao;
import com.dao.OtherStudentDao;
import com.dao.StudentDao;
import com.domain.Student;
import com.factory.StudnetDaoFactory;

import javax.print.attribute.standard.MediaSize;

public class StudentService {

    OtherStudentDao studentDao = new OtherStudentDao();
    //通过工厂类调用getStudentDao方法
    BaseStudentDao StudentDao = StudnetDaoFactory.getStudentDao();

    public boolean addStudent(Student stu) {
        //指派StudentDao完成添加
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {
        //指派Dao,获取数组
        Student[] stuArr = studentDao.findAllStudent();
        //定义变量,初始值为false,假设不存在
        boolean exists = false;
        //遍历数组
        for (int i = 0; i < stuArr.length; i++) {
            //如果当前元素不为空(不能确定数组中有多少对象,应用类型数组动态初始化值为null,因此需要先做非空判断),并且id一样
            if (stuArr[i] != null && stuArr[i].getId().equals(id)) {
                //修改exists为true,代表已经存在
                exists = true;
                //结束循环
                break;
            }
        }
        return exists;
    }

    public Student[] findAllStudent() {
        //调用Dao层,获取学生数组
        Student[] allStudent = studentDao.findAllStudent();
        //定义flag初始值为false,假设数组中没有数据
        boolean flag = false;
        //遍历数组
        for (int i = 0; i < allStudent.length; i++) {
            if (allStudent[i] != null) {
                //但凡数组中有一个不是null的元素,代表数组中至少有一个学生对象,修改flag
                flag = true;
                //结束循环
                break;
            }
        }
        //判断flag
        if (flag) {
            //如果flag为true,则代表数组中至少有一个学生对象,返回数组
            return allStudent;
        } else {
            //如果为false,代表没有学生对象,返回false
            return null;
        }
    }

    public void deleteStudentById(String id) {
        //指派Dao层中的deleteStudentById方法
        studentDao.deleteStudentById(id);

    }

    public void updateStudentById(String id, Student newStu) {
        //指派dao层
        studentDao.updateStudentById(id, newStu);
    }
}