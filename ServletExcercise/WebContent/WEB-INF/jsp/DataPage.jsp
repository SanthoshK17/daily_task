<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page language="java" import="java.util.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student details from database</title>
</head>
<body>
<body> 
<table border="1" width="303">
<tr>
<td width="119"><b>ID</b></td>
<td width="168"><b>Name</b></td>
<td width="168"><b>Contact</b></td>
</tr>

<%Iterator itr;%>
<% List data= (List)request.getAttribute("data");
for (itr=data.iterator(); itr.hasNext(); )
{
%>
<tr>
<td width="119"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
</tr>
<%}%>
</table>

</body>
</html>