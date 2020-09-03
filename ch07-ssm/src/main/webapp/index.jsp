<%--
  Created by IntelliJ IDEA.
  User: wupeng
  Date: 2020/8/25
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"
            + request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>功能入口</title>
    <base href="<%=basePath%>">
</head>
<body>
<div align="center">
    <p>SSM整合例子</p>
    <img src="images/1.jpg"/>
    <table>
        <tr>
            <td><a href="addStudent.jsp"> 注册学生</a></td>
        </tr>
        <tr>
            <td><a href="ListStudent.jsp"> 浏览学生</a></td>
        </tr>
    </table>
</div>

</body>
</html>
