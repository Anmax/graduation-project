package cn.hsoft.showInfo.vo;

import java.util.Date;


/**
 * 1-1-8-9、设备数据采集——登录用户(sbcj_dlyh)
 * @author 孟令伟
 *
 */
public class sbcj_dlyh {
	private int    Sbid;     //设备ID
	private String Yhm;      //用户名
	private Date   Sj;       //登陆时间
	private String IP;       //客户端IP
	private Date   Cjsj;     //采集时间
	private Date   Rksj;     //入库时间
	
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
	public Date getSj() {
		return Sj;
	}
	public void setSj(Date sj) {
		Sj = sj;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
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
