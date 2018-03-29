package com.longincase.common.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 连接数据库的配置
 * Created by 没想法的岁月 on 2018/3/29.
 */
public class DButils {
    private static String driver = "com.mysql.jdbc.driver";
    private static String url = "jdbc:mysql://localhost:3306/hello";
    private static String user = "root";
    private static String password = "cww963559210";

    public static Connection getConn() throws SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        Connection conn  = dataSource.getConnection();
        return conn;
    }
    public static  void close(ResultSet resultSet, PreparedStatement preparedStatement,Connection connection){
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
