package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection conn = null;
		Statement stmt = null;
		try {
			//����̹� ����
			Class.forName(driver);
			System.out.println("����̹� ���� ����");
			//mysql ������ ����
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("MySQL ���� ���� ����");
			//��ɹ� ������ �ν��Ͻ� ����
			stmt = conn.createStatement();
			//��Ű�� �ȿ� ���̺� ��ü ����
			//���� ������� ������ ���� ó���� ���� ����
			try {
			stmt.executeUpdate("create table DBTEST2(ID varchar(10), PW varchar(15), NAME varchar(10))");
			}catch(Exception e) {
				System.out.println("���̺��� �̹� ������� �ֽ��ϴ�.\n");
			}
			//���̵� ��й�ȣ �̸��� ��ɹ����� ����� �ִ� �޼ҵ� ����
			String result = stmt.executeUpdate(insert()) > -1 ? "����" : "����";
			System.out.println(result);
		}catch(Exception e) {
			System.out.print("������ ���� ����");
		}finally{
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}
	}
	public static String insert() {
		System.out.print("DBTEST2 ���̺� �Է��� ID : ");
		String id = new Scanner(System.in).next();
		System.out.print("DBTEST2 ���̺� �Է��� PW : ");
		String pw = new Scanner(System.in).next();
		System.out.print("DBTEST2 ���̺� �Է��� Name : ");
		String name = new Scanner(System.in).next();
		String sql = "insert into DBTEST2(ID,PW,NAME) values('" + id + "','" + pw + "','" + name + "')";
		return sql;
	}
}
