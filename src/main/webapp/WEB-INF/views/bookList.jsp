
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%--반복문 (jstl) 문법--%>
<html>
<head>
    <title> bookList.jsp</title>
</head>
<body>
<%--대상의 전체 목록을 보여줄때 많이 사용함.--%>
<table>
   <tr>
      <th>번호</th>
      <th>도서명</th>
      <th>저자</th>
      <th>가격</th>
      <th>출판사</th>
   </tr>
<c:forEach items="${bookList}" var="book"> <%-- items:반복할 대상 -> controller와 list이름이 일치해야함. var: 단순한 변수이름.--%>
   <tr>
      <td>${book.bookId}</td>
      <td>${book.bookName}</td>
      <td>${book.bookAuthor}</td>
      <td>${book.bookPrice}</td>
      <td>${book.bookPublisher}</td>
   </tr>
</c:forEach>
</table>
</body>
</html>
