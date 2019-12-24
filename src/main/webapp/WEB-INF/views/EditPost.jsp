<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>방명록 수정</title>
	<style>
		
	</style>
</head>
<body>
	<form action="/guestbook/edit" method="post">
		<div>
			<input type="hidden" name="id" value="${post.id}" />
		</div>
		<div>이메일 : <input type="text" name="email" value="${post.email}" readonly/></div>
		<div>비밀번호 : <input type="password" name="check_password"/></div>
		<div>
			내용 : <br>
			<textarea name="content">${post.content}</textarea>
		</div>
		<input type="submit" value="수정" />
	</form>
</body>
</html>