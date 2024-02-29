<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>USER LOGIN</h2>

	<br>
	<br>
    <form:form action="validate" modelAttribute="user">
       

        <form:label path="e_mail">E-MAIL :</form:label>
        <form:input path="e_mail" />

        <form:label path="password">PASSWORD :</form:label>
        <form:input path="password" />


        <input type="submit" value="login">

    </form:form>
</body>
</html>