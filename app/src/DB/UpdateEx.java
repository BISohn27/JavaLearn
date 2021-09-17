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
			System.out.println("DB연결 성공!");
			stmt = conn.createStatement();
			// UPDATE 문
			String sql = update(1,2);
			int result = stmt.executeUpdate(sql);
			System.out.println(result > -1 ? "성공" : "실패");
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
	// 데이터 베이스 명령어 수정이 일어나는 메소드
	public static String update() {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("ID : ");
//		String id = scan.next();
//		System.out.print("PW : ");
//		String pw = scan.next();
		// DBTEST를 SET(수정) COLUMN ID를 ''로 수정 <- COLUMN ID에 속한 모든 ROW가 수정됨. 특정된 회원 조건이 없기
		// 때문에
		// String sql = "UPDATE DBTEST SET ID='ABC'";
		// SQL 문에서 WHERE은 조건문을 수행하기 위한 문구
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
