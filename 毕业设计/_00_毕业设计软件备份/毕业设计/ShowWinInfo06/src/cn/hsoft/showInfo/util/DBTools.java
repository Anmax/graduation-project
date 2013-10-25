package cn.hsoft.showInfo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * MySQL���ݿ�����������
 * @author ����ΰ
 *
 */

public class DBTools {

	public static Connection getConnection() {

		Connection conn = null; // ���������������ݿ��Connection����		
		try {		
			Class.forName("com.mysql.jdbc.Driver");// ����Mysql��������
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql01", "root", "root");// ������������
		} catch (Exception e) {
			System.out.println("���ݿ�����ʧ��" + e.getMessage());
		}
		return conn; // ���������������ݿ�����
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
