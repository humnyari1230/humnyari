<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String cp=request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p><a href="<%=cp%>/demo3/header">헤더 확인</a></p>
<p><a href="<%=cp%>/demo3/cookieSet">쿠키 설정</a></p>
<p><a href="<%=cp%>/demo3/cookieGet">쿠키 확인</a></p>

<p>
	${msg}
</p>

</body>
</html>