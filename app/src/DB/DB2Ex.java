package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB2Ex {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		try {
			Class.forName(driver);
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");
			conn = DriverManager.getConnection(url, "root","java");
			System.out.println("�����ͺ��̽� ���� ����!");
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");		
		}
	}

}
