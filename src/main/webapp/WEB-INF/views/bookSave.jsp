<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-10-25
  Time: 오전 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>신규 도서 등록</title>
</head>
<body>
<form action="/save" method="post">
    <input type="text" placeholder="도서명" name="bookName"><br>
    <input type="text" placeholder="저자" name="bookAuthor"><br>
    <input type="text" placeholder="가격" name="bookPrice"><br>
    <input type="text" placeholder="출판사" name="bookPublisher"><br>
    <input type="submit" value="등록">
</form>
</body>
</html>
