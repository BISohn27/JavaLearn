package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class PrimaryKeyEx {

	/*
	 * 	PRIMARY KEY
	 * 	PRIMARY KEY ���� ������ �����ϸ�, �ش� �ʵ�� NOT NULL�� UNIQUE
	 * 	���� ������ Ư¡�� ��� �����ϴ�.
	 * 	���� �� ���� ������ ������ �ʵ�� NULL ���� ���� �� ������,
	 * 	���� �ߺ��� ���� �������� �� �˴ϴ�.
	 * 	�̷��� PRIMARY KEY ���� ������ �⺻ Ű��� �մϴ�.
	 * 	UNUQUE�� �� ���̺��� ���� �ʵ忡 ������ �� ������, PRIMARY KEY�� ���̺� ��
	 * 	���� �ϳ��� �ʵ忡�� ������ �� �ֽ��ϴ�.
	 * 	PRIMARY KEY ���� ������ ���̺��� �����͸� ���� ������ ã����
	 * 	�����ִ� ������ �մϴ�.
	 * 
	 * 	-> [���̺� ����]
	 * 		CREATE TABLE TEST3(
	 * 				ID		VARCHAR(10) PRIMARY KEY,
	 * 				PW		VARCHAR(30),
	 * 				NAME	VARCHAR(30,
	 * 				MDATE	DATE,
	 * 				AGE		INT
	 */
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","java");
			stmt = conn.createStatement();
			String sql = select();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			while(rs.next()) {
			for(int i =1; i<=cnt; i++)
				System.out.print(rs.getString(i) + "   ");
			System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				if(rs != null) rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * DATA INSERT
	 * @return sql
	 */
	static String insert() {
		String sql = "INSERT INTO TEST3(ID,PW) VALUES('ABC','123')";
		return sql;
	}
	
	/**
	 * DATA SELECT
	 * @return sql
	 */
	static String select() {
		String sql = "SELECT * FROM TEST3";
		return sql;
	}
}
