package cn.hsoft.showInfo.vo;

import java.util.Date;


/**
 * 1-1-8-2、设备数据采集——文件存储 (sbcj_wjcc)
 * @author 孟令伟
 *
 */
public class sbcj_wjcc {
	
	private int    Sbid;       //设备ID
	private String Lb;         //类别
	private String Wjccml;     //文件存储目录
	private long   Wjdx;       //文件大小
	private Date   Cjsj;       //采集时间
	private Date   Rksj;       //入库时间
	
	public int getSbid() {
		return Sbid;
	}
	public void setSbid(int sbid) {
		Sbid = sbid;
	}
	public String getLb() {
		return Lb;
	}
	public void setLb(String lb) {
		Lb = lb;
	}
	public String getWjccml() {
		return Wjccml;
	}
	public void setWjccml(String wjccml) {
		Wjccml = wjccml;
	}
	
	public long getWjdx() {
		return Wjdx;
	}
	public void setWjdx(long wjdx) {
		Wjdx = wjdx;
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
