<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>방명록 작성</title>
	<style>
		
	</style>
</head>
<body>
	<form action="/guestbook/add" method="post">
		<div>이메일 : <input type="text" name="email"/></div>
		<div>비밀번호 : <input type="password" name="password"/></div>
		<div>
			내용 : <br>
			<textarea name="content"></textarea>
		</div>
		<input type="submit" value="확인" />
	</form>
</body>
</html>