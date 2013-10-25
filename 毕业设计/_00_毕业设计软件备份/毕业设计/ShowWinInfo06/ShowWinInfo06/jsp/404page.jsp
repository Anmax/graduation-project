<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<base href="<%=basePath%>"> 
<title>404</title> 
<style type="text/css"> 
.small{ font: 10px/9px verdana, arial, helvetica, sans-serif; color: #666666; }
</style> 
</head> 
<body bgcolor="#ffffff"> 
<br><br><br> 
<center><a href="#"><img src="images/notfound.gif" border="0" height="378" width="348"></a> 
<br><br><br><br> <br>
<div class="small"> 
<a href="index.jsp">Back to the index.</a> 
</div> 
</center> 
 </body>
 </html>