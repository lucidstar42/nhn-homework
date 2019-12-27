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
			width: 584px;
			margin-top: 50px;
			margin-left: 150px;
		}
		.headerContainer {
			display: flex;
			justify-content: space-between;
			align-items: flex-end;
		}
		.title {
			font-size: 45px;
		}
		.writeButton {
			margin-right: 4px;
			margin-bottom: 4px;
		}
		.container {
			margin-top: 12px;
		}
		.content {
			width: 550px;
			margin-bottom: 10px;
			padding: 10px 15px;
			border: 1px solid;
			border-radius: 10px;
		}
		.info {
			display: flex;
			justify-content: space-between;
			align-items: center;
			margin-bottom: 10px;
		}
		.postEmail {
			font-size: x-large;
		}
		.postTime {
			font-size: small;
			color: #656b70;
			margin-right: 4px;
		}
		.editButton {
		}
	</style>
</head>
<body>
	<div class="main">
		<div class="headerContainer">
			<span class="title">방명록</span>
			<button class="writeButton" type="button" onclick="location.href='/guestbook/add'">글 쓰기</button>
		</div>
		<div class="container">
			<c:forEach var="post" items="${posts}">
				<fmt:parseDate pattern="yyyy-MM-dd'T'HH:mm" value="${post.createdAt}" var="parsedCreatedAt" type="both"/>
				<fmt:parseDate pattern="yyyy-MM-dd'T'HH:mm" value="${post.modifiedAt}" var="parsedModifiedAt" type="both"/>
				<div class="content">
					<div class="info">
						<span class="postEmail">${post.email}</span>
						<div>
							<span class="postTime">
								작성 <fmt:formatDate pattern="yy.MM.dd HH:mm" value="${parsedCreatedAt}" type="both" /> ·
								수정 <fmt:formatDate pattern="yy.MM.dd HH:mm" value="${parsedModifiedAt}" type="both" />
							</span>
							<button class="editButton" type="button" onclick="location.href='/guestbook/edit/${post.id}'">수정</button>
						</div>
					</div>
					
					<pre class="postContent">${post.content}</pre>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>