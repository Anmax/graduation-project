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
	<title>服务器应用监控系统--磁盘I/O</title>
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
	    $(document).ready(function() {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	    
	        var chart;
	        chart = new Highcharts.Chart({
	            chart: {
	                renderTo: 'container1',
	                type: 'spline',
	                marginRight: 10,
	                events: {
	                    load: function() {
	    
	                        // set up the updating of the chart each second
	                        var series = this.series[0];
	                        setInterval(function() {
	                            var x = (new Date()).getTime(), // current time
	                                y = Math.random();
	                            series.addPoint([x, y], true, true);
	                        }, 2000);
	                    }
	                }
	            },
	            title: {
	                text: ' C盘写入 '
	            },
	            xAxis: {
	                type: 'datetime',
	                tickPixelInterval: 150
	            },
	            yAxis: {
	                title: {
	                    text: ' 写入量  '
	                },
	                plotLines: [{
	                    value: 0,
	                    width: 10,
	                    color: '#D3D3D3'
	                }]
	            },
	            tooltip: {
	                formatter: function() {
	                        return '<b>'+ this.series.name +'</b><br/>'+
	                        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+
	                        Highcharts.numberFormat(this.y, 200);
	                }
	            },
	            legend: {
	                enabled: false
	            },
	            exporting: {
	                enabled: false
	            },
	            series: [{
	                name: ' C盘数据写入监测 ',
	                data: (function() {
	                    // generate an array of random data
	                    var data = [],
	                        time = (new Date()).getTime(),
	                        i;
	    
	                    for (i = -15; i <= 0; i++) {
	                        data.push({
	                            x: time + i * 1000,
	                            y: Math.random()
	                        });
	                    }
	                    return data;
	                })()
	            }]
	        });
	    });    
	});

	$(function () {
	    $(document).ready(function() {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	    
	        var chart;
	        chart = new Highcharts.Chart({
	            chart: {
	                renderTo: 'container2',
	                type: 'spline',
	                marginRight: 10,
	                events: {
	                    load: function() {
	    
	                        // set up the updating of the chart each second
	                        var series = this.series[0];
	                        setInterval(function() {
	                            var x = (new Date()).getTime(), // current time
	                                y = Math.random();
	                            series.addPoint([x, y], true, true);
	                        }, 2000);
	                    }
	                }
	            },
	            title: {
	                text: ' D盘写入 '
	            },
	            xAxis: {
	                type: 'datetime',
	                tickPixelInterval: 150
	            },
	            yAxis: {
	                title: {
	                    text: ' 写入量  '
	                },
	                plotLines: [{
	                    value: 0,
	                    width: 10,
	                    color: '#D3D3D3'
	                }]
	            },
	            tooltip: {
	                formatter: function() {
	                        return '<b>'+ this.series.name +'</b><br/>'+
	                        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+
	                        Highcharts.numberFormat(this.y, 2);
	                }
	            },
	            legend: {
	                enabled: false
	            },
	            exporting: {
	                enabled: false
	            },
	            series: [{
	                name: ' D盘数据写入监测 ',
	                data: (function() {
	                    // generate an array of random data
	                    var data = [],
	                        time = (new Date()).getTime(),
	                        i;
	    
	                    for (i = -15; i <= 0; i++) {
	                        data.push({
	                            x: time + i * 1000,
	                            y: Math.random()
	                        });
	                    }
	                    return data;
	                })()
	            }]
	        });
	    });    
	});


	$(function () {
	    $(document).ready(function() {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	    
	        var chart;
	        chart = new Highcharts.Chart({
	            chart: {
	                renderTo: 'container3',
	                type: 'spline',
	                marginRight: 10,
	                events: {
	                    load: function() {
	    
	                        // set up the updating of the chart each second
	                        var series = this.series[0];
	                        setInterval(function() {
	                            var x = (new Date()).getTime(), // current time
	                                y = Math.random();
	                            series.addPoint([x, y], true, true);
	                        }, 2000);
	                    }
	                }
	            },
	            title: {
	                text: ' E盘写入 '
	            },
	            xAxis: {
	                type: 'datetime',
	                tickPixelInterval: 150
	            },
	            yAxis: {
	                title: {
	                    text: ' 写入量  '
	                },
	                plotLines: [{
	                    value: 0,
	                    width: 10,
	                    color: '#D3D3D3'
	                }]
	            },
	            tooltip: {
	                formatter: function() {
	                        return '<b>'+ this.series.name +'</b><br/>'+
	                        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+
	                        Highcharts.numberFormat(this.y, 2);
	                }
	            },
	            legend: {
	                enabled: false
	            },
	            exporting: {
	                enabled: false
	            },
	            series: [{
	                name: ' E盘数据写入监测 ',
	                data: (function() {
	                    // generate an array of random data
	                    var data = [],
	                        time = (new Date()).getTime(),
	                        i;
	    
	                    for (i = -15; i <= 0; i++) {
	                        data.push({
	                            x: time + i * 1000,
	                            y: Math.random()
	                        });
	                    }
	                    return data;
	                })()
	            }]
	        });
	    });    
	});



	$(function () {
	    $(document).ready(function() {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	    
	        var chart;
	        chart = new Highcharts.Chart({
	            chart: {
	                renderTo: 'container4',
	                type: 'spline',
	                marginRight: 10,
	                events: {
	                    load: function() {
	    
	                        // set up the updating of the chart each second
	                        var series = this.series[0];
	                        setInterval(function() {
	                            var x = (new Date()).getTime(), // current time
	                                y = Math.random();
	                            series.addPoint([x, y], true, true);
	                        }, 2000);
	                    }
	                }
	            },
	            title: {
	                text: ' F盘写入 '
	            },
	            xAxis: {
	                type: 'datetime',
	                tickPixelInterval: 150
	            },
	            yAxis: {
	                title: {
	                    text: ' 写入量  '
	                },
	                plotLines: [{
	                    value: 0,
	                    width: 10,
	                    color: '#D3D3D3'
	                }]
	            },
	            tooltip: {
	                formatter: function() {
	                        return '<b>'+ this.series.name +'</b><br/>'+
	                        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+
	                        Highcharts.numberFormat(this.y, 2);
	                }
	            },
	            legend: {
	                enabled: false
	            },
	            exporting: {
	                enabled: false
	            },
	            series: [{
	                name: ' F盘数据写入监测 ',
	                data: (function() {
	                    // generate an array of random data
	                    var data = [],
	                        time = (new Date()).getTime(),
	                        i;
	    
	                    for (i = -15; i <= 0; i++) {
	                        data.push({
	                            x: time + i * 1000,
	                            y: Math.random()
	                        });
	                    }
	                    return data;
	                })()
	            }]
	        });
	    });    
	});



	$(function () {
	    $(document).ready(function() {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	    
	        var chart;
	        chart = new Highcharts.Chart({
	            chart: {
	                renderTo: 'container5',
	                type: 'spline',
	                marginRight: 10,
	                events: {
	                    load: function() {
	    
	                        // set up the updating of the chart each second
	                        var series = this.series[0];
	                        setInterval(function() {
	                            var x = (new Date()).getTime(), // current time
	                                y = Math.random();
	                            series.addPoint([x, y], true, true);
	                        }, 2000);
	                    }
	                }
	            },
	            title: {
	                text: ' G盘写入 '
	            },
	            xAxis: {
	                type: 'datetime',
	                tickPixelInterval: 150
	            },
	            yAxis: {
	                title: {
	                    text: ' 写入量  '
	                },
	                plotLines: [{
	                    value: 0,
	                    width: 10,
	                    color: '#D3D3D3'
	                }]
	            },
	            tooltip: {
	                formatter: function() {
	                        return '<b>'+ this.series.name +'</b><br/>'+
	                        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+
	                        Highcharts.numberFormat(this.y, 2);
	                }
	            },
	            legend: {
	                enabled: false
	            },
	            exporting: {
	                enabled: false
	            },
	            series: [{
	                name: ' G盘数据写入监测 ',
	                data: (function() {
	                    // generate an array of random data
	                    var data = [],
	                        time = (new Date()).getTime(),
	                        i;
	    
	                    for (i = -15; i <= 0; i++) {
	                        data.push({
	                            x: time + i * 1000,
	                            y: Math.random()
	                        });
	                    }
	                    return data;
	                })()
	            }]
	        });
	    });    
	});



	$(function () {
	    $(document).ready(function() {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	    
	        var chart;
	        chart = new Highcharts.Chart({
	            chart: {
	                renderTo: 'container6',
	                type: 'spline',
	                marginRight: 10,
	                events: {
	                    load: function() {
	    
	                        // set up the updating of the chart each second
	                        var series = this.series[0];
	                        setInterval(function() {
	                            var x = (new Date()).getTime(), // current time
	                                y = Math.random();
	                            series.addPoint([x, y], true, true);
	                        }, 2000);
	                    }
	                }
	            },
	            title: {
	                text: ' H盘写入 '
	            },
	            xAxis: {
	                type: 'datetime',
	                tickPixelInterval: 150
	            },
	            yAxis: {
	                title: {
	                    text: ' 写入量  '
	                },
	                plotLines: [{
	                    value: 0,
	                    width: 10,
	                    color: '#D3D3D3'
	                }]
	            },
	            tooltip: {
	                formatter: function() {
	                        return '<b>'+ this.series.name +'</b><br/>'+
	                        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+
	                        Highcharts.numberFormat(this.y, 2);
	                }
	            },
	            legend: {
	                enabled: false
	            },
	            exporting: {
	                enabled: false
	            },
	            series: [{
	                name: ' H盘数据写入监测 ',
	                data: (function() {
	                    // generate an array of random data
	                    var data = [],
	                        time = (new Date()).getTime(),
	                        i;
	    
	                    for (i = -15; i <= 0; i++) {
	                        data.push({
	                            x: time + i * 1000,
	                            y: Math.random()
	                        });
	                    }
	                    return data;
	                })()
	            }]
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
            <h2>磁盘I/O信息详情</h2>
			<table border="1" id="large" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
			<thead>
				<tr class="header">
				<th>设备ID</th><th>磁盘名称</th><th>单位时间读次数</th><th>单位时间写次数</th><th>采集时间</th><th>入库时间</th>
				</tr>
			</thead>
			<tbody> 
				<s:iterator value="listCpio">
				<tr>
					<td><s:property value="Sbid"/></td>
					<td><s:property value="Cpmc"/></td>
					<td><s:property value="Dcs"/></td>
					<td><s:property value="Xcs"/></td>
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
        
        
        <div class="post">
            <h2>C盘写入监测：</h2>
            <div id="container1" ></div><BR/>
            <h2>D盘写入监测：</h2>
            <div id="container2" ></div><BR/>
            <h2>E盘写入监测：</h2>
            <div id="container3" ></div><BR/>
            <h2>F盘写入监测：</h2>
            <div id="container4" ></div><BR/>
            <h2>G盘写入监测：</h2>
            <div id="container5" ></div><BR/>
            <h2>H盘写入监测：</h2>
            <div id="container6" ></div>

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
        Copyright &copy; <a href="#">2013 孟令伟</a> | Collect Form <a href="#" title="服务器应用监控系统">服务器应用监控系统</a>
    </p>
</footer>
</body>
</html>
