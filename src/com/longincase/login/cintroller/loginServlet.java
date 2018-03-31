package com.longincase.login.cintroller;

import com.longincase.login.service.LongInService;
import com.longincase.login.service.Teacher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * Created by 没想法的岁月 on 2018/3/29.
 */
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求中带的参数信息
        String username = request.getParameter("username");
        String password = request.getParameter("pwd");
        //创建longinService对象校验账号和密码的合法性
        LongInService longin = new LongInService();
        Teacher teacher = null;
        try {
            teacher = longin.chaeakLongin(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (teacher != null) {
            //如果验证通过则转发请求
            request.getRequestDispatcher("WEB-INF/view/StudentList.jsp").forward(request,response);
            //为teacher设置session信息
            request.getSession().setAttribute("user",teacher);
        }else{
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
