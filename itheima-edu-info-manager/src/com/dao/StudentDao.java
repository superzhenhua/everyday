package com.dao;

import com.domain.Student;

import java.util.ArrayList;


public class StudentDao implements BaseStudentDao {


    //创建长度为5的学生数组
    private static Student [] stus =new Student[5];
    /*
  静态代码块,初始化部分数据(缓存预热)->注意要在容器之后,这里还没有使用数据库,目前的数据库就是数组
   */
    static {
        //创建对象
        Student s1 =new Student("001","张三","20","1996-3-2");
        Student s2 =new Student("002","李四","21","1997-4-2");
        Student s3 =new Student("003","王五","22","1995-5-2");
        //添加到数组java
        stus[0]=s1;
        stus[1]=s2;
        stus[2]=s3;
    }

    //增加
    public boolean addStudent(Student stu) {
        //定义index变量
        int index = -1;
        //遍历数组找null
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] == null) {
                //如果为null了,记录此处索引值
                index = i;
                break;
            }
        }
        if (index == -1) {
            //如果还是-1 ,表示该数组已存满,返回false
            return false;
        } else {
            //如果有位置,添加学生对象到数组
            stus[index] = stu;
            //返回结果
            return true;
        }
    }

    //查找
    public Student[] findAllStudent() {
        //查询学生,返回学生数组
        return stus;
    }

    //删除
    public void deleteStudentById(String id) {
        //根据学号查找对象的索引
        int index = getIndex(id);
        //将该索引位置的对象,使用null替换
        stus[index] = null;
    }

    /*
    getIndex方法:获取指定学号的学生对象的索引
    返回-1  没找到
    返回不是-1  找到了,返回索引
     */
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            //非空判断
            if (stus[i] != null && stus[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    //修改
    public void updateStudentById(String id, Student newStu) {
        //根据学号查找对象的索引
        int index = getIndex(id);
        //对象替换
        stus[index] = newStu;
    }


}
