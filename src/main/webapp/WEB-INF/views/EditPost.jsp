<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>방명록 수정</title>
	<style>
		
	</style>
	<script>
		function check(){
			if(!document.getElementById("password").value){
				alert("비밀번호를 입력해주세요")
				return false
			}
			
			if(!document.getElementById("content").value){
				alert("내용을 입력해주세요")
				return false
			}
			
			return true
		}
	</script>
</head>
<body>
	<form action="/guestbook/edit" method="post" onsubmit="return check()">
		<div>
			<input type="hidden" name="id" value="${post.id}" />
		</div>
		<div>이메일 : <input type="text" name="email" value="${post.email}" readonly/></div>
		<div>비밀번호 : <input type="password" name="password" id="password"/></div>
		<div>
			내용 : <br>
			<textarea name="content" id="content">${post.content}</textarea>
		</div>
		<input type="submit" value="수정" />
	</form>
</body>
</html>