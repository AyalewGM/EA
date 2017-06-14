<%-- 
    Document   : bookList
    Created on : Jun 13, 2017, 5:58:06 AM
    Author     : Ayu
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Current books </title>
</head>
<body>
	<h1>My Books </h1>
	<table>
	<c:forEach var="book" items="${books}">
	<tr>
		<td>${car.title}</td>
		<td>${car.iSBN}</td>
		<td>${car.author}</td>
		<td>${car.price}</td>
		<td><a href="books/${book.id}">edit</a></td>
	</tr>
	</c:forEach>
	</table>
	
	<a href="addBook.html"> Add a book</a>
</body>
</html>