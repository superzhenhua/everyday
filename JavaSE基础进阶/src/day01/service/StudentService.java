package day01.service;

import day01.dao.StudentDao;
import day01.domain.Student;

public class StudentService {
    //创建dao层对象
    StudentDao studentDao = new StudentDao();

    public boolean addStudent(Student stu) {
        //指派dao层,调用addStudent方法
        return studentDao.addStudent(stu);

    }

    public boolean isExists(String id) {
        //指派dao层,调用findAllStudent方法
        Student[] stuArr = studentDao.findAllStudent();
        //判断学号是否存在
        boolean isExists = false;
        //遍历
        for (int i = 0; i < stuArr.length; i++) {
            if (stuArr[i] != null && stuArr[i].getId().equals(id)) {
                isExists = true;

                break;
            }

        }
        return isExists;
    }

    public Student[] findAllStudent() {
        //指派dao层,调用find方法
        Student[] stu = studentDao.findAllStudent();
        //对返回数组进行判断
        boolean flag =false;
        //遍历数组
        for (int i = 0; i < stu.length; i++) {
            if(stu[i]!=null){
                flag =true;
            }
        }
        if(flag){
            return stu;
        }else{
            return null;
        }

    }


    public void deletStudent(String id) {
        studentDao.deletStudent(id);
    }
}
