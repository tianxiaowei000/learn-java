<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.List" %>
<%@ page import="dto.UserDto" %>

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
  <% List<UserDto> users = (List<UserDto>)request.getAttribute("users"); %>
  <%for(UserDto u : users){%>
    <tr>
	  <td><%= u.getEmail() %></td>
	  <td><%= u.getUserId() %></td>
	  <td><%= u.getPassword() %></td>
	  <td><%= u.getName() %></td>
	  <td><%= u.getNameKana() %></td>
   </tr>

	  <%-- <%= u.getName() %><br> --%>
 <%}%>
  
  

</table>




</body>
</html>