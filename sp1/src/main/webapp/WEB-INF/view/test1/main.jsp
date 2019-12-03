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

<h3>@RequestMapping 예제</h3>

<p><a href="<%=cp%>/test1/main2">GET 방식</a></p>
<div>
	<form method="post" action="<%=cp%>/test1/main">
		<p><button>확인</button></p>
	</form>
</div>

<div>
	<form method="post" action="<%=cp%>/test1/main2">
		<p><button>확인</button></p>
	</form>
</div>

</body>
</html>