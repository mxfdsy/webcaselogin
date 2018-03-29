<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生管理系统</title>
  </head>
  <body>
  <h1 style="color:cornflowerblue;">浙江越秀外国语学院学生管理系统</h1>
  <h1 style="color:coral;">欢迎您，登录</h1>
  <form action="/login" method="post">
    <input type="text" name = "username"/>
    <input type="password" name = "pwd"/>
    <input type="submit" value="登录"/>
  </form>
  </body>
</html>