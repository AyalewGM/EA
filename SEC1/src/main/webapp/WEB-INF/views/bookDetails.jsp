<%-- 
    Document   : bookDetails
    Created on : Jun 13, 2017, 6:14:08 AM
    Author     : Ayu
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a book</title>
</head>
<body>
	<form action="../books/${book.id}" method="post">
	<table>
		<tr>
			<td>Title:</td>
			<td><input type="text" name="title" value="${book.title}" /> </td>
		</tr>
		<tr>
			<td>iSBN:</td>
			<td><input type="text" name="iSBN" value="${book.iSBN}" /> </td>
		</tr>
		<tr>
			<td>Author:</td>
			<td><input type="text" name="author" value="${book.author}" /> </td>
		</tr>
		<tr>
			<td>Price:</td>
			<td><input type="text" name="price" value="${book.price}" /> </td>
		</tr>
	</table>
	<input type="submit" value="update"/>
	</form>
	<form action="delete?bookId=${book.id}" method="post">
		<button type="submit">Delete</button>
	</form>
</body>
</html>