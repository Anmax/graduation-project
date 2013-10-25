# Host: localhost  (Version: 5.5.28)
# Date: 2013-02-28 14:40:55
# Generator: MySQL-Front 5.3  (Build 1.0)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;

CREATE DATABASE `mysql01` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mysql01`;

#
# Source for table "sbcj_cpio"
#

CREATE TABLE `sbcj_cpio` (
  `Sbid` int(11) NOT NULL DEFAULT '0' COMMENT '设备ID',
  `Cpmc` varchar(200) DEFAULT '' COMMENT '磁盘名称',
  `Dcs` float(10,2) DEFAULT '0.00' COMMENT '单位时间读次数',
  `Xcs` float(10,2) DEFAULT '0.00' COMMENT '单位时间写次数',
  `Cjsj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '采集时间',
  `Rksj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '入库时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备数据采集——磁盘I/O';

#
# Source for table "sbcj_cpu_nc"
#

CREATE TABLE `sbcj_cpu_nc` (
  `Sbid` int(10) NOT NULL DEFAULT '0' COMMENT '设备ID',
  `Gs` int(5) DEFAULT '0' COMMENT 'CPU个数',
  `Zp` varchar(100) DEFAULT '' COMMENT 'CPU主频',
  `Cpu_Syl` double(10,2) DEFAULT '0.00' COMMENT 'CPU使用率',
  `Zl` float(10,2) DEFAULT '0.00' COMMENT '内存总量',
  `Sysl` float(10,2) DEFAULT '0.00' COMMENT '内存使用数量',
  `Ncsy` float(10,2) DEFAULT '0.00' COMMENT '内存剩余量',
  `Nc_Syl` float(10,4) DEFAULT '0.0000' COMMENT '内存使用率',
  `Cjsj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '采集时间',
  `Rksj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '入库时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='CPU主频：GHz;  Syl：如90%，则填写90;  内存总量、内存使用数量、内存剩余量：单位M。';

#
# Source for table "sbcj_czxt"
#

CREATE TABLE `sbcj_czxt` (
  `Sbid` int(10) NOT NULL DEFAULT '0' COMMENT '设备ID',
  `Zjmc` varchar(200) DEFAULT NULL COMMENT '主机名称',
  `Czxtbb` varchar(200) DEFAULT NULL COMMENT '操作系统版本',
  `Czxtnh` varchar(200) DEFAULT NULL COMMENT '操作系统内核',
  `Kjsj` datetime DEFAULT NULL COMMENT '开机时间',
  `Dqsj` datetime DEFAULT NULL COMMENT '当前时间',
  `Sfwjzd` int(1) DEFAULT '0' COMMENT '是否文件只读(1-只读;0-可读写)',
  `Cjsj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '采集时间',
  `Rksj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '入库时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

#
# Source for table "sbcj_dlyh"
#

CREATE TABLE `sbcj_dlyh` (
  `Sbid` int(10) NOT NULL DEFAULT '0' COMMENT '设备ID',
  `Yhm` varchar(100) DEFAULT 'admin' COMMENT '登录用户名',
  `Sj` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '登录时间',
  `IP` varchar(20) DEFAULT '0.0.0.0' COMMENT '客户端IP',
  `Cjsj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '采集时间',
  `Rksj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '入库时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备数据采集——登录用户      IP：IP格式串，例如10.236.0.1，客户端直接显示即可。';

#
# Source for table "sbcj_wjcc"
#

CREATE TABLE `sbcj_wjcc` (
  `Sbid` int(10) NOT NULL DEFAULT '0' COMMENT '设备ID',
  `Lb` varchar(200) NOT NULL DEFAULT '' COMMENT '类别',
  `Wjccml` varchar(200) NOT NULL DEFAULT '' COMMENT '文件存储目录',
  `Wjdx` bigint(20) NOT NULL DEFAULT '0' COMMENT '文件大小',
  `Cjsj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '采集时间',
  `Rksj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '入库时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Wjdx: 单位MB。';

#
# Source for table "sbcj_wkll"
#

CREATE TABLE `sbcj_wkll` (
  `Sbid` int(10) NOT NULL DEFAULT '0' COMMENT '设备ID',
  `Wkmc` varchar(100) DEFAULT NULL COMMENT '网卡名称',
  `IP` varchar(20) DEFAULT NULL COMMENT 'IP地址',
  `Lrl` bigint(20) DEFAULT '0' COMMENT '单位时间流入量',
  `Srdbs` int(10) DEFAULT '0' COMMENT '单位时间输入丢包数',
  `Srcbs` int(10) DEFAULT '0' COMMENT '单位时间输入错包数',
  `Lcl` bigint(20) DEFAULT '0' COMMENT '单位时间流出量',
  `Scdbs` int(10) DEFAULT '0' COMMENT '单位时间输出丢包数',
  `Sccbs` int(10) DEFAULT '0' COMMENT '单位时间输出错包数',
  `Cjsj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '采集时间',
  `Rksj` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '入库时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备数据采集——网卡流量       Syl：例如1.45%，填写1.45。流入量、流出量：单位Byte。';

#
# Source for table "sbcj_yhcz"
#

CREATE TABLE `sbcj_yhcz` (
  `Sbid` int(10) NOT NULL DEFAULT '0' COMMENT '设备ID',
  `Yhm` varchar(100) DEFAULT NULL COMMENT '登录用户名',
  `Dlsj` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '登录时间',
  `IP` varchar(20) DEFAULT '' COMMENT '客户端IP',
  `Ml` varchar(1024) DEFAULT '' COMMENT '操作命令',
  `Tcsj` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '退出时间',
  `Cjsj` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '采集时间',
  `Rksj` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '入库时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备数据采集——用户操作;   IP：IP格式串，例如10.236.0.1，客户端直接显示即可。';

#
# Source for table "sbcj_ztzj"
#

CREATE TABLE `sbcj_ztzj` (
  `Sbid` int(10) NOT NULL DEFAULT '0' COMMENT '设备ID',
  `Zjmc` varchar(200) DEFAULT NULL COMMENT '主机名称',
  `Czxtbb` varchar(200) DEFAULT NULL COMMENT '操作系统版本',
  `Czxtnh` varchar(200) DEFAULT NULL COMMENT '操作系统内核',
  `Kjsj` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '开机时间',
  `Dqsj` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '当前时间',
  `Sfwjzd` int(5) DEFAULT '0' COMMENT '是否文件只读',
  `Gs` int(5) DEFAULT NULL COMMENT 'CPU个数',
  `Zp` varchar(100) DEFAULT NULL COMMENT 'CPU主频',
  `Cpu_Syl` float(10,2) DEFAULT NULL COMMENT 'CPU使用率',
  `Zl` bigint(20) DEFAULT NULL COMMENT '内存总量',
  `Sysl` bigint(20) DEFAULT NULL COMMENT '内存使用数量',
  `Nc_Syl` float(10,2) DEFAULT NULL COMMENT '内存使用率',
  `Cpzl` bigint(20) DEFAULT NULL COMMENT '磁盘总量',
  `Cpsyl` bigint(20) DEFAULT NULL COMMENT '磁盘剩余量',
  `Cp_Syl` float(10,2) DEFAULT NULL COMMENT '磁盘使用率',
  `Lrl` bigint(20) DEFAULT NULL COMMENT '单位时间流入量',
  `Lcl` bigint(20) DEFAULT NULL COMMENT '单位时间流出量',
  `Zhdlyh` varchar(100) DEFAULT NULL COMMENT '最后登录用户',
  `Zhdlsj` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '最后登录用户时间',
  `Rksj` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '入库时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='1-1-8-11、设备数据采集——状态总结';

/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
