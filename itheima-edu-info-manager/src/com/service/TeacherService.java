package com.service;

import com.dao.TeacherDao;
import com.domain.Teacher;

public class TeacherService {
    //创建对象
    TeacherDao teacherDao = new TeacherDao();

    public boolean addTeacher(Teacher tea) {
        //指派dao,调用addTeacher方法
        return teacherDao.addTeacher(tea);

    }

    public Teacher[] findTeacher() {
        Teacher[] tArr = teacherDao.findfindTeacher();
        //假设数组不存在
        boolean flag = false;
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] != null) {
                flag = true;
                break;
            }
        }
        //判断flag
        if (flag) {
            return tArr;
        } else {
            return null;
        }
    }

    public boolean isExists(String id) {
        //指派Dao层使用find方法
        Teacher[] tea = teacherDao.findfindTeacher();
        //定义false,假设不存在
        boolean exsits = false;
        //遍历
        for (int i = 0; i < tea.length; i++) {
            //如果当前元素不存在,且id一样,
            if (tea[i] != null && tea[i].getId().equals(id)) {
                //修改为true,代表存在
                exsits = true;
                break;
            }
        }
        return exsits;

    }

    public void deletTeacher(String id) {
        //指派dao层
        teacherDao.deletTeacher(id);
    }

    public void updateTeacherById(String id, Teacher teacher) {
        //指派dao层,调用updateTeacherById方法
        teacherDao.updateTeacherById(id,teacher);
    }
}
