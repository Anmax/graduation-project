package com.hsoft.winInfoMonitor.vo;

import java.util.Date;


/**
 * 1-1-8-10���豸���ݲɼ������û�����(sbcj_yhcz)
 * @author ����ΰ
 *
 */
public class sbcj_yhcz {
	
	private int    Sbid;       //�豸ID
	private String Yhm;        //��¼�û���
	private Date   Dlsj;       //��¼ʱ��
	private String IP;         //�ͻ���IP
	private String Ml;         //��������
	private Date   Tcsj;       //�˳�ʱ��
	private Date   Cjsj;       //�ɼ�ʱ��
	private Date   Rksj;       //���ʱ��
	
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
