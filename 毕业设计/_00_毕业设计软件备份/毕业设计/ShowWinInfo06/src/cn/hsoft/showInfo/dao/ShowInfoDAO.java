package cn.hsoft.showInfo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import cn.hsoft.showInfo.util.DBTools;
import cn.hsoft.showInfo.vo.*;

/**
 * 获取数据库信息，并返回list
 * @author 孟令伟
 *
 */
public class ShowInfoDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	/*
	 * 操作系统
	 */
	public ArrayList<sbcj_czxt> listCzxt(){
		ArrayList<sbcj_czxt> list = new ArrayList<sbcj_czxt>();
		try {
			conn = DBTools.getConnection();
			String sql = " select * from sbcj_czxt order by Rksj desc limit 100 ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				sbcj_czxt vo = new sbcj_czxt();
				vo.setSbid(rs.getInt("Sbid"));
				vo.setZjmc(rs.getString("Zjmc"));
				vo.setCzxtbb(rs.getString("Czxtbb"));
				vo.setCzxtnh(rs.getString("Czxtnh"));
				vo.setKjsj(rs.getTimestamp("Kjsj"));
				vo.setDqsj(rs.getTimestamp("Dqsj"));
				vo.setSfwjzd(rs.getInt("Sfwjzd"));
				vo.setCjsj(rs.getTimestamp("Cjsj"));
				vo.setRksj(rs.getTimestamp("Rksj"));
				list.add(vo);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DBTools.closeRs(rs);
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
		return list;
	}
	
	/*
	 * 文件存储
	 */
	public ArrayList<sbcj_wjcc> listWjcc(){
		ArrayList<sbcj_wjcc> list = new ArrayList<sbcj_wjcc>();
		try {
			conn = DBTools.getConnection();
			String sql = " select * from sbcj_wjcc order by Rksj desc limit 100 ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				sbcj_wjcc vo = new sbcj_wjcc();
				vo.setSbid(rs.getInt("Sbid"));
				vo.setLb(rs.getString("Lb"));
				vo.setWjccml(rs.getString("Wjccml"));
				vo.setWjdx(rs.getLong("Wjdx"));
				vo.setCjsj(rs.getTimestamp("Cjsj"));
				vo.setRksj(rs.getTimestamp("Rksj"));
				list.add(vo);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DBTools.closeRs(rs);
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
		return list;
	}
	
	/*
	 * CPU_内存
	 */
	public ArrayList<sbcj_cpu_nc> listCPU_nc(){
		ArrayList<sbcj_cpu_nc> list = new ArrayList<sbcj_cpu_nc>();
		try {
			conn = DBTools.getConnection();
			String sql = " select * from sbcj_cpu_nc order by Rksj desc limit 100 ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				sbcj_cpu_nc vo = new sbcj_cpu_nc();
				vo.setSbid(rs.getInt("Sbid"));
				vo.setGs(rs.getInt("Gs"));
				vo.setZp(rs.getString("Zp"));
				vo.setCpu_Syl(rs.getDouble("Cpu_Syl"));
				vo.setZl(rs.getLong("Zl"));
				vo.setSysl(rs.getLong("Sysl"));
				vo.setNcsy(rs.getLong("Ncsy"));
				vo.setNc_Syl(rs.getFloat("Nc_Syl"));
				vo.setCjsj(rs.getTimestamp("Cjsj"));
				vo.setRksj(rs.getTimestamp("Rksj"));
				list.add(vo);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DBTools.closeRs(rs);
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
		return list;
	}
	
	/*
	 * 磁盘I/O
	 */
	public ArrayList<sbcj_cpio> listCpio(){
		ArrayList<sbcj_cpio> list = new ArrayList<sbcj_cpio>();
		try {
			conn = DBTools.getConnection();
			String sql = " select * from sbcj_cpio order by Rksj desc limit 100 ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				sbcj_cpio vo = new sbcj_cpio();
				vo.setSbid(rs.getInt("Sbid"));
				vo.setCpmc(rs.getString("Cpmc"));
				vo.setDcs(rs.getFloat("Dcs"));
				vo.setXcs(rs.getFloat("Xcs"));
				vo.setCjsj(rs.getTimestamp("Cjsj"));
				vo.setRksj(rs.getTimestamp("Rksj"));
				list.add(vo);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DBTools.closeRs(rs);
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
		return list;
	}
	
	/*
	 * 网卡流量
	 */
	public ArrayList<sbcj_wkll> listWkll(){
		ArrayList<sbcj_wkll> list = new ArrayList<sbcj_wkll>();
		try {
			conn = DBTools.getConnection();
			String sql = " select * from sbcj_wkll order by Rksj desc limit 100 ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				sbcj_wkll vo = new sbcj_wkll();
				vo.setSbid(rs.getInt("Sbid"));
				vo.setWkmc(rs.getString("Wkmc"));
				vo.setIP(rs.getString("IP"));
				vo.setLrl(rs.getLong("Lrl"));
				vo.setSrdbs(rs.getLong("Srdbs"));
				vo.setSrcbs(rs.getLong("Srcbs"));
				vo.setLcl(rs.getLong("Lcl"));
				vo.setScdbs(rs.getLong("Scdbs"));
				vo.setSccbs(rs.getLong("Sccbs"));
				vo.setCjsj(rs.getTimestamp("Cjsj"));
				vo.setRksj(rs.getTimestamp("Rksj"));
				list.add(vo);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DBTools.closeRs(rs);
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
		return list;
	}
	
	/*
	 * 登录用户
	 */
	public ArrayList<sbcj_dlyh> listDlyh(){
		ArrayList<sbcj_dlyh> list = new ArrayList<sbcj_dlyh>();
		try {
			conn = DBTools.getConnection();
			String sql = " select * from sbcj_dlyh order by Rksj desc limit 100 ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				sbcj_dlyh vo = new sbcj_dlyh();
				vo.setSbid(rs.getInt("Sbid"));
				vo.setYhm(rs.getString("Yhm"));
				vo.setSj(rs.getTimestamp("Sj"));
				vo.setIP(rs.getString("IP"));
				vo.setCjsj(rs.getTimestamp("Cjsj"));
				vo.setRksj(rs.getTimestamp("Rksj"));
				list.add(vo);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DBTools.closeRs(rs);
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
		return list;
	}
	
	/*
	 * 用户操作
	 */
	public ArrayList<sbcj_yhcz> listYhcz(){
		ArrayList<sbcj_yhcz> list = new ArrayList<sbcj_yhcz>();
		try {
			conn = DBTools.getConnection();
			String sql = " select * from sbcj_yhcz order by Rksj desc limit 100 ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				sbcj_yhcz vo = new sbcj_yhcz();
				vo.setSbid(rs.getInt("Sbid"));
				vo.setYhm(rs.getString("Yhm"));
				vo.setDlsj(rs.getTimestamp("Dlsj"));
				vo.setIP(rs.getString("IP"));
				vo.setMl(rs.getString("Ml"));
				vo.setTcsj(rs.getTimestamp("Tcsj"));
				vo.setCjsj(rs.getTimestamp("Cjsj"));
				vo.setRksj(rs.getTimestamp("Rksj"));
				list.add(vo);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DBTools.closeRs(rs);
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
		return list;
	}
	
	/*
	 * 状态总结
	 */
	public ArrayList<sbcj_ztzj> listZtzj(){
		ArrayList<sbcj_ztzj> list = new ArrayList<sbcj_ztzj>();
		try {
			conn = DBTools.getConnection();
			String sql = " select * from sbcj_ztzj order by Rksj desc limit 100 ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				sbcj_ztzj vo = new sbcj_ztzj();
				vo.setSbid(rs.getInt("Sbid"));
				vo.setZjmc(rs.getString("Zjmc"));
				vo.setCzxtbb(rs.getString("Czxtbb"));
				vo.setCzxtnh(rs.getString("Czxtnh"));
				vo.setKjsj(rs.getTimestamp("Kjsj"));
				vo.setDqsj(rs.getTimestamp("Dqsj"));
				vo.setSfwjzd(rs.getInt("Sfwjzd"));
				vo.setGs(rs.getInt("Gs"));
				vo.setZp(rs.getString("Zp"));
				vo.setCpu_Syl(rs.getFloat("Cpu_Syl"));
				vo.setZl(rs.getLong("Zl"));
				vo.setSysl(rs.getLong("Sysl"));
				vo.setNc_Syl(rs.getFloat("Nc_Syl"));
				vo.setCpzl(rs.getLong("Cpzl"));
				vo.setCpsyl(rs.getLong("Cpsyl"));
				vo.setCp_Syl(rs.getFloat("Cp_Syl"));
				vo.setLrl(rs.getLong("Lrl"));
				vo.setLcl(rs.getLong("Lcl"));
				vo.setZhdlyh(rs.getString("Zhdlyh"));
				vo.setZhdlsj(rs.getTimestamp("Zhdlsj"));
				vo.setRksj(rs.getTimestamp("Rksj"));
				list.add(vo);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DBTools.closeRs(rs);
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
		return list;
	}
	
}
