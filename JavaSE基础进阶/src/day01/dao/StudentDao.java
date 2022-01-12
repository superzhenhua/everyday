package day01.dao;

import day01.domain.Student;

public class StudentDao {
    //定义数组
    public Student[] stus = new Student[5];

    public boolean addStudent(Student stu) {
        //数据库寻找是否有储存位置
        int index = -1;
        //遍历数组
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] == null) {
                //证明有至少一个空位,记录索引位置
                index = i;
                break;
            }
        }
        //判断index
        if (index == -1) {
            return false;
        } else {
            stus[index] = stu;
            return true;
        }
    }


    public Student[] findAllStudent() {
        return stus;
    }


    public void deletStudent(String id) {
        //根据学号查找索引
        int index = getIndex(id);
        stus[index]=null;
    }

    private int getIndex(String id) {
        int index =-1;
        for (int i = 0; i < stus.length; i++) {
            if(stus[i]!=null&&stus[i].getId().equals(id)){
                index= i;
            }
        }
        return index;
    }
}
