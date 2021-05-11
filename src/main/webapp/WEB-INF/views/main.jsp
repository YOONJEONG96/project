<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<input type="text" id="mId" name="mId" placeholder="아이디를 입력하세요">
		<input type="password" id="mPw" name="mPw" placeholder="비밀번호를 입력하세요">
		<button value="LOGIN" id="btn" onclick="login(this)">로그인</button>
</body>
</html>
<script>
	var form = document.createElement("form");

	var mId = document.getElementById("mId");
	var mPw = document.getElementById("mPw");

	alert(mId.value + ":" + mPw.value);

	form.action = "LOGIN";
	form.method = "post";

	document.body.appendChild(form);

	form.appendChild(mId);
	form.appendChild(mPw);
	form.appendChild(btn);
</script>