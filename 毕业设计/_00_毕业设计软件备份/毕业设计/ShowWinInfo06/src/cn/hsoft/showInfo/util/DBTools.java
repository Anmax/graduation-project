package cn.hsoft.showInfo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * MySQL数据库连接驱动类
 * @author 孟令伟
 *
 */

public class DBTools {

	public static Connection getConnection() {

		Connection conn = null; // 创建用于连接数据库的Connection对象		
		try {		
			Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql01", "root", "root");// 创建数据连接
		} catch (Exception e) {
			System.out.println("数据库连接失败" + e.getMessage());
		}
		return conn; // 返回所建立的数据库连接
	}
	
	public static void closePs(PreparedStatement ps){
		try {
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void closeRs(ResultSet rs){
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void closeCo(Connection conn){
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
