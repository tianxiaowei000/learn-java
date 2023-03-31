<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>list</head>

<body>
<table>
  <tr>
    <th>email</th>
    <th>userId</th>
    <th>password</th>
    <th>name</th>
    <th>nameKana</th>
    
  </tr>
<c:forEach var="user" items="${userinfo}">
  <tr>
    <td>${user.email}</td>
    <td>${user.userId}</td>
    <td>${user.password}</td>
    <td>${user.name}</td>
    <td>${user.nameKana}</td>
  </tr>
</c:forEach>

</table>
<br/>



</body>
</html>