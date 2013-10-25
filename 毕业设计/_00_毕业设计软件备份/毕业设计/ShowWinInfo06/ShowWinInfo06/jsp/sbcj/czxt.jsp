<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>"> 
    <title>服务器应用监控系统--操作系统</title>
    <link href="css/styles.css" rel="stylesheet" type="text/css">
    <link href="css/jquery.tablesorter.pager.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="css/default.css" type="text/css" media="screen" title="Flora (Default)">
    <script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <script src="js/jquery.tablesorter.js" type="text/javascript"></script>
    <script src="js/jquery.tablesorter.pager.js" type="text/javascript"></script>
	<script type="text/javascript">
	$(function() {
		$("table")
			.tablesorter({debug: true, widgets: ['zebra']})
			.tablesorterPager({container: $("#pager")});
	});
	</script>
</head>
<body>
<header>
    <nav>
        <ul>
            <li class="active"><a href="index.jsp">设备数据采集</a></li>
            <li><a href="">拓扑图</a></li>
            <li><a href="">数据统计</a></li>
            <li><a href="">中间件数据采集</a></li>
            <li><a href="">警告数据</a></li>
        </ul>
    </nav>    
</header>
<div class="wrapper">
	<h1><a href=""><em>服务器应用监控系统</em></a></h1>
	    <div class="contentBody">
    	<div class="post">
            <h2>操作系统信息详情：</h2>
			<table border="1" id="large" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
			<thead>
				<tr class="header">
				<th>设备ID</th><th>主机名称</th><th>操作系统版本</th><th>操作系统内核</th><th>开机时间</th><th>当前时间</th><th>是否只读</th><th>采集时间</th><th>入库时间</th>
				</tr>
			</thead>
			<tbody> 
				<s:iterator value="listCzxt">
				<tr>
					<td><s:property value="Sbid"/></td>
					<td><s:property value="Zjmc"/></td>
					<td><s:property value="Czxtbb"/></td>
					<td><s:property value="Czxtnh"/></td>
					<td><s:property value="Kjsj"/></td>
					<td><s:property value="Dqsj"/></td>
					<td><s:property value="Sfwjzd"/></td>
					<td><s:property value="Cjsj"/></td>
					<td><s:property value="Rksj"/></td>
				</tr>
				</s:iterator>
			</tbody>
			</table>
			<div id="pager" class="pager">
			<form>
				<img src="images/pager/icons/first.png" class="first"/>
				<img src="images/pager/icons/prev.png" class="prev"/>
				<input type="text" class="pagedisplay"/>
				<img src="images/pager/icons/next.png" class="next"/>
				<img src="images/pager/icons/last.png" class="last"/>
				<select class="pagesize">
				    <option selected="selected" value="10">10</option>
					<option value="15">15</option>
					<option value="20">20</option>
					<option value="30">30</option>
					<option value="40">40</option>
				</select>
			</form>
		    </div> 
        </div>
        <br><br>
    </div>
	
    <div class="sidebar">
        <div class="sBlock" id="sBlock">
        	<h2>设备数据采集</h2>
            <ul>
            	<li><a href="showInfo!listCzxt.action"  >操作系统</a></li>
                <li><a href="showInfo!listWjcc.action"  >文件存储</a></li>
                <li><a href="showInfo!listCpu_nc.action">CPU_内存</a></li>
                <li><a href="showInfo!listCpio.action"  >磁盘  I/O</a></li>
                <li><a href="showInfo!listWkll.action"  >网卡流量</a></li>
                <li><a href="showInfo!listDlyh.action"  >登录用户</a></li>
                <li><a href="showInfo!listYhcz.action"  >用户操作</a></li>
                <li><a href="showInfo!listZtzj.action"  >状态总结</a></li>
            </ul>
        </div>
        <div class="sBlock">
        	<h2>应用监控系统</h2>
            <ul>
            	<li><a href="">设备数据采集</a></li>
                <li><a href="">服务器拓扑图</a></li>
                <li><a href="">程序数据统计</a></li>
                <li><a href="">中间件统计图</a></li>
                <li><a href="">告警数据相关</a></li>
                <li><a href="">监控程序状态</a></li>
                <li><a href="">用户相关统计</a></li>
            </ul>
        </div>
    </div> 
    <div class="clearfloat"></div>
</div>
<footer>
    <p class="copyright">
        Copyright &copy; <a href="index.jsp">2013 孟令伟</a> | Collect Form <a href="index.jsp" title="服务器应用监控系统">服务器应用监控系统</a>
    </p>
</footer>
</body>
</html>
