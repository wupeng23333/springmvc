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
    <form action="some.do" method="post">
        name:<input type="text" name="name"><br/>
        age:<input type="text" name="age"><br/>
        <input type="submit" value="post请求">
    </form>
    <br>
    <p>传参数名字不一样</p>
    <form action="other.do" method="post">
        name:<input type="text" name="rname"><br/>
        age:<input type="text" name="rage"><br/>
        <input type="submit" value="post请求">
    </form>
    <br>
    p>传参数名字不一样</p>
    <form action="receive.do" method="post">
        name:<input type="text" name="name"><br/>
        age:<input type="text" name="age"><br/>
        <input type="submit" value="post请求">
    </form>
</body>
</html>
