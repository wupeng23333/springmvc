<%--
  Created by IntelliJ IDEA.
  User: wupeng
  Date: 2020/8/22
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"
            + request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>" />
</head>
<body>
    <p>第一个springmvc项目</p>
    <p><a href="${pageContext.request.contextPath}/user/some.do"> 发起some.do的get请求</a></p>
    <p><a href="some.do">some</a></p>
    <br>
</body>
</html>
