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
<h2>USER REGISTRATION</h2>

	<br>
	<br>
    <form:form action="save" modelAttribute="user">
        <form:label path="name">NAME :</form:label>
        <form:input path="name" />

        <form:label path="e_mail">E-MAIL :</form:label>
        <form:input path="e_mail" />

        <form:label path="password">PASSWORD :</form:label>
        <form:input path="password" />
        
          <form:label path="phone_number">PHONE NUMBER :</form:label>
        <form:input path="phone_number" />

        <input type="submit" value="REGISTER">

    </form:form>
</body>
</html>