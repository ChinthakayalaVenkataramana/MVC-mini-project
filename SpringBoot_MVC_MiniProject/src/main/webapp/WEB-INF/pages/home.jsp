<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<h1 style="color: green">Ticket Details</h1>
<h3>${details.getCustName()}</h3>
<h3>${details.getAmount()}</h3>
<h3>${details.getCustAdd()}</h3>
<h3>${details.getCustPhoneNo()}</h3>
<h3>${details.getStartPlace()}</h3>
<h3>${details.getEndPlace()}</h3>
<h3>${details.getTicketNo()}</h3>
<h3>${details.getTravelsName()}</h3>
<a href="edit?no=${details.getTicketNo()}">edit ticket</a>
<a href="cancel?no=${details.getTicketNo()}">cancel Ticket</a>
</body>
</html>