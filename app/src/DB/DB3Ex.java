package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB3Ex {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");
			conn = DriverManager.getConnection(url, "root","java");
			System.out.println("�����ͺ��̽� ���� ����!");
			String sql = "create table DBTEST(ID varchar(10))";            //oracle varchar varchar2(������, ���� ���� ����)
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");		
		}
	}
}
