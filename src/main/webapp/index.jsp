<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="blog" type="com.epam.ef.blog.entity.Blog"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>${blog.title}</h1>
<h5>Author: ${blog.author.name} ${blog.author.surname}</h5>
<c:forEach items="${blog.posts}" var="post">
    <h3>${post.title}</h3>

    <p>${post.content}</p>
</c:forEach>
</body>
</html>
