package cn.hsoft.showInfo.vo;

import java.util.Date;


/**
 * 1-1-8-9���豸���ݲɼ�������¼�û�(sbcj_dlyh)
 * @author ����ΰ
 *
 */
public class sbcj_dlyh {
	private int    Sbid;     //�豸ID
	private String Yhm;      //�û���
	private Date   Sj;       //��½ʱ��
	private String IP;       //�ͻ���IP
	private Date   Cjsj;     //�ɼ�ʱ��
	private Date   Rksj;     //���ʱ��
	
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
	public Date getSj() {
		return Sj;
	}
	public void setSj(Date sj) {
		Sj = sj;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
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
