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

<h3>동일한 이름의 파라미터 넘겨 받기 - 메소드의 인수로 넘겨받기</h3>

<form action="<%=cp%>/user3/write" method="post">
	<p>이름 : <input type="text" name="name"> </p>
	<p>좋아하는 과목 : 
		<input type="checkbox" name="subject" value="자바">JAVA
		<input type="checkbox" name="subject" value="스프링">SPRING
		<input type="checkbox" name="subject" value="오라클">ORACLE
	</p>
	<p><button type="submit">보내기</button> </p>
</form>

</body>
</html>