package com.longincase.login.service;

import com.longincase.login.dao.TeacherDao;

import java.sql.SQLException;

/**
 *
 * Created by 没想法的岁月 on 2018/3/29.
 */
public class LongInService {
    public LongInService() {
    }

    //这里在校验账号和密码的正确性
    public Teacher chaeakLongin(String name, String password) throws SQLException {
        TeacherDao teacherDao = new TeacherDao();
        return teacherDao.queryTeacher(name,password);
    }
}
