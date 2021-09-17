package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEx {

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
			//String sql = "create table DBTEST(ID varchar(10))";            //oracle varchar varchar2(가변성, 길이 변경 가능)
			stmt = conn.createStatement();
			String sql = insert();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "성공" : "실패";
			System.out.println(msg);
		}catch(Exception e) {
			System.out.println("데이터베이스 드라이버 로딩 실패!");		
		}finally {
			try {
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	/**
	 * DATA INSERT
	 * @return sql
	 */
	public static String insert() {
		Scanner scan = new Scanner(System.in);
		System.out.println("DBTEST 테이블에 값 입력하기");
		System.out.print("ID : ");
		String id = scan.next();
		String sql = "insert into DBTEST values('"+ id + "')";
		return sql;
	}
//	public static String delete() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("DBTEST 테이블에 값 삭제하기");
//		System.out.print("ID : ");
//		String num = scan.next();
//		String sql = "delete from DBTEST where num=2";
//		return sql;
//	}
}

//oracle
//String sql = "CREATE TABLE DBTEST3(ID VARCHAR2(10), PW VARCHAR(10), AGE NUMBER, CRE_DATE DATE)"
//String sql = "INSERT INTO DBTEST3 VALUES('ABC','123',10,SYSDATE)
