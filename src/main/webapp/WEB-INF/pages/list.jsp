<%--
  Created by IntelliJ IDEA.
  User: laker
  Date: 2020/12/11
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询了所有用户</h3>
<%--    ${user}--%>
    <c:forEach items="${list}" var="user">
        ${user.uid}
    </c:forEach>
</body>
</html>
