package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateEx {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("DB���� ����!");
			stmt = conn.createStatement();
			// UPDATE ��
			String sql = update(1,2);
			int result = stmt.executeUpdate(sql);
			System.out.println(result > -1 ? "����" : "����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * DATA UPDATE
	 * 
	 * @return sql
	 */
	// ������ ���̽� ��ɾ� ������ �Ͼ�� �޼ҵ�
	public static String update() {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("ID : ");
//		String id = scan.next();
//		System.out.print("PW : ");
//		String pw = scan.next();
		// DBTEST�� SET(����) COLUMN ID�� ''�� ���� <- COLUMN ID�� ���� ��� ROW�� ������. Ư���� ȸ�� ������ ����
		// ������
		// String sql = "UPDATE DBTEST SET ID='ABC'";
		// SQL ������ WHERE�� ���ǹ��� �����ϱ� ���� ����
		String sql = "UPDATE DBTEST3 SET PW='1111',AGE = 100,CRE_DATE = now() WHERE ID='ss'";
		return sql;
	}

	public static String update(int number,int DB) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("PW : ");
		String pw = scan.next();
		System.out.print("NAME : ");
		String name = scan.next();
	
		String sql = "";
		if (number == 1 && DB == 2) {
			sql = "INSERT INTO DBTEST" + DB + " VALUES('" + 
					id + "','" + 
					pw + "','" + 
					name + "')";
		}else if (number ==1 && DB == 1) {
			sql = "INSERT INTO DBTEST" + DB + " VALUES('" + 
					id + "')";
		}else if(DB == 2) {
			System.out.print("Update ID : ");
			String uID = scan.next();
			
			sql = "UPDATE DBTEST"+ DB + " SET ID='" + id + "',"+
									"PW='" + pw + "'," +
									"NAME='" + name + "' WHERE ID=BINARY('" +
									uID + "')";
		}
		return sql;
	}

}
