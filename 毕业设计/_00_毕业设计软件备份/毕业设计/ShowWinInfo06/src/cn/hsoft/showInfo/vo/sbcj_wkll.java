package cn.hsoft.showInfo.vo;

import java.util.Date;


/**
 * 1-1-8-7���豸���ݲɼ�������������(sbcj_wkll)
 * @author ����ΰ
 *
 */
public class sbcj_wkll {
	
	private int    Sbid;    //�豸ID
	private String Wkmc;    //��������
	private String IP;      //IP��ַ
	private long   Lrl;     //��λʱ��������
	private long   Srdbs;   //��λʱ�����붪����
	private long   Srcbs;   //��λʱ����������
	private long   Lcl;     //��λʱ��������
	private long   Scdbs;   //��λʱ�����������
	private long   Sccbs;   //��λʱ����������
	private Date   Cjsj;    //�ɼ�ʱ��
	private Date   Rksj;    //���ʱ��
	
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
