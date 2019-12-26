<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>방명록 목록</title>
	<style>
		.main {
			width: 80%;
			margin: auto auto;
		}
		.container {
			margin-top: 25px;
		}
		.content {
			width: 40%;
			margin-bottom: 10px;
			padding: 15px;
			border: 1px solid;
			border-radius: 15px;
		}
	</style>
</head>
<body>
	<div class="main">
		<h1 class="title">방명록</h1>
		<a href="/guestbook/add" class="write">글 쓰기</a>
		<div class="container">
			<c:forEach var="post" items="${posts}">
				<div class="content">
					<div>이메일 : ${post.email}</div>
					<fmt:parseDate pattern="yyyy-MM-dd'T'HH:mm:ss" value="${post.createdAt}" var="parsedCreatedAt" type="both"/>
					<div>작성시간 : <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${parsedCreatedAt}" type="both" /></div>
					<fmt:parseDate pattern="yyyy-MM-dd'T'HH:mm:ss" value="${post.modifiedAt}" var="parsedModifiedAt" type="both"/>
					<div>수정시간 : <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${parsedModifiedAt}" type="both" /></div>
					<div>내용 : ${post.content}</div>
					<a href="/guestbook/edit/${post.id}">수정하기</a>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>