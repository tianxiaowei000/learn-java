<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="dto.UserDto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー編集</title>
</head>
<body>
	<h1>ユーザー編集</h1>
	<% String email = request.getParameter("email"); %>
	<% String userId = request.getParameter("userId"); %>
	<% String password = request.getParameter("password"); %>
	<% String name = request.getParameter("name"); %>
	<% String nameKana = request.getParameter("nameKana"); %>

 <form name="Regist1Form" method="post" action="./userchange" autocomplete="off">
		<label for="email">email:</label> <input type="text"
			id="email" name="email" value="<%= email %>">
			<br>
		<br> <label for="userId">id:</label> <input type="text" id="userId" name="userId"
			value="<%= userId %>"><br>
		<br> <label for="password">pwd:</label> <input type="text"
			id="password" name="password" value="<%= password %>"><br>
		<br> <label for="name">name:</label> <input type="text"
			id="name" name="name" value="<%= name %>"><br>
		<br> <label for="nameKana">namekana:</label> <input type="text"
			id="nameKana" name="nameKana" value="<%= nameKana %>"><br>
		<br>
		      
		<input type="submit" value="up">
	</form>

</body>
</html>