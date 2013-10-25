<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>"> 
<title>服务器应用监控系统</title>
<link href="css/styles.css" rel="stylesheet" type="text/css">
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
	<h1><a href="index.jsp"><em>服务器应用监控系统</em></a></h1>
	    <div class="contentBody">
    	<div class="post">
            <h2>系统简介</h2>
            <p>
                                  随着企业计算的增长导致了基于服务器的大型应用程序的激增，而这些应用程序中有许多都是部署在软件和
                                 硬件组件的复杂混合环境中，由此产生的性能监控模型和相关技术已成为当前企业应用管理所面临的热点问题之一。
                                 越来越多的应用程序依赖于应用服务器，应用服务器性能监控和性能分析的工作越显重要，并成为网络管理领域研究的一个热点方向。
            </p>
            <p>                     
                                本系统由两部分组成，分别为采集部分和显示部分，为多目标服务器监控系统。
                                监控程序部分负责采集服务器当前状态信息，并利用socket通信发送到指定数据库进行存储。
                                显示程序部分负责检索指定数据库，并在页面上以列表和图形的方式直观的进行显示。                                  
            </p>
            <img src="images/pic1.jpg" alt="pic1">
        </div>
        <div class="post">
            <h2>应用技术</h2>
            <li><em>开发语言：Java，Jsp</em></li>
            <li><em>使用框架：sigar，jquery，struts2</em></li>
            <li><em>软件平台：Windows 7 Professional </em></li>
            <li><em>硬件平台：Intel(R)Core(TM)2Duo CPU T6670 @ 2.20GHz 2.20GHz</em></li>
            <li><em>开发工具：Myeclipse 8.5<em/></li>
            <li><em>数据库☆：MySQL</em></li>
            <img src="images/pic2.jpg" alt="pic2">
        </div>

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
