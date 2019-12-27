<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>방명록 수정</title>
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
		.form {
			width: 550px;
			margin-top: 12px;
			padding-top: 25px;
			padding-left: 25px;
			padding-bottom: 25px;
			border: 1px solid;
			border-radius: 10px;
		}
		.formLabel {
			display: block;
			margin: 0px 0px 4px 0px;
		}
		.formLabel > span {
			font-weight: bold;
			font-size: large;
		}
		.formInput {
			width: 180px;
			border: none;
  			border-bottom: 1px solid #000;
  			margin-bottom: 18px;
  			font-size: large;
		}
		.formTextarea {
			margin-bottom: 20px;
		}
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
	<div class="main">
		<div class="headerContainer">
			<span class="title">방명록 수정</span>
		</div>
		<form class="form" action="/guestbook/edit" method="post" onsubmit="return check()">
			<div>
				<input type="hidden" name="id" value="${post.id}" />
			</div>
			<div>
				<label class="formLabel" for="email"><span>이메일</span></label>
				<input class="formInput" type="text" name="email" id="email" value="${post.email}" readonly/>
			</div>
			<div>
				<label class="formLabel" for="password"><span>비밀번호</span></label>
				<input class="formInput" type="password" name="password" id="password"/>
			</div>
			<div>
				<label class="formLabel" for="content"><span>내용</span></label>
				<textarea class="formTextarea" cols="60" rows="10" name="content" id="content">${post.content}</textarea>
			</div>
			<input type="submit" value="수정" />
		</form>
	</div>
</body>
</html>