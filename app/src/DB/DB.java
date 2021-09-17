package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","java");
			stmt = conn.createStatement();
			
			boolean check = true;
			int menu;
			int db;
			String sql = "";
			while(check) {
				System.out.println("���Ͻô� ����� �����ϼ���.");
				System.out.print("���� (������ �Է��� 1, ������ ������ 2, ������ ������ 3)> ");
				menu = new Scanner(System.in).nextInt();
				System.out.print("���Ͻô� DB ����(1~3)> ");
				db = new Scanner(System.in).nextInt();
				switch(menu) {
				case 1:
					sql = insert(db);
					check = false;
					break;
				case 2:
					sql = update(db);
					check = false;
					break;
				case 3:
					sql = delete(db);
					check = false;
					break;
				default:
					System.out.println("1~3������ ���� �� �ϳ��� �Է��� �ּ���");
				}
			}
			int result = stmt.executeUpdate(sql);
			System.out.println(result >-1 ? "����" : "����");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	static String update(int db) {
		String sql = "";
		switch(db) {
		case 1:
		case 2:
		case 3:
		}
		return sql;
	}
	
	static String delete(int db) {
		String sql = "";
		switch(db) {
		case 1:
		case 2:
		case 3:
		}
		return sql;
	}
	
	static String insert(int db) {
		String sql = "";
		String id = "";
		String pw = "";
		String name = "";
		int age;
		Scanner scan = new Scanner(System.in);
		switch(db) {
		case 1:
			System.out.print("ID : ");
			id = scan.next();
			sql = "INSERT INTO DBTEST VALUES('"+id+"')";
			break;
		case 2:
			System.out.print("ID : ");
			id = scan.next();
			System.out.print("PW : ");
			pw = scan.next();
			System.out.print("NAME : ");
			name = scan.next();
			sql = "INSERT INTO DBTEST2 VALUES('"+id+"','"+pw+"','"+name+"')";
			break;
		case 3:
			System.out.print("ID : ");
			id = scan.next();
			System.out.print("PW : ");
			pw = scan.next();
			System.out.print("AGE : ");
			age = scan.nextInt();
			sql = "INSERT INTO DBTEST3 VALEUS('"+id+"','"+pw+"',"+age+",NOW())";
			break;
		}
		return sql;
	}
	
//	public static String 6
}
