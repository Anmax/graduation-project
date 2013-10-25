package cn.hsoft.showInfo.vo;

import java.util.Date;


/**
 * 1-1-8-5、设备数据采集——磁盘I/O(sbcj_cpio)
 * @author 孟令伟
 *
 */
public class sbcj_cpio {
	
	private int    Sbid;      //设备ID
	private String Cpmc;      //磁盘名称
	private Float  Dcs;       //单位时间读次数
	private Float  Xcs;       //单位时间写次数
	private Date   Cjsj;      //采集时间
	private Date   Rksj;      //入库时间
	public int getSbid() {
		return Sbid;
	}
	public void setSbid(int sbid) {
		Sbid = sbid;
	}
	public String getCpmc() {
		return Cpmc;
	}
	public void setCpmc(String cpmc) {
		Cpmc = cpmc;
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
	public Float getDcs() {
		return Dcs;
	}
	public void setDcs(Float dcs) {
		Dcs = dcs;
	}
	public Float getXcs() {
		return Xcs;
	}
	public void setXcs(Float xcs) {
		Xcs = xcs;
	}
	
	
	

}
