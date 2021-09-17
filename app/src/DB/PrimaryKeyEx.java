package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class PrimaryKeyEx {

	/*
	 * 	PRIMARY KEY
	 * 	PRIMARY KEY 제약 조건을 설정하면, 해당 필드는 NOT NULL과 UNIQUE
	 * 	제약 조건의 특징을 모두 가집니다.
	 * 	따라서 이 제약 조건이 설정된 필드는 NULL 값을 가질 수 없으며,
	 * 	또한 중복된 값을 가져서도 안 됩니다.
	 * 	이러한 PRIMARY KEY 제약 조건을 기본 키라고 합니다.
	 * 	UNUQUE는 한 테이블의 여러 필드에 설정할 수 있지만, PRIMARY KEY는 테이블 당
	 * 	오직 하나의 필드에만 설정할 수 있습니다.
	 * 	PRIMARY KEY 제약 조건은 테이블의 데이터를 쉽고 빠르게 찾도록
	 * 	도와주는 역할을 합니다.
	 * 
	 * 	-> [테이블 생성]
	 * 		CREATE TABLE TEST3(
	 * 				ID		VARCHAR(10) PRIMARY KEY,
	 * 				PW		VARCHAR(30),
	 * 				NAME	VARCHAR(30,
	 * 				MDATE	DATE,
	 * 				AGE		INT
	 */
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","java");
			stmt = conn.createStatement();
			String sql = select();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			while(rs.next()) {
			for(int i =1; i<=cnt; i++)
				System.out.print(rs.getString(i) + "   ");
			System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				if(rs != null) rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * DATA INSERT
	 * @return sql
	 */
	static String insert() {
		String sql = "INSERT INTO TEST3(ID,PW) VALUES('ABC','123')";
		return sql;
	}
	
	/**
	 * DATA SELECT
	 * @return sql
	 */
	static String select() {
		String sql = "SELECT * FROM TEST3";
		return sql;
	}
}
