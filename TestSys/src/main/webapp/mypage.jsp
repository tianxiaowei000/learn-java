<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserInfo</title>
</head>
<body>
	<form action="./userchangelist" method="post">
	<h1>UserInfo</h1>
	<p>
		Email<input type="text" name="email" value="${email}">
	</p>
	<p>
		UserID<input type="text" name="userId" value="${userId}">
	</p>
	<p>
		Password<input type="text" name="password" value="${password}">
	</p>
	<p>
		UserName<input type="text" name="name" value="${name}">
	</p>
	<p>
		NameKana<input type="text" name="nameKana" value="${nameKana}">
	</p>
	<button type="submit">change</button>
	</form>
</body>
</html>