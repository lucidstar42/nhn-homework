<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>방명록 목록</title>
</head>
<body>
	<h1>방명록</h1>
	<c:forEach var="post" items="${posts}">
		<table>
			<tr>
				<td>${post.email}</td>
				<td>${post.createdAt}</td>
				<td>${post.modifiedAt}</td>
			</tr>
			<tr>
				<td colspan="3">${post.content}</td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>