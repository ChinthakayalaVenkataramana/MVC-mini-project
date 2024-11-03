<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<frm:form action="login" method="post">
Enter Ticket No : <input type="text" name="num"/><br>
Enter Name :<input type="text" name="name"/><br>
<input type="submit">
</frm:form>
</body>
</html>