package com.dao;

import com.domain.Student;

import java.util.ArrayList;


public class OtherStudentDao implements BaseStudentDao{
    //创建集合
    private static ArrayList<Student>list =new ArrayList<>();
    /*
  静态代码块,初始化部分数据(缓存预热)->注意要在容器之后,这里还没有使用数据库,目前的数据库就是数组
   */
    static {
        //创建对象
        Student s1 =new Student("001","张三","20","1996-3-2");
        Student s2 =new Student("002","李四","21","1997-4-2");
        Student s3 =new Student("003","王五","22","1995-5-2");
        //添加到集合lsit
      list.add(s1);
      list.add(s2);
      list.add(s3);
    }

    //增加
    public boolean addStudent(Student stu) {
       //直接添加元素进入集合
        list.add(stu);
        return true;
    }

    //查找
    public Student[] findAllStudent() {
        //创建一个新数组
        Student [] arr =new Student[list.size()];
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //将元素取出放入数组
           arr[i] = list.get(i);

        }
        //返回数组
        return arr;
    }

    //删除
    public void deleteStudentById(String id) {
        //根据学号查找对象的索引
        int index = getIndex(id);
        //根据索引删除
        list.remove(index);

    }

    /*
    getIndex方法:获取指定学号的学生对象的索引
    返回-1  没找到
    返回不是-1  找到了,返回索引
     */
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            //非空判断
            if (list.get(i)!= null && list.get(i).getId().equals(id)) {
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
       //根据索引替换,用set方法
        list.set(index,newStu);
    }


}
