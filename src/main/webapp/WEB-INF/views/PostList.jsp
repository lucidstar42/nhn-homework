<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>방명록 목록</title>
	<style>
		.po {
			margin-bottom: 10px;
		}
	</style>
</head>
<body>
	<h1>방명록</h1>
	<a href="/guestbook/add">글 쓰기</a>
	<c:forEach var="post" items="${posts}">
		<div class="po">
			<div>이메일 : ${post.email}</div>
			<div>작성시간 : ${post.createdAt}</div>
			<div>수정시간 : ${post.modifiedAt}</div>
			<div>내용 : ${post.content}</div>
		</div>
	</c:forEach>
</body>
</html>