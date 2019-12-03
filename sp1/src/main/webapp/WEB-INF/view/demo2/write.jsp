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

<form action="<%=cp%>/demo2/request" method="post">
	<p>이름 : <input type="text" name="name"> </p>
	<p>취미 : 
		<label><input type="checkbox" name="hobby" value="영화">영화</label>
		<label><input type="checkbox" name="hobby" value="게임">게임</label>
		<label><input type="checkbox" name="hobby" value="운동">운동</label>
		<label><input type="checkbox" name="hobby" value="음악">음악</label>
	</p>
	<p><button>등록하기</button></p>
</form>

</body>
</html>