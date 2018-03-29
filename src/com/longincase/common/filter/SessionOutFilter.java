package com.longincase.common.filter;

import com.longincase.login.service.Teacher;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 检测当前的登录用户是否带有session
 * Created by 平凡的世界 on 2018/3/29.
 */
public class SessionOutFilter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response =(HttpServletResponse)resp;

        if (request.getRequestURI().contains("login")) {
            //包含了login让去登录
            chain.doFilter(req, resp);
        } else {
            Teacher userinfo = (Teacher) request.getSession().getAttribute("userinfo");
            if (userinfo == null) {
                //那不到他的session信息让他去登录
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }
        }
    }
    public void init(FilterConfig config) throws ServletException {

    }

}
