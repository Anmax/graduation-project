package cn.hsoft.showInfo.vo;

import java.util.Date;

/**
 * 1-1-8-3���豸���ݲɼ�����CPU_�ڴ�(sbcj_cpu_nc)
 * @author ����ΰ
 *
 */
public class sbcj_cpu_nc {
	
	private int    Sbid;      //�豸ID
	private int    Gs;        //CPU����
	private String Zp;        //CPU��Ƶ
	private Double Cpu_Syl;   //CPUʹ����
	private long   Zl;        //�ڴ�����
	private long   Sysl;      //�ڴ�ʹ������
	private long   Ncsy;      //�ڴ�ʣ����
	private float  Nc_Syl;    //�ڴ�ʹ����
	private Date   Cjsj;      //�ɼ�ʱ��
	private Date   Rksj;      //���ʱ��
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
