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
<!-- semestergrade.jsp에서 href 누른 경우 -->
<!-- 해당하는 년도 , 학기의 상세보기가 나옴.  -->
<h2>상세보기</h2>
<table  align="center" border="1">
			<tr>
				<td width="100px">수강년도 </td>
				<td width="100px">학기</td>
				<td width="100px">교과코드</td>
				<td width="250px">교과목명</td>
				<td width="100px">구분</td>
				<td width="100px">학점</td>
			</tr>
			
			<c:forEach var="stdb2" items="${student2}">
			<tr>
				<td><c:out value="${stdb2.year}"></c:out></td>
				<td><c:out value="${stdb2.semester}"></c:out></td>
				<td><c:out value="${stdb2.subjectCode}"></c:out></td>
				<td><c:out value="${stdb2.subjectName}"></c:out></td>
				<td><c:out value="${stdb2.classify}"></c:out></td>
				<td><c:out value="${stdb2.credit}"></c:out></td>

			</tr>
			
			</c:forEach>
			
		</table>
</body>
</html>