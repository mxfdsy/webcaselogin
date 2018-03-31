package com.longincase.login.dao;

import com.longincase.common.utils.DButils;
import com.longincase.login.service.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 平凡的世界 on 2018/3/29.
 */
public class TeacherDao {

    public  Teacher queryTeacher(String username, String password) throws SQLException {

        //得到数据库的链接对象
        Connection conn  = DButils.getConn();
        String sql ="SELECT teacher_name,password FROM teacher_info WHERE teacher_name = '"+username+" ' AND password ='"+password+"'";
        //表示预编译的 SQL 语句的对象。
        PreparedStatement pstm = conn.prepareStatement(sql);
        //执行的SQL(此 PreparedStatement 对象中执行 SQL 查询，并返回该查询生成的 ResultSet 对象。)
        ResultSet resultSet = pstm.executeQuery();
        Teacher teacher = null;
        while (resultSet.next()) {
            //如果查询的到数据,为我们的teacher对象设置值
            teacher = new Teacher();
            teacher.settName(resultSet.getString("teacher_name"));
            teacher.setPassWord(resultSet.getString("password"));
        }
        return teacher;
    }
}
