package cn.hsoft.showInfo.vo;

import java.util.Date;


/**
 * 1-1-8-2���豸���ݲɼ������ļ��洢 (sbcj_wjcc)
 * @author ����ΰ
 *
 */
public class sbcj_wjcc {
	
	private int    Sbid;       //�豸ID
	private String Lb;         //���
	private String Wjccml;     //�ļ��洢Ŀ¼
	private long   Wjdx;       //�ļ���С
	private Date   Cjsj;       //�ɼ�ʱ��
	private Date   Rksj;       //���ʱ��
	
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
