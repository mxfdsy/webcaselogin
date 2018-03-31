<%--
  Created by IntelliJ IDEA.
  User: 平凡的世界
  Date: 2018/3/29
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息表</title>
</head>
<body>
<h1 style="color: darksalmon;font-size: 50px;align-content: center">三年级二班学生信息表</h1>
<table>
    <tr>
        <th>序号</th>
            ${s.id}
        <th>学生姓名</th>
            ${s.name}
        <th>学号</th>
            ${s.number}
    </tr>
</table>
</body>
</html>
