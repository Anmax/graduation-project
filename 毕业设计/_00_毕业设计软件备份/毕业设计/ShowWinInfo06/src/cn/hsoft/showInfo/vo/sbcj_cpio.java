package cn.hsoft.showInfo.vo;

import java.util.Date;


/**
 * 1-1-8-5���豸���ݲɼ���������I/O(sbcj_cpio)
 * @author ����ΰ
 *
 */
public class sbcj_cpio {
	
	private int    Sbid;      //�豸ID
	private String Cpmc;      //��������
	private Float  Dcs;       //��λʱ�������
	private Float  Xcs;       //��λʱ��д����
	private Date   Cjsj;      //�ɼ�ʱ��
	private Date   Rksj;      //���ʱ��
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
