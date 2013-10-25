package cn.hsoft.showInfo.action;

import java.util.List;
import cn.hsoft.showInfo.dao.ShowInfoDAO;
import cn.hsoft.showInfo.vo.*;

/**
 * 设备数据采集模块    模型层Action
 * @author 孟令伟
 *
 */
public class ShowInfoAction{
	
	private ShowInfoDAO dao;
	public ShowInfoAction(){
		dao = new ShowInfoDAO();
	}
	private List<sbcj_czxt> listCzxt;
	private List<sbcj_wjcc> listWjcc;
	private List<sbcj_cpu_nc> listCpu_nc;
	private List<sbcj_cpio> listCpio;
	private List<sbcj_wkll> listWkll;
	private List<sbcj_dlyh> listDlyh;
	private List<sbcj_yhcz> listYhcz;
	private List<sbcj_ztzj> listZtzj;
	
	/*
	 * 操作系统
	 */
	public String listCzxt() throws Exception{
		listCzxt = dao.listCzxt();
		return "czxt";
	}
	
	/*
	 * 文件存储
	 */
	public String listWjcc() throws Exception{
		listWjcc = dao.listWjcc();
		return "wjcc";
	}
	
	/*
	 * CPU_内存
	 */
	public String listCpu_nc() throws Exception{
		listCpu_nc = dao.listCPU_nc();
		return "cpu_nc";
	}
	
	/*
	 * 磁盘I/O
	 */
	public String listCpio() throws Exception{
		listCpio = dao.listCpio();
		return "cpio";
	}
	
	/*
	 * 网卡流量
	 */
	public String listWkll() throws Exception{
		listWkll = dao.listWkll();
		return "wkll";
	}
	
	/*
	 * 登录用户
	 */
	public String listDlyh() throws Exception{
		listDlyh = dao.listDlyh();
		return "dlyh";
	}
	
	/*
	 * 用户操作
	 */
	public String listYhcz() throws Exception{
		listYhcz = dao.listYhcz();
		return "yhcz";
	}
	
	/*
	 * 状态总结
	 */
	public String listZtzj() throws Exception{
		listZtzj = dao.listZtzj();
		return "ztzj";
	}
	
	

	public List<sbcj_czxt> getListCzxt() {
		return listCzxt;
	}
	public void setListCzxt(List<sbcj_czxt> listCzxt) {
		this.listCzxt = listCzxt;
	}
	public List<sbcj_wjcc> getListWjcc() {
		return listWjcc;
	}
	public void setListWjcc(List<sbcj_wjcc> listWjcc) {
		this.listWjcc = listWjcc;
	}
	public List<sbcj_cpu_nc> getListCpu_nc() {
		return listCpu_nc;
	}
	public void setListCpu_nc(List<sbcj_cpu_nc> listCpuNc) {
		listCpu_nc = listCpuNc;
	}
	public List<sbcj_cpio> getListCpio() {
		return listCpio;
	}
	public void setListCpio(List<sbcj_cpio> listCpio) {
		this.listCpio = listCpio;
	}
	public List<sbcj_wkll> getListWkll() {
		return listWkll;
	}
	public void setListWkll(List<sbcj_wkll> listWkll) {
		this.listWkll = listWkll;
	}
	public List<sbcj_dlyh> getListDlyh() {
		return listDlyh;
	}
	public void setListDlyh(List<sbcj_dlyh> listDlyh) {
		this.listDlyh = listDlyh;
	}
	public List<sbcj_yhcz> getListYhcz() {
		return listYhcz;
	}
	public void setListYhcz(List<sbcj_yhcz> listYhcz) {
		this.listYhcz = listYhcz;
	}
	public List<sbcj_ztzj> getListZtzj() {
		return listZtzj;
	}
	public void setListZtzj(List<sbcj_ztzj> listZtzj) {
		this.listZtzj = listZtzj;
	}
}
