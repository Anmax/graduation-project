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
	<title>服务器应用监控系统--文件存储</title>
	<link href="css/styles.css" rel="stylesheet" type="text/css">
    <link href="css/jquery.tablesorter.pager.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="css/default.css" type="text/css" media="screen" title="Flora (Default)">
    <script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <script src="js/jquery.tablesorter.js" type="text/javascript"></script>
    <script src="js/jquery.tablesorter.pager.js" type="text/javascript"></script>
    <script src="js/highcharts/exporting.js" type="text/javascript"></script>
    <script src="js/highcharts/highcharts.js" type="text/javascript"></script>
	<script type="text/javascript">
	$(function() {
		$("table")
			.tablesorter({debug: true, widgets: ['zebra']})
			.tablesorterPager({container: $("#pager")});
	});

	$(function () {
	    var chart;
	    $(document).ready(function() {
	    
	        var colors = Highcharts.getOptions().colors,
	            categories = ['C', 'D', 'E', 'F', 'G' ,'H'],
	            name = 'Browser brands',
	            data = [{
	                    y: 55.11,
	                    color: colors[0],
	                    drilldown: {
	                        name: 'MSIE versions',
	                        categories: ['MSIE 6.0', 'MSIE 7.0', 'MSIE 8.0', 'MSIE 9.0'],
	                        data: [10.85, 7.35, 33.06, 2.81],
	                        color: colors[0]
	                    }
	                }, {
	                    y: 21.63,
	                    color: colors[1],
	                    drilldown: {
	                        name: 'Firefox versions',
	                        categories: ['Firefox 2.0', 'Firefox 3.0', 'Firefox 3.5', 'Firefox 3.6', 'Firefox 4.0'],
	                        data: [0.20, 0.83, 1.58, 13.12, 5.43],
	                        color: colors[1]
	                    }
	                }, {
	                    y: 11.94,
	                    color: colors[2],
	                    drilldown: {
	                        name: 'Chrome versions',
	                        categories: ['Chrome 5.0', 'Chrome 6.0', 'Chrome 7.0', 'Chrome 8.0', 'Chrome 9.0',
	                            'Chrome 10.0', 'Chrome 11.0', 'Chrome 12.0'],
	                        data: [0.12, 0.19, 0.12, 0.36, 0.32, 9.91, 0.50, 0.22],
	                        color: colors[2]
	                    }
	                }, {
	                    y: 7.15,
	                    color: colors[3],
	                    drilldown: {
	                        name: 'Safari versions',
	                        categories: ['Safari 5.0', 'Safari 4.0', 'Safari Win 5.0', 'Safari 4.1', 'Safari/Maxthon',
	                            'Safari 3.1', 'Safari 4.1'],
	                        data: [4.55, 1.42, 0.23, 0.21, 0.20, 0.19, 0.14],
	                        color: colors[3]
	                    }
	                }, {
	                    y: 2.14,
	                    color: colors[4],
	                    drilldown: {
	                        name: 'Opera versions',
	                        categories: ['Opera 9.x', 'Opera 10.x', 'Opera 11.x'],
	                        data: [ 0.12, 0.37, 1.65],
	                        color: colors[4]
	                    }
	                }];
	    
	        function setChart(name, categories, data, color) {
				chart.xAxis[0].setCategories(categories, false);
				chart.series[0].remove(false);
				chart.addSeries({
					name: name,
					data: data,
					color: color || 'white'
				}, false);
				chart.redraw();
	        }
	    
	        chart = new Highcharts.Chart({
	            chart: {
	                renderTo: 'container',
	                type: 'column'
	            },
	            title: {
	                text: '文件存储信息详情：'
	            },
	            xAxis: {
	                categories: categories
	            },
	            yAxis: {
	                title: {
	                    text: '空间 '
	                }
	            },
	            plotOptions: {
	                column: {
	                    cursor: 'pointer',
	                    point: {
	                        events: {
	                            click: function() {
	                                var drilldown = this.drilldown;
	                                if (drilldown) { // drill down
	                                    setChart(drilldown.name, drilldown.categories, drilldown.data, drilldown.color);
	                                } else { // restore
	                                    setChart(name, categories, data);
	                                }
	                            }
	                        }
	                    },
	                    dataLabels: {
	                        enabled: true,
	                        color: colors[0],
	                        style: {
	                            fontWeight: 'bold'
	                        },
	                        formatter: function() {
	                            return this.y +'%';
	                        }
	                    }
	                }
	            },
	            tooltip: {
	                formatter: function() {
	                    var point = this.point,
	                        s = this.x +':<b>'+ this.y +'% market share</b><br/>';
	                    if (point.drilldown) {
	                        s += 'Click to view '+ point.category +' versions';
	                    } else {
	                        s += 'Click to return to browser brands';
	                    }
	                    return s;
	                }
	            },
	            series: [{
	                name: name,
	                data: data,
	                color: 'white'
	            }],
	            exporting: {
	                enabled: false
	            }
	        });
	    });
	    
	});
	</script>	
</head>
<body>
<header>
    <nav>
        <ul>
            <li class="active"><a href="">设备数据采集</a></li>
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
            <h2>文件存储信息详情：</h2>
			<table border="1" id="large" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
			<thead>
				<tr class="header">
				<th>设备ID</th><th>类别</th><th>文件存储目录</th><th>文件大小(M)</th><th>采集时间</th><th>入库时间</th>
				</tr>
			</thead>
			<tbody> 
				<s:iterator value="listWjcc">
				<tr>
					<td><s:property value="Sbid"/></td>
					<td><s:property value="Lb"/></td>
					<td><s:property value="Wjccml"/></td>
					<td><s:property value="Wjdx"/></td>
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
        </div><br><br>
        
        <div id="container" style="min-width: 400px; height: 400px; margin: 0 auto"  class="post"></div>
        
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
        Copyright &copy; <a href="#">2013 孟令伟</a> | Collect Form <a href="#" title="服务器应用监控系统">服务器应用监控系统</a>
    </p>
</footer>
</body>
</html>
