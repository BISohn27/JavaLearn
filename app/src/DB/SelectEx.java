package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SelectEx {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn = null;
		Statement stmt = null;
		//db���� �Ѳ����� �Ѿ� �� �����Ͱ� ����Ǿ� �ִ� ��ü
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","java");
			stmt = conn.createStatement();
			String sql = select(1);
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();
			//rs.next()�� row�� ������ŭ iterate�ȴ�.-> ���� row(ó�� ����Ȱ ������ �ƹ��͵� ��Ī���� �ʴ� �Ϳ��� ����)�� �����͸� �ű�� ����
			while(rs.next()) {
//				//1�� column���� ������ �����´�.
//				//index number�� �ְų� ���� column�̸��� �ְų�
//				System.out.print("ID : " + rs.getString(1));
//				System.out.print(", PW : " + rs.getString(2));
//				System.out.println(", NAME : " + rs.getString(3));
//				for(int i = 1; i<= columns; i++)
//					System.out.print(rs.getString(i) + "/t");
				System.out.println();
				for(int i =1; i<=columns; i++)
					System.out.print(rsmd.getColumnName(i)+"\t");
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
	/*
	 *	SELECT
	 * 	@return SQL
	 */
	public static String select() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �̸��� �Է��ϼ���.> ");
		String column = scan.next();
		System.out.print("�˻��ϰ��� �ϴ� �����͸� �Է��ϼ���.> ");
		String dataName = scan.next();
		//*�ڸ����� COLUMN �̸��� �� �� �ִ�.
		//SELECT ID FROM DBTEST -> ID�� �����ؿͶ�
		String sql = "SELECT * FROM DBTEST2 WHERE " + column + "='" + dataName+ "'";
		return sql;
	}
	public static String select(int number) {
		//*�ڸ����� COLUMN �̸��� �� �� �ִ�.
		//SELECT ID FROM DBTEST -> ID�� �����ؿͶ�
		String sql = "SELECT * FROM DBTEST2";
		return sql;
	}
}
