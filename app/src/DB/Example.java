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
			//드라이버 연결
			Class.forName(driver);
			System.out.println("드라이버 연결 성공");
			//mysql 서버와 연결
			conn = DriverManager.getConnection(url, "root", "java");
			System.out.println("MySQL 계정 연결 성공");
			//명령문 전달할 인스턴스 생성
			stmt = conn.createStatement();
			//스키마 안에 테이블 객체 형성
			//만약 만들어져 있으면 예외 처리로 빠져 나옴
			try {
			stmt.executeUpdate("create table DBTEST2(ID varchar(10), PW varchar(15), NAME varchar(10))");
			}catch(Exception e) {
				System.out.println("테이블이 이미 만들어져 있습니다.\n");
			}
			//아이디 비밀번호 이름을 명령문으로 만들어 주는 메소드 실행
			String result = stmt.executeUpdate(insert()) > -1 ? "성공" : "실패";
			System.out.println(result);
		}catch(Exception e) {
			System.out.print("데이터 연결 실패");
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
		System.out.print("DBTEST2 테이블에 입력할 ID : ");
		String id = new Scanner(System.in).next();
		System.out.print("DBTEST2 테이블에 입력할 PW : ");
		String pw = new Scanner(System.in).next();
		System.out.print("DBTEST2 테이블에 입력할 Name : ");
		String name = new Scanner(System.in).next();
		String sql = "insert into DBTEST2(ID,PW,NAME) values('" + id + "','" + pw + "','" + name + "')";
		return sql;
	}
}
