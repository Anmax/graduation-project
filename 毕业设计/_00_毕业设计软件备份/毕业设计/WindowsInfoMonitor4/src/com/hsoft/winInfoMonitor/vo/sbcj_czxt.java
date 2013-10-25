package com.hsoft.winInfoMonitor.vo;

import java.util.Date;

/**
 * 1-1-8-1、设备数据采集——操作系统(sbcj_czxt)
 * @author 孟令伟
 *
 */
public class sbcj_czxt {
	
	private int    Sbid;      //设备ID
	private String Zjmc;      //主机名称
	private String Czxtbb;    //操作系统版本
	private String Czxtnh;    //操作系统内核
	private Date   Kjsj;      //开机时间 
	private Date   Dqsj;      //当前时间
	private int    Sfwjzd;    //是否文件只读
	private Date   Cjsj;      //采集时间
	private Date   Rksj;      //入库时间
	
	public int getSbid() {
		return Sbid;
	}
	public void setSbid(int sbid) {
		Sbid = sbid;
	}
	public String getZjmc() {
		return Zjmc;
	}
	public void setZjmc(String zjmc) {
		Zjmc = zjmc;
	}
	public String getCzxtbb() {
		return Czxtbb;
	}
	public void setCzxtbb(String czxtbb) {
		Czxtbb = czxtbb;
	}
	public String getCzxtnh() {
		return Czxtnh;
	}
	public void setCzxtnh(String czxtnh) {
		Czxtnh = czxtnh;
	}
	public Date getKjsj() {
		return Kjsj;
	}
	public void setKjsj(Date kjsj) {
		Kjsj = kjsj;
	}
	public Date getDqsj() {
		return Dqsj;
	}
	public void setDqsj(Date dqsj) {
		Dqsj = dqsj;
	}
	public int getSfwjzd() {
		return Sfwjzd;
	}
	public void setSfwjzd(int sfwjzd) {
		Sfwjzd = sfwjzd;
	}
	public Date getCjsj() {
		return Cjsj;
	}
	public void setCjsj(Date cjsj) {
		Cjsj = cjsj;
	}
	public Date getRksj() {
		return Rksj;
	}
	public void setRksj(Date rksj) {
		Rksj = rksj;
	}
	
	

}
