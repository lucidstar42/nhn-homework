<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>방명록 작성</title>
	<style>
		
	</style>
	<script>
		function check(){
			var pattern = /.+@.+[.].+/
			
			if(!document.getElementById("email").value){
				alert("이메일을 입력해주세요")
				return false
			}
			
			if(!document.getElementById("email").value.match(pattern)){
				alert("이메일 형식을 확인해주세요")
				return false
			}
			
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
	<form action="/guestbook/add" method="post" onsubmit="return check()">
		<div>이메일 : <input type="text" name="email" id="email"/></div>
		<div>비밀번호 : <input type="password" name="password" id="password"/></div>
		<div>
			내용 : <br>
			<textarea name="content" id="content"></textarea>
		</div>
		<input type="submit" value="확인" />
	</form>
</body>
</html>