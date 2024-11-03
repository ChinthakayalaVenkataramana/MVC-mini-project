<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body style="text-align: center;"> 
<h2>Ticket Registration</h2>
<frm:form modelAttribute="ticket">
<label>Enter Name:</label><frm:input path="custName"></frm:input><br>
<label>Phone No:</label><frm:input path="custPhoneNo"></frm:input><br>
<label>Address :</label><frm:input path="custAdd"></frm:input><br>
<label>Start Place :</label><frm:input path="startPlace"></frm:input><br>
<label>End Place :</label><frm:input path="endPlace"></frm:input><br>
<label>Amount :</label><frm:input path="amount"></frm:input><br>
<label>Select Travel Name :</label><frm:select path="travelsName" cssClass="width:70px">
<frm:option value="Jagan">Jagan</frm:option>
<frm:option value="Orange">Orange</frm:option>
<frm:option value="Muneer">Muneer</frm:option>
<frm:option value="Deepna">Deepna</frm:option>
<frm:option value="Kaveri">Kaveri</frm:option>
<frm:option value="Vandana">Vandana</frm:option>
<frm:option value="K.K.R">K.K.R</frm:option>
<frm:option value="R.K">R.k</frm:option>
<frm:option value="Amaravathi">Amaravathi</frm:option>
</frm:select><br>
<input style="width: 70px" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input style="width: 70px" type="reset">
</frm:form>
</body>
</html>