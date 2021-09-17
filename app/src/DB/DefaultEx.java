package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DefaultEx {
	/*
	 *  DEFAULT
	 *  DEFAULT ���� ������ �ش� �ʵ��� �⺻���� ������ �� �ְ� ���ݴϴ�.
	 *  ���� ���ڵ带 �Է��� �� �ش� �ʵ� ���� �������� ������,
	 *  �ڵ����� �������� �⺻���� �����մϴ�.
	 *  [���̺� ����]
	 *  		CREATE TABLE TEST6(
	 *  				ID		VARCHAR(10),
	 *  				PW		VARCHAR(30),
	 *  				NAME	VARCHAR(30) DEFAULT 'Anonymous',
	 *  				MDATE	DATE,
	 *  				AGE		INT
	 *  		);
	 */
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root", "java");
			stmt = conn.createStatement();
			//stmt.executeUpdate("CREATE TABLE TEST6(ID VARCHAR(10), PW VARCHAR(30), NAME VARCHAR(30) DEFAULT 'Anonymous', MDATE DATETIME DEFAULT CURRENT_TIMESTAMP,AGE INT)");
//			int result = stmt.executeUpdate(insert());
//			System.out.println(result > -1 ? "����": "����");
//			String sql = update();
//			stmt.executeUpdate(sql);
//			stmt.executeUpdate(delete());
			String sql = select();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			while(rs.next()) {
				for(int i=1; i<=cnt; i++)
					System.out.print(rs.getString(i)+"    ");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * DATA INSERT
	 * @return SQL Query
	 */
	public static String insert() {
		String sql = "INSERT INTO TEST6(ID,PW) VALUES('ABC','1234')";
		
		return sql;
	}
	/**
	 *	DATA SELECT
	 *	@return SQL Query
	 */
	public static String select() {
		String sql = "SELECT * FROM TEST6";
		return sql;
	}
}
