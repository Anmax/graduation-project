package cn.hsoft.showInfo.vo;

import java.util.Date;


/**
 * 1-1-8-7、设备数据采集——网卡流量(sbcj_wkll)
 * @author 孟令伟
 *
 */
public class sbcj_wkll {
	
	private int    Sbid;    //设备ID
	private String Wkmc;    //网卡名称
	private String IP;      //IP地址
	private long   Lrl;     //单位时间流入量
	private long   Srdbs;   //单位时间输入丢包数
	private long   Srcbs;   //单位时间输入错包数
	private long   Lcl;     //单位时间流出量
	private long   Scdbs;   //单位时间输出丢包数
	private long   Sccbs;   //单位时间输出错包数
	private Date   Cjsj;    //采集时间
	private Date   Rksj;    //入库时间
	
	public int getSbid() {
		return Sbid;
	}
	public void setSbid(int sbid) {
		Sbid = sbid;
	}
	public String getWkmc() {
		return Wkmc;
	}
	public void setWkmc(String wkmc) {
		Wkmc = wkmc;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public long getLrl() {
		return Lrl;
	}
	public void setLrl(long lrl) {
		Lrl = lrl;
	}
	public long getSrdbs() {
		return Srdbs;
	}
	public void setSrdbs(long srdbs) {
		Srdbs = srdbs;
	}
	public long getSrcbs() {
		return Srcbs;
	}
	public void setSrcbs(long srcbs) {
		Srcbs = srcbs;
	}
	public long getLcl() {
		return Lcl;
	}
	public void setLcl(long lcl) {
		Lcl = lcl;
	}
	public long getScdbs() {
		return Scdbs;
	}
	public void setScdbs(long scdbs) {
		Scdbs = scdbs;
	}
	public long getSccbs() {
		return Sccbs;
	}
	public void setSccbs(long sccbs) {
		Sccbs = sccbs;
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
