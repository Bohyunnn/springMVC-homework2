<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>이수 구분별 학점 조회</h2>

	<table align="center" border="1">
		<tr>
			<c:forEach var="total" items="${student3}">
				<td width="60px">${total.classify}</td>
			</c:forEach>
		</tr>
		<!-- classify 가져오기 -->
		<!-- classify 전부 총학점 더하기 -->
		<tr>
			<c:forEach var="total" items="${student3}">
				<td width="60px">${total.credit}</td>
			</c:forEach>
		</tr>
	</table>
</body>
</html>