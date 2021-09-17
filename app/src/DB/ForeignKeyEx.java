package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ForeignKeyEx {
	/*
	 * 	FOREIGN KEY : �ܷ� Ű
	 * 		FOREIGN KEY ���� ������ ������ �ʵ�� �ܷ� Ű��� �θ���,
	 * 		�� ���̺��� �ٸ� ���̺�� �������ִ� ������ �մϴ�.
	 * 		�ܷ� Ű�� ������ ���̺� ���ڵ带 �Է��ϸ�, ������ �Ǵ� ���̺��� ������
	 * 		�����ؼ� ���ڵ尡 �Էµ˴ϴ�.
	 * 		��, FOREIGN KEY ���� ������ �ϳ��� ���̺��� �ٸ� ���̺� �����ϰ� ����ϴ�.
	 * 		FOREIGN KEY ���� ������ ������ �� �����Ǵ� ���̺��� �ʵ�� �ݵ��
	 * 		UNIQUE�� PRIMARY KEY ���� ������ �����Ǿ� �־�� �մϴ�.
	 * 			-> [���̺� ����]
	 * 			CREATE TABLE TEST4(
	 * 						CODE		INT PRIMARY KEY,
	 * 						ITEM		VARCHAR(30),
	 * 						RDATE		DATE
	 * 					);
	 * 			CREATE TABLE TEST5(
	 * 						NUM			INT PRIMARY KEY auto_increment,
	 *						CODE		INT,
	 *						FOREIGN KEY (CODE)  -> TEST4�� CODE ���� �����Ͱ� ����                             
	 *						REFERENCES TEST4(CODE) ON UPDATE CASCADE ON DELETE CASCADE
	 *					); 
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
//			int result = stmt.executeUpdate(insert());
//			System.out.println(result > -1 ? "����": "����");
//			String sql = update();
//			stmt.executeUpdate(sql);
			stmt.executeUpdate(delete());
			String sql = select(2);
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
	 * @return sql
	 */
	public static String insert() {
		//����1)
		//String sql = "INSERT INTO TEST4(CODE, ITEM, RDATE) VALUES(1,'������1',NOW())";
		//����2)
		//String sql = "INSERT INTO TEST4(CODE, ITEM, RDATE) VALUES(2,'������2',NOW())";
		//����3)
		//String sql = "INSERT INTO TEST5(CODE) VALUES(1)";
		//����4)
		String sql = "INSERT INTO TEST5(CODE) VALUES(2)";
		return sql;
	}
	
	/**
	 * DATA SELECT
	 * @return sql
	 */
	public static String select(int number) {
		//����1)
		String sql = "";
		if(number ==1)
			sql= "SELECT * FROM TEST4";
		//����2)
		else 
			sql = "SELECT * FROM TEST5";
		
		return sql;
	}
	/**
	 * DATA UPDATE
	 * @return sql Query
	 */
	public static String update() {
		System.out.print("������ �ڵ带 �������ּ���.> ");
		String code = new Scanner(System.in).next();
		System.out.print("������ �ڵ� ���� �Է����ּ���.> ");
		String modifyCode = new Scanner(System.in).next();
		//test4�� �ڵ� ���� �����ϸ�(���̺� �� ����� �ʵ尪) foreign key�� ����� test5������ �ڵ� �����Ǿ���.
		String sql = "UPDATE TEST4 SET CODE="+modifyCode+ " WHERE CODE="+ code;
		return sql;
	}
	/**
	 * DATA DELETE
	 * @return sql
	 */
	public static String delete() {
		String sql = "DELETE FROM TEST4 WHERE CODE=2";
		return sql;
	}
}
