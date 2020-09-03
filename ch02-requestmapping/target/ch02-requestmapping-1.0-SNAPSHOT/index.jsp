<%--
  Created by IntelliJ IDEA.
  User: wupeng
  Date: 2020/8/22
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>第一个springmvc项目</p>
    <p><a href="test/first.do"> 发起some.do的get请求</a></p>
    <br>
    <form action="test/first.do" method="post">
        <input type="submit" value="post请求">
    </form>
</body>
</html>
