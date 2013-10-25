package com.hsoft.winInfoMonitor.vo;

import java.util.Date;


/**
 * 1-1-8-10、设备数据采集——用户操作(sbcj_yhcz)
 * @author 孟令伟
 *
 */
public class sbcj_yhcz {
	
	private int    Sbid;       //设备ID
	private String Yhm;        //登录用户名
	private Date   Dlsj;       //登录时间
	private String IP;         //客户端IP
	private String Ml;         //操作命令
	private Date   Tcsj;       //退出时间
	private Date   Cjsj;       //采集时间
	private Date   Rksj;       //入库时间
	
	public int getSbid() {
		return Sbid;
	}
	public void setSbid(int sbid) {
		Sbid = sbid;
	}
	public String getYhm() {
		return Yhm;
	}
	public void setYhm(String yhm) {
		Yhm = yhm;
	}
	public Date getDlsj() {
		return Dlsj;
	}
	public void setDlsj(Date dlsj) {
		Dlsj = dlsj;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getMl() {
		return Ml;
	}
	public void setMl(String ml) {
		Ml = ml;
	}
	public Date getTcsj() {
		return Tcsj;
	}
	public void setTcsj(Date tcsj) {
		Tcsj = tcsj;
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
