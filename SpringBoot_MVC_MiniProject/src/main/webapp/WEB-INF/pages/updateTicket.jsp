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
<h2>Update Details</h2>
<frm:form modelAttribute="update">
<label>ticketNo</label><frm:input path="ticketNo" readonly="true"/><br>
<label>custName</label><frm:input path="custName"/><br>
<label>custPhoneNo</label><frm:input path="custPhoneNo"/><br>
<label>custAdd</label><frm:input path="custAdd"/><br>
<label>startPlace</label><frm:input path="startPlace" readonly="true"/><br>
<label>endPlace</label><frm:input path="endPlace" readonly="true"/><br>
<label>travelsName</label><frm:input path="travelsName" readonly="true"/><br>
<label>amount</label><frm:input path="amount"/><br>
<input type="submit" value="Update">
</frm:form>
</body>
</html>