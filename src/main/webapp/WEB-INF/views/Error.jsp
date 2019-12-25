<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Refresh" content="1;url=/guestbook">
	<title>오류</title>
</head>

<!-- Error Code

Add Post
001 : 이메일 미입력
002 : 이메일 형식 오류
003 : 비밀번호 미입력
004 : 내용 미입력

Edit Post
011 : 비밀번호 오류
012 : 내용 미입력

 -->

<body>
	<c:choose>
		<c:when test="${code eq '001'}"><script>alert("이메일을 입력해주세요")</script></c:when>
		<c:when test="${code eq '002'}"><script>alert("이메일 형식을 확인해주세요")</script></c:when>
		<c:when test="${code eq '003'}"><script>alert("비밀번호를 입력해주세요")</script></c:when>
		<c:when test="${code eq '004'}"><script>alert("내용을 입력해주세요")</script></c:when>
		
		<c:when test="${code eq '011'}"><script>alert("비밀번호를 확인해주세요")</script></c:when>
		<c:when test="${code eq '012'}"><script>alert("내용을 입력해주세요")</script></c:when>
	</c:choose>
</body>
</html>