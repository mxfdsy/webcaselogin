package com.longincase.common.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 公共的过滤器，设置了中文编码
 * Created by 没想法的岁月 on 2018/3/29.
 */

public class Filter implements javax.servlet.Filter {
    private String Ecoding ="UTF-8";
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response =(HttpServletResponse)resp;
        request.setCharacterEncoding(Ecoding);
        response.setContentType("text/html;charset="+ Ecoding);
        chain.doFilter(req, resp);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
