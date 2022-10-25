
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
<%-- 책 제목을 클릭하면 /book 이라는 주소로 클릭한 책의 bookId를 전달
     ex:/book?bookId=1

     /book 주소를 처리하는 Controller 메서드 정의
     findBook.jsp에 해당 책 정보 출력
     --%>
<c:forEach items="${bookList}" var="book"> <%-- items:반복할 대상 -> controller와 list이름이 일치해야함. var: 단순한 변수이름.--%>
   <tr>
      <td>${book.bookId}</td>
      <td>
   <%-- bookId는 계속해서 변화하는 값이기 때문에 주소에서 ${book.bookId로}설정  --%>
         <a href="/book?bookId=${book.bookId}">${book.bookName}</a>
      </td>
      <td>
         ${book.bookAuthor}
      </td>
      <td>
         ${book.bookPrice}
      </td>
      <td>
         ${book.bookPublisher}
      </td>
   </tr>
</c:forEach>
</table>
</body>
</html>
