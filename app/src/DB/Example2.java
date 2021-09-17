package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			System.out.println("����̹� ���� ����");
			conn = DriverManager.getConnection(url,"root", "java");
			System.out.println("������ ���� ����");
			stmt = conn.createStatement();
			try {
				stmt.executeUpdate("create table DBTEST3(ID varchar(10), PW varchar(15), AGE integer, CRE_DATE datetime)");
			}catch(Exception e) {
				System.out.println("�̹� ���̺��� �����մϴ�.");
				System.out.println();
			}
			String result = stmt.executeUpdate(insert()) > -1 ? "����": "����";
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("������ ���� ����");
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String insert() {
		Scanner scan = new Scanner(System.in);
		System.out.print("DBTEST3 ���̺� �Է��� ID : ");
		String id = scan.next();
		System.out.print("DBTEST3 ���̺� �Է��� PW : ");
		String pw = scan.next();
		System.out.print("DBTEST3 ���̺� �Է��� AGE : ");
		int age = scan.nextInt();
		
		String sql = "insert into DBTEST3 values('"+id +"','" + pw+"'," + age + ", NOW())";
		return sql;
	}
}
