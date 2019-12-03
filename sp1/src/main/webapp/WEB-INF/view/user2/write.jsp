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

<h3>파라미터 전달방법 - 1 : 메소드의 인수로 파라미터 값 받기</h3>

<form action="<%=cp%>/user2/calc" method="post">
	<p><input type="text" name="num1" placeholder="숫자 입력">	
		<select name="operator">
			<option value="+">더하기</option>
			<option value="-">빼기</option>
			<option value="*">곱하기</option>
			<option value="/">나누기</option>
		</select>
		<input type="text" name="num2" placeholder="숫자 입력">
		<button type="submit">결과</button>
	</p>
</form>

</body>
</html>