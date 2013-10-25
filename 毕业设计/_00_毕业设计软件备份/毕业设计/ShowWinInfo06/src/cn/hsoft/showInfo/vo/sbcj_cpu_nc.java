package cn.hsoft.showInfo.vo;

import java.util.Date;

/**
 * 1-1-8-3、设备数据采集——CPU_内存(sbcj_cpu_nc)
 * @author 孟令伟
 *
 */
public class sbcj_cpu_nc {
	
	private int    Sbid;      //设备ID
	private int    Gs;        //CPU个数
	private String Zp;        //CPU主频
	private Double Cpu_Syl;   //CPU使用率
	private long   Zl;        //内存总量
	private long   Sysl;      //内存使用数量
	private long   Ncsy;      //内存剩余量
	private float  Nc_Syl;    //内存使用率
	private Date   Cjsj;      //采集时间
	private Date   Rksj;      //入库时间
	public int getSbid() {
		return Sbid;
	}
	public void setSbid(int sbid) {
		Sbid = sbid;
	}
	public int getGs() {
		return Gs;
	}
	public void setGs(int gs) {
		Gs = gs;
	}
	public String getZp() {
		return Zp;
	}
	public void setZp(String zp) {
		Zp = zp;
	}
	public Double getCpu_Syl() {
		return Cpu_Syl;
	}
	public void setCpu_Syl(Double cpuSyl) {
		Cpu_Syl = cpuSyl;
	}
	public long getZl() {
		return Zl;
	}
	public void setZl(long zl) {
		Zl = zl;
	}
	public long getSysl() {
		return Sysl;
	}
	public void setSysl(long sysl) {
		Sysl = sysl;
	}
	public long getNcsy() {
		return Ncsy;
	}
	public void setNcsy(long ncsy) {
		Ncsy = ncsy;
	}
	public float getNc_Syl() {
		return Nc_Syl;
	}
	public void setNc_Syl(float ncSyl) {
		Nc_Syl = ncSyl;
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
