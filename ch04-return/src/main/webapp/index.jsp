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
<p>传参数</p>
<form action="returnString-view.do" method="post">
    姓名:<input type="text" name="name"><br/>
    年龄:<input type="text" name="age"><br/>
    <input type="submit" value="post请求">
</form>
<br/>
<form action="returnString-view2.do" method="post">
    姓名:<input type="text" name="name"><br/>
    年龄:<input type="text" name="age"><br/>
    <input type="submit" value="post请求">
</form>
<br/>
<form action="returnStudentJson.do" method="post">
    <input type="submit" value="提交">
</form>
</body>
</html>
