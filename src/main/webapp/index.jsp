<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="blog" type="com.epam.ef.blog.entity.Blog"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${blog.author.firstName} ${blog.author.lastName}'s blog</title>
    <style>
        body {
            margin: 0px;
            background-color: #E0E0E0; /* Grey 300 */
            font-family: sans-serif;
        }
        div#header {
            margin: 0px;
            padding: 25px;
            background-color: #009688; /* Teal 500 */
            color: #FFFFFF; /* White */
            box-shadow: 0 7px 15px 5px rgba(0,0,0,0.25);
        }
        div.card {
            margin: 25px;
            padding: 25px;
            background-color: #FFFFFF; /* White */
            color: #616161; /* Grey 700 */
            border-style: solid;
            border-width: 1px;
            border-color: #9E9E9E; /* Grey 500 */
            border-radius: 5px;
            box-shadow: 0 7px 15px 5px rgba(0,0,0,0.25);
        }
        div.card h3 {
            color: #004D40; /* Teal 900 */
        }
    </style>
</head>
<body>
<div id="header">
<h1>${blog.title}</h1>
<h4>Author: ${blog.author.firstName} ${blog.author.lastName}</h4>
</div>
<c:forEach items="${blog.posts}" var="post">
    <div class="card">
    <h3>${post.title}</h3>
    <p>${post.date}</p>
        <hr>
    <p>${post.content}</p>
    </div>
</c:forEach>
</body>
</html>
