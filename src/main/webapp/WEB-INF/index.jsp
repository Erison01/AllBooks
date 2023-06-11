<%--
  Created by IntelliJ IDEA.
  User: Dell Latitude E7450
  Date: 6/11/2023
  Time: 12:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
  <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<h1>All Books</h1>
<body>

<table class="table table-striped">
<thead>
<tr>
    <th>Id</th>
    <th>Title</th>
    <th>Language</th>
    <th>#Pages</th>
</tr>

</thead>
    <tbody>
<c:forEach items="${allBooks}" var="book">
    <tr>
        <td><c:out value="${book.id}"/></td>
        <td><a href="/bookDetails/${book.id}"/>${book.title} </td>
        <td><c:out value="${book.language}"/></td>
        <td><c:out value="${book.numOfPages}"/></td>
    </tr>
</c:forEach>
    </tbody>

</table>
</body>
</html>
