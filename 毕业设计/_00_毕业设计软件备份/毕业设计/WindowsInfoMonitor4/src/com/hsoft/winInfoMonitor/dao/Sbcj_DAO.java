package com.hsoft.winInfoMonitor.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hsoft.winInfoMonitor.util.DBTools;
import com.hsoft.winInfoMonitor.vo.sbcj_cpio;
import com.hsoft.winInfoMonitor.vo.sbcj_cpu_nc;
import com.hsoft.winInfoMonitor.vo.sbcj_czxt;
import com.hsoft.winInfoMonitor.vo.sbcj_dlyh;
import com.hsoft.winInfoMonitor.vo.sbcj_wjcc;
import com.hsoft.winInfoMonitor.vo.sbcj_wkll;
import com.hsoft.winInfoMonitor.vo.sbcj_yhcz;
import com.hsoft.winInfoMonitor.vo.sbcj_ztzj;


/**
 * 数据持久化类
 * @author 孟令伟
 *
 */
public class Sbcj_DAO {
	
	/**
	 * 设备数据采集——操作系统(sbcj_czxt)
	 * @param vo
	 */
	public void addSbcj_czxt(sbcj_czxt vo){
		
		Connection conn = null;
		PreparedStatement ps = null;
		try{		
			conn = DBTools.getConnection();	
			conn.setAutoCommit(false);
			String sql = " insert into sbcj_czxt values(001,?,?,?,sysdate(),sysdate(),1,sysdate(),sysdate()) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getZjmc());
			ps.setString(2, vo.getCzxtbb());
			ps.setString(3, vo.getCzxtnh());
			ps.executeUpdate();
			conn.commit();
		}
		catch (Exception e){
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		finally{
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
	}
	
	/**
	 * 设备数据采集——文件存储 (sbcj_wjcc)
	 * @param vo
	 */
	public void addSbcj_wjcc(sbcj_wjcc vo){
		
		Connection conn = null;
		PreparedStatement ps = null;
		try{		
			conn = DBTools.getConnection();	
			conn.setAutoCommit(false);
			String sql = " insert into sbcj_wjcc values(001,?,?,?,sysdate(),sysdate()) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getLb());
			ps.setString(2, vo.getWjccml());
			ps.setLong(3, vo.getWjdx());
			ps.executeUpdate();
			conn.commit();
		}
		catch (Exception e){
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		finally{
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
	}
	
	/**
	 * 设备数据采集——CPU_内存(sbcj_cpu_nc)
	 * @param vo
	 */
	public void addSbcj_cpu_nc(sbcj_cpu_nc vo){		
		Connection conn = null;
		PreparedStatement ps = null;
		try{		
			conn = DBTools.getConnection();	
			conn.setAutoCommit(false);
			String sql = " insert into sbcj_cpu_nc values(001,?,?,5,?,?,?,?,sysdate(),sysdate()) ";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getGs());
			ps.setString(2, vo.getZp());
			ps.setFloat(3, vo.getZl());
			ps.setFloat(4, vo.getSysl());
			ps.setFloat(5, vo.getNcsy());
			ps.setFloat(6, vo.getNc_Syl());
			ps.executeUpdate();
			conn.commit();
		}
		catch (Exception e){
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		finally{
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
	}
	
	/**
	 * 设备数据采集——磁盘I/O(sbcj_cpio)
	 * @param vo
	 */
	public void addSbcj_cpio(sbcj_cpio vo){
		Connection conn = null;
		PreparedStatement ps = null;
		try{		
			conn = DBTools.getConnection();	
			conn.setAutoCommit(false);
			String sql = " insert into sbcj_cpio values(001,?,?,?,sysdate(),sysdate()) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getCpmc());
			ps.setFloat(2, vo.getDcs());
			ps.setFloat(3, vo.getXcs());
			ps.executeUpdate();
			conn.commit();
		}
		catch (Exception e){
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		finally{
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
	}
	
	/**
	 * 设备数据采集——网卡流量(sbcj_wkll)
	 * @param vo
	 */
	public void addSbcj_wkll(sbcj_wkll vo){
		Connection conn = null;
		PreparedStatement ps = null;
		try{		
			conn = DBTools.getConnection();	
			conn.setAutoCommit(false);
			String sql = " insert into sbcj_wkll(Sbid,Wkmc,IP,Lrl,Srdbs,Srcbs,Lcl,Scdbs,Sccbs,Cjsj,Rksj) " +
                         " values(001,?,?,?,?,?,?,?,?,sysdate(),sysdate()) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getWkmc());
			ps.setString(2, vo.getIP());
			ps.setLong(3, vo.getLrl());
			ps.setLong(4, vo.getSrdbs());
			ps.setLong(5, vo.getSrcbs());
			ps.setLong(6, vo.getLcl());
			ps.setLong(7, vo.getScdbs());
			ps.setLong(8, vo.getSccbs());
			
			ps.executeUpdate();
			conn.commit();
		}
		catch (Exception e){
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		finally{
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
	}
	
	/**
	 * 设备数据采集——登录用户(sbcj_dlyh)
	 * @param vo
	 */
	public void addSbcj_dlyh(sbcj_dlyh vo){
		Connection conn = null;
		PreparedStatement ps = null;
		try{		
			conn = DBTools.getConnection();	
			conn.setAutoCommit(false);
			String sql = " insert into sbcj_dlyh(Sbid,Yhm,Sj,IP,Cjsj,Rksj) " +
                           " values(001,?,sysdate(),?,sysdate(),sysdate()) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getYhm());
			ps.setString(2, vo.getIP());
			ps.executeUpdate();
			conn.commit();
		}
		catch (Exception e){
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		finally{
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
	}
	
	/**
	 * 设备数据采集——用户操作(sbcj_yhcz)
	 * @param vo
	 */
	public void addSbcj_yhcz(sbcj_yhcz vo){
		Connection conn = null;
		PreparedStatement ps = null;
		try{		
			conn = DBTools.getConnection();	
			conn.setAutoCommit(false);
			String sql = " insert into sbcj_yhcz(Sbid,Yhm,Dlsj,IP,Ml,Tcsj,Cjsj,Rksj) " +
                         " values(001,?,sysdate(),?,'select * form sbcj_czxt',sysdate(),sysdate(),sysdate()) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getYhm());
			ps.setString(2, vo.getIP());
			ps.executeUpdate();
			conn.commit();
		}
		catch (Exception e){
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		finally{
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
	}
	
	/**
	 * 设备数据采集——状态总结(sbcj_ztzj)
	 * @param vo
	 */
	public void addSbcj_ztzj(sbcj_ztzj vo){
		Connection conn = null;
		PreparedStatement ps = null;
		try{		
			conn = DBTools.getConnection();	
			conn.setAutoCommit(false);
			String sql = " insert into sbcj_ztzj(Sbid,Zjmc,Czxtbb,Czxtnh,Kjsj,Dqsj,Sfwjzd,Gs,Zp,Cpu_Syl,Zl,Sysl,Nc_Syl,Cpzl,Cpsyl,Cp_Syl,Lrl,Lcl,Zhdlyh,Zhdlsj,Rksj) " +
                         " values(001,?,?,?,sysdate(),sysdate(),1,?,?,?,?,?,?,?,?,?,?,?,?,sysdate(),sysdate()) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getZjmc());
			ps.setString(2, vo.getCzxtbb());
			ps.setString(3, vo.getCzxtnh());
			ps.setInt(4, vo.getGs());
			ps.setString(5, vo.getZp());
			ps.setFloat(6, vo.getCpu_Syl());
			ps.setLong(7, vo.getZl());
			ps.setLong(8, vo.getSysl());
			ps.setFloat(9, vo.getNc_Syl());
			ps.setLong(10, vo.getCpzl());
			ps.setLong(11, vo.getCpsyl());
			ps.setFloat(12, vo.getCp_Syl());
			ps.setLong(13, vo.getLrl());
			ps.setLong(14, vo.getLcl());
			ps.setString(15,vo.getZhdlyh());
			ps.executeUpdate();
			conn.commit();
		}
		catch (Exception e){
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		finally{
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBTools.closePs(ps);
			DBTools.closeCo(conn);
		}
	}
	
	/**
	 * 执行此方法会将数据库中所有数据清空，但保留表结构
	 */
	public void truncate(){
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBTools.getConnection();
			conn.setAutoCommit(false);
			String sql01 = " truncate table sbcj_czxt ";
			String sql02 = " truncate table sbcj_wjcc ";
			String sql03 = " truncate table sbcj_cpu_nc ";
			String sql04 = " truncate table sbcj_cpio ";
			String sql05 = " truncate table sbcj_wkll ";
			String sql06 = " truncate table sbcj_dlyh ";
			String sql07 = " truncate table sbcj_yhcz ";
			String sql08 = " truncate table sbcj_ztzj ";
			
			ps = conn.prepareStatement(sql01);
			ps.executeUpdate();
			ps = conn.prepareStatement(sql02);
			ps.executeUpdate();
			ps = conn.prepareStatement(sql03);
			ps.executeUpdate();
			ps = conn.prepareStatement(sql04);
			ps.executeUpdate();
			ps = conn.prepareStatement(sql05);
			ps.executeUpdate();
			ps = conn.prepareStatement(sql06);
			ps.executeUpdate();
			ps = conn.prepareStatement(sql07);
			ps.executeUpdate();
			ps = conn.prepareStatement(sql08);
			ps.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DBTools.closeCo(conn);
			DBTools.closePs(ps);
		}	
	}

}
