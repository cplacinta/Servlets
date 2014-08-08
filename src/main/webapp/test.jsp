<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Test JSP</title>
</head>
<body>
<c:choose>
    <c:when test="${empty param.name}">
        Please enter your name.
    </c:when>
    <c:otherwise>
        Hello <b><c:out value="${param.name}" /></b>!
    </c:otherwise>
</c:choose>
</html>