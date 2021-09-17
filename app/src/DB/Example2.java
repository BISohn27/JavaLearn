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
			System.out.println("드라이버 연결 성공");
			conn = DriverManager.getConnection(url,"root", "java");
			System.out.println("데이터 연결 성공");
			stmt = conn.createStatement();
			try {
				stmt.executeUpdate("create table DBTEST3(ID varchar(10), PW varchar(15), AGE integer, CRE_DATE datetime)");
			}catch(Exception e) {
				System.out.println("이미 테이블이 존재합니다.");
				System.out.println();
			}
			String result = stmt.executeUpdate(insert()) > -1 ? "성공": "실패";
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("데이터 연결 실패");
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
		System.out.print("DBTEST3 테이블에 입력할 ID : ");
		String id = scan.next();
		System.out.print("DBTEST3 테이블에 입력할 PW : ");
		String pw = scan.next();
		System.out.print("DBTEST3 테이블에 입력할 AGE : ");
		int age = scan.nextInt();
		
		String sql = "insert into DBTEST3 values('"+id +"','" + pw+"'," + age + ", NOW())";
		return sql;
	}
}
