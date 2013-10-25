package com.hsoft.winInfoMonitor.vo;

import java.util.Date;


/**
 * 1-1-8-11、设备数据采集——状态总结(sbcj_ztzj)
 * @author 孟令伟
 *
 */
public class sbcj_ztzj {
	
	private int    Sbid;      //设备ID
	private String Zjmc;      //主机名称
	private String Czxtbb;    //操作系统版本
	private String Czxtnh;    //操作系统内核
	private Date   Kjsj;      //开机时间
	private Date   Dqsj;      //当前时间
	private int    Sfwjzd;    //是否文件只读
	private int    Gs;        //CPU个数
	private String Zp;        //CPU主频
	private float  Cpu_Syl;   //CPU使用率
	private long   Zl;        //内存总量
	private long   Sysl;      //内存使用数量
	private float  Nc_Syl;    //内存使用率
	private long   Cpzl;      //磁盘总量
	private long   Cpsyl;     //磁盘剩余量
	private float  Cp_Syl;    //磁盘使用率
	private long   Lrl;       //单位时间流入量
	private long   Lcl;       //单位时间流出量
	private String Zhdlyh;    //最后登录用户
	private Date   Zhdlsj;    //最后登录用户时间
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
	public float getCpu_Syl() {
		return Cpu_Syl;
	}
	public void setCpu_Syl(float cpuSyl) {
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
	public float getNc_Syl() {
		return Nc_Syl;
	}
	public void setNc_Syl(float ncSyl) {
		Nc_Syl = ncSyl;
	}
	public long getCpzl() {
		return Cpzl;
	}
	public void setCpzl(long cpzl) {
		Cpzl = cpzl;
	}
	public long getCpsyl() {
		return Cpsyl;
	}
	public void setCpsyl(long cpsyl) {
		Cpsyl = cpsyl;
	}
	public float getCp_Syl() {
		return Cp_Syl;
	}
	public void setCp_Syl(float cpSyl) {
		Cp_Syl = cpSyl;
	}
	public long getLrl() {
		return Lrl;
	}
	public void setLrl(long lrl) {
		Lrl = lrl;
	}
	public long getLcl() {
		return Lcl;
	}
	public void setLcl(long lcl) {
		Lcl = lcl;
	}
	public String getZhdlyh() {
		return Zhdlyh;
	}
	public void setZhdlyh(String zhdlyh) {
		Zhdlyh = zhdlyh;
	}
	public Date getZhdlsj() {
		return Zhdlsj;
	}
	public void setZhdlsj(Date zhdlsj) {
		Zhdlsj = zhdlsj;
	}
	public Date getRksj() {
		return Rksj;
	}
	public void setRksj(Date rksj) {
		Rksj = rksj;
	}
		
}
