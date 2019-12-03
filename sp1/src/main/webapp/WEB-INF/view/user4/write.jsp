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

<h3>파라미터를 HttpServletRequest로 받기</h3>

<form action="<%=cp%>/user4/write" method="post">
	<p>이름 : <input type="text" name="name"> </p>
	<p>나이 : <input type="text" name="age"> </p>
	<p><button type="submit">보내기</button> </p>
</form>

</body>
</html>