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

<form action="<%=cp%>/insa/request" method="post">
<table>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name"></td>
	</tr>
	
	<tr>
		<td>생년월일</td>
		<td><input type="text" name="birth"></td>
	</tr>
	
	<tr>
		<td>전화번호</td>
		<td><input type="text" name="tel"></td>
	</tr>
	
	<tr>
		<td>기본급</td>
		<td><input type="text" name="sal"></td>
	</tr>
	
	<tr>
		<td>수당</td>
		<td><input type="text" name="bonus"></td>
	</tr>
	<tr>
		<td align="center"><button type="submit">등록하기</button> </td>
	</tr>
</table>
</form>


</body>
</html>