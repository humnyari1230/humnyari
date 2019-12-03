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

<table>
	<tr>
		<td>이름</td>
		<td>${dto.name}</td>
	</tr>
	
	<tr>
		<td>생년월일</td>
		<td>${dto.birth}</td>
	</tr>
	
	<tr>
		<td>나이</td>
		<td>${dto.age}</td>
	</tr>
	
	<tr>
		<td>띠</td>
		<td>${dto.ddi}</td>
	</tr>
	
	<tr>
		<td>전화번호</td>
		<td>${dto.tel}</td>
	</tr>
	
	<tr>
		<td>기본급</td>
		<td>${dto.sal}</td>
	</tr>
	
	<tr>
		<td>수당</td>
		<td>${dto.bonus}</td>
	</tr>
	
	<tr>
		<td>세금</td>
		<td>${dto.tax}</td>
	</tr>
	
	<tr>
		<td>급여</td>
		<td>${dto.money}</td>
	</tr>
</table>

</body>
</html>