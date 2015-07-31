<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Ehelepola
  Date: 25/07/2015
  Time: 00:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Welcome to Spring Web MVC project</title>
</head>

<body>
<form:form action="hello" method="post" commandName="greet">


  <form:input path="msg" />
  <input type="submit" value="Submit" >

</form:form>
</body>
</html>
