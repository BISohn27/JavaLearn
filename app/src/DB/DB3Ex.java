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
			System.out.println("데이터베이스 드라이버 로딩 성공!");
			conn = DriverManager.getConnection(url, "root","java");
			System.out.println("데이터베이스 연결 성공!");
			String sql = "create table DBTEST(ID varchar(10))";            //oracle varchar varchar2(가변성, 길이 변경 가능)
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println("데이터베이스 드라이버 로딩 실패!");		
		}
	}
}
