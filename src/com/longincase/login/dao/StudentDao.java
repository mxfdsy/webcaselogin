package com.longincase.login.dao;

import com.longincase.common.utils.DButils;
import com.longincase.login.service.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 平凡的世界 on 2018/3/31.
 */
public class StudentDao {

    public   Student getStudentList() throws SQLException {
        //开始获取数据库链接对象
        Connection connS = DButils.getConn();
        //SQL
        String sql = "SELECT * FROM student_list WHERE id = 1";
        //获取表示预编译的SQL对象
        PreparedStatement pst =connS.prepareStatement(sql);
        //执行SQL返回Result对象
        ResultSet resultSet = pst.executeQuery();

        Student student = null;
        //获取查询到的数据信息
        while (resultSet.next()) {
                student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("student_name"));
                student.setNumber(resultSet.getInt("student_number"));
    }
        return student;
    }
}
